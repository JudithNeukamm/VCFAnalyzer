package blast;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by neukamm on 06.05.17.
 *
 * Call
 *
 *      xjc -d src -p blast -dtd "http://www.ncbi.nlm.nih.gov/dtd/NCBI_BlastOutput.dtd"
 *
 * in Code repository to generate all necessary classes needed for BLAST search.
 */


public class CallBlast
{
    private String blastAllPath="/path/ncbi/build/blastall";
    private String blastDB="/path2b/testDB";


    public blast.BlastOutput run(String name,String sequence) throws IOException
    {
        File fasta=File.createTempFile("blast", ".fa");
        File blast=File.createTempFile("blast", ".xml");
        try
        {
            PrintWriter out=new PrintWriter(fasta);
            out.println(">"+name);
            out.println(sequence.replaceAll("[0-9 \t\n\r]",""));
            out.flush();
            out.close();


            ProcessBuilder pb = new ProcessBuilder(
                    this.blastAllPath,
                    "-p","blastn",
                    "-d",blastDB,
                    "-m","7",
                    "-i",fasta.getAbsolutePath(),
                    "-o",blast.getAbsolutePath()
            );
            Process proc = pb.start();
            if(proc.waitFor()!=0) throw new RuntimeException("error occured");
            JAXBContext jc = JAXBContext.newInstance("blast");

            Unmarshaller u = jc.createUnmarshaller();
            u.setSchema(null);



            /** read the result */

            return  (blast.BlastOutput)u.unmarshal(blast);

        }
        catch(Exception err)
        {
            throw new RuntimeException(err);
        }
        finally
        {
            blast.delete();
            fasta.delete();
        }
    }


}