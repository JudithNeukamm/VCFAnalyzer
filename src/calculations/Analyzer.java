package calculations;

import blast.*;
import io.OutputWriter;
import io.SequenceWriter;
import io.VCFParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

/**
 * Created by neukamm on 12.05.17.
 */
public class Analyzer {

    public Analyzer(){

    }

    public void analyze(String path_vcf_file, String outfolder) throws FileNotFoundException, UnsupportedEncodingException {

        SequenceWriter sequenceWriter = new SequenceWriter(outfolder);
        VCFInformations vcfInformations = new VCFInformations();
        VCFParser vcfParser = new VCFParser(path_vcf_file, vcfInformations, sequenceWriter);


        // calculate mean and standard deviation
        Statistics statistics = new Statistics(vcfInformations.getCoverage());
        vcfInformations.setStDevCOverage(statistics.getStdDev());
        vcfInformations.setMeanCoverage(statistics.getMean());

        // find regions where standard deviation is twice higher than coverage
        StrangeRegions strangeRegions = new StrangeRegions(vcfInformations);
        strangeRegions.findRegions();

        // find number of SNPs in the strange regions
        SNPFinder snpFinder = new SNPFinder(vcfInformations, strangeRegions);
        snpFinder.findNumberOfSNPs();

        //printRegions(strangeRegions, snpFinder);

        sequenceWriter.close();

        // write output
        //OutputWriter outputWriter = new OutputWriter(System.getProperty("user.dir"));
        OutputWriter outputWriter = new OutputWriter(outfolder);
        outputWriter.writePositions(strangeRegions.getRegions(), snpFinder);

        // get sequences of strange regions
        //File sequenceFile = new File(outfolder+"sequence.fasta");
        //outputWriter.writeStrangeRegionSequences(sequenceFile, strangeRegions);


        VCFParser parser2 = new VCFParser(new File(path_vcf_file), strangeRegions);
        outputWriter.writeStrangeRegionSequences(parser2.getSequencesAtStrangeRegions());


        // Do BLAST search for all regions

//        try {
//            CallBlast callBlast = new CallBlast();
//            blast.BlastOutput blast=callBlast.run("MYSequence","AAAGCCCGAAATTTACGAGAACCAGAGAGATACGTCGTTGGCCGATGA");
//            BlastOutputIterations iterations=blast.getBlastOutputIterations();
//            for(Iteration iteration:iterations.getIteration())
//            {
//                IterationHits hits=iteration.getIterationHits();
//                for(Hit hit:hits.getHit())
//                {
//                    System.out.println("def:"+hit.getHitDef());
//                    System.out.println("len:"+hit.getHitLen());
//                    System.out.println();
//                }
//            }
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }

    }


    private static void printRegions(StrangeRegions strangeRegions, SNPFinder snpFinder) {
        System.out.println("Regions with unusual high coverage: ");

        int i = 0;
        for(int[] region : strangeRegions.getRegions()){
            if(snpFinder.getRegion_snps().get(i) > 1){
                System.out.println("Region " + i + "\t" + region[0] + " to " + region[1]);
            }

            i++;
        }
    }
}
