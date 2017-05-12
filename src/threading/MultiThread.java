package threading;

import calculations.Analyzer;

import java.io.*;

/**
 * Created by neukamm on 12.05.17.
 */
public class MultiThread implements Runnable{

    private String filepath;
    private String outfolder;

    public MultiThread(String filepath, String outfolder){
        this.filepath = filepath;
        File outdir = new File(outfolder);
        //
        if (!outdir.exists()) {
            try{
                outdir.mkdir();
            }
            catch(SecurityException se){
                System.out.println(se);
            }
        }
        this.outfolder = outfolder;
    }

    public void run() {

        Analyzer analyzer = new Analyzer();
        try {
            long currtime_prior_execution = System.currentTimeMillis();
            analyzer.analyze(this.filepath, this.outfolder);
            printRuntime(currtime_prior_execution, this.filepath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    private void printRuntime(long currtime_prior_execution, String filepath) {

        // print runtime
        long currtime_post_execution = System.currentTimeMillis();
        long diff = currtime_post_execution - currtime_prior_execution;
        long runtime_s = diff / 1000;
        if(runtime_s > 60) {
            long minutes = runtime_s / 60;
            long seconds = runtime_s % 60;
            System.out.println("Runtime of analyzing file " + new File(filepath).getName() + " was: " + minutes + " minutes, and " + seconds + " seconds.");
        } else {
            System.out.println("Runtime of analyzing file " + new File(filepath).getName() +" was: " + runtime_s + " seconds.");
        }
    }

}