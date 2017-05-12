package io;

import calculations.SNPFinder;
import calculations.StrangeRegions;
import htsjdk.samtools.reference.FastaSequenceFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by neukamm on 05.05.17.
 */
public class OutputWriter {

    private final String outfolder;
    private FastaSequenceFile fastaSequenceFile;

    public OutputWriter(String pathOutFolder){
        this.outfolder = pathOutFolder;
    }

    public void writePositions(List<int[]> regions, SNPFinder snpFinder){
        try{
            PrintWriter writer = new PrintWriter(this.outfolder + File.separator + "positions.txt", "UTF-8");
            int i = 0;
            for(int[] region : regions){
                if(snpFinder.getRegion_snps().get(i) > 1) {
                    writer.println(region[0] + "\t" + region[1]);
                }
                i++;
            }

            writer.close();
        } catch (IOException e) {
            // do something
        }
    }



    public void writeStrangeRegionSequences(File sequenceFile, StrangeRegions strangeRegions) throws FileNotFoundException {

        // read reference file as indexed reference
        fastaSequenceFile = new FastaSequenceFile(sequenceFile, false);

        try{
            PrintWriter writer = new PrintWriter(this.outfolder + File.separator + "sequences_regions.fasta", "UTF-8");

            for(int[] region : strangeRegions.getRegions()){
                String sequence_region = fastaSequenceFile.getSubsequenceAt("ref", region[0], region[1]).getBaseString();
                writer.println(">region_"+region[0]+"_"+region[1]);
                writer.println(sequence_region);
            }

            writer.close();
        } catch (IOException e) {
            // do something
        }

    }

    public void writeStrangeRegionSequences(ArrayList<String> sequencesAtStrangeRegions) {
        try{
            PrintWriter writer = new PrintWriter(this.outfolder + File.separator + "sequences_regions.fasta", "UTF-8");

            int i = 0;
            for(String seq : sequencesAtStrangeRegions){
                writer.println(">region " + i);
                writer.println(seq);
                i++;
            }

            writer.close();
        } catch (IOException e) {
            // do something
        }
    }
}
