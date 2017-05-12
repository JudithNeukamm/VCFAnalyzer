package io;

import calculations.StrangeRegions;
import calculations.VCFInformations;
import htsjdk.variant.variantcontext.Allele;
import htsjdk.variant.variantcontext.Genotype;
import htsjdk.variant.variantcontext.VariantContext;
import htsjdk.variant.vcf.VCFFileReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by neukamm on 05.05.17.
 */
public class VCFParser {

    private SequenceWriter sequenceWriter;
    private VCFInformations vcfInformations;
    private String sequence = "";
    private ArrayList sequencesAtStrangeRegions;

    public VCFParser(String path, VCFInformations vcfInformations, SequenceWriter sequenceWriter){
        System.out.println("Reading file : " + new File(path).getName());
        this.vcfInformations = vcfInformations;
        this.sequenceWriter = sequenceWriter;
        parse(path);
    }

    /**
     * Second constructor to parse VCF file second time to get
     * sequence of strange regions.
     *
     * @param VCFFile
     * @param strangeRegions
     */
    public VCFParser(File VCFFile, StrangeRegions strangeRegions){

        parseSequence(VCFFile, strangeRegions);

    }

    private void parseSequence(File vcfFile, StrangeRegions strangeRegions) {
        // read file into VCFFileReader from HTSJDK
        VCFFileReader vcfFileReader = new VCFFileReader(vcfFile);
        List<int[]> regions = strangeRegions.getRegions();
        List<Integer> starts = new ArrayList<>();
        List<Integer>  ends = new ArrayList<>();
        this.sequencesAtStrangeRegions = new ArrayList<>();
        String sequence_at_region = "";

        for(int i = 0; i < regions.size(); i++){
            starts.add(regions.get(i)[0]);
            ends.add(regions.get(i)[1]);
        }

        // iterate over entries
        Iterator iterator = vcfFileReader.iterator();
        while (iterator.hasNext()) {

            VariantContext variantContext = (VariantContext) iterator.next();

            if(starts.contains(variantContext.getStart())) {
                sequence_at_region += getCall(variantContext);


                while (!ends.contains(variantContext.getStart())){
                   variantContext = (VariantContext) iterator.next();
                    sequence_at_region += getCall(variantContext);
                }
                this.sequencesAtStrangeRegions.add(sequence_at_region);
                sequence_at_region="";
            }
        }
    }

    private void parse(String path) {
        // read file into VCFFileReader from HTSJDK
        VCFFileReader vcfFileReader = new VCFFileReader(new File(path));

        // iterate over entries
        Iterator iterator = vcfFileReader.iterator();
        while (iterator.hasNext()) {
            VariantContext variantContext = (VariantContext) iterator.next();

            // get base at position
            this.sequenceWriter.write(getCall(variantContext));

            // get coverage at that position, store information
            int cov = variantContext.getGenotypes().get(0).getDP();
            vcfInformations.addCoverageValue((double) cov, variantContext.getStart());

            // get SNP at position
            if (variantContext.getType() == VariantContext.Type.SNP) {

                for (Genotype genotypes : variantContext.getGenotypes()) {
                    List<Allele> alleles = genotypes.getAlleles();
                    vcfInformations.addSNP(variantContext.getStart(), alleles);
                }
            }
        }

        vcfInformations.setSequence(this.sequence);
    }






    private String getCall(VariantContext context) {
        Genotype genotype = context.getGenotype(0);
        // call position ONLY with coverage larger that 5
        if(genotype.getDP()>5){

            // if record has no AD information: return reference
            if(!genotype.hasAD()){
                return genotype.getAllele(0).getBaseString();


            } else {

                // get base that occurres at least at 80 % of the positions
                int[] occurrences = genotype.getAD();
                double[] percentages = new double[occurrences.length];
                String[] bases = new String[occurrences.length];

                for(int j = 0; j < context.getAlleles().size(); j++){
                    bases[j] = context.getAlleles().get(j).getBaseString();
                }


                for(int i = 0; i < occurrences.length; i++){
                    double perc = genotype.getAD()[i] / (double)genotype.getDP();
                    percentages[i] = Math.round(perc * 100.0) / 100.0;
                }

                for(int k = 0; k < percentages.length; k++){
                    if(percentages[k] > 0.8){
                        return bases[k];
                    }
                }

            }
        } else {
            return "N";
        }


        return "N";
    }

    public ArrayList getSequencesAtStrangeRegions() {
        return sequencesAtStrangeRegions;
    }
}
