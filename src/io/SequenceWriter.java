package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by neukamm on 05.05.17.
 */
public class SequenceWriter {


    private final String outfolder;
    private final PrintWriter writer;


    public SequenceWriter(String pathOutFolder) throws FileNotFoundException, UnsupportedEncodingException {
        this.outfolder = pathOutFolder;
        this.writer = new PrintWriter(this.outfolder + File.separator + "sequence.fasta", "UTF-8");
        this.writer.println(">test_sequence");
    }

    public void write(String base) {
        this.writer.print(base);

    }

    public void close(){
        writer.close();
    }
}
