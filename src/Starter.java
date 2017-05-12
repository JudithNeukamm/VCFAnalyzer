import threading.MultiThread;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Starter {

    private static int threads=2;
    private static String path_input;
    private static List<Thread> thread_list;
    private static String path_output;


    public static void main(String[] args) throws Exception {
        // args = file path to vcf file
        if(args.length != 0){

            // parse command
            for (int i = 0; i < args.length; i++) {
                switch (args[i]) {
                    case "-t":
                        threads = Integer.parseInt(args[i+1]);
                        break;
                    case "-i":
                        path_input = args[i+1];
                    case "-o":
                        path_output = args[i+1];
                        break;
                    default:
                        break;
                }
            }


            // test whether input path is directory or not
            File dir = new File(path_input);
            if(dir.isDirectory()){
                File[] directoryListing = dir.listFiles();
                // iterate over all files in directory
                if (directoryListing != null) {
                    int thread_number = 1;
                    thread_list = new ArrayList<>();

                    for (File path_vcf_file : directoryListing) {
                        if(path_vcf_file.getAbsolutePath().endsWith(".vcf")){

                            // read each file in thread
                            Thread t1 = new Thread(new MultiThread(path_vcf_file.getAbsolutePath(),
                                    path_output + File.separator + "Result_thread_" + thread_number),
                                    "Thread " + thread_number);
                            thread_list.add(t1);
                            t1.start();
                            thread_number++;

                        }
                    }
                }
            }


        } else {
            throw new Exception("No file given.");
        }



    }


}
