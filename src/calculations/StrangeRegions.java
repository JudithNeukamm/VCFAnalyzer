package calculations;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by neukamm on 05.05.17.
 */
public class StrangeRegions {

    private final VCFInformations vcfInformations;

    // region with start and end position
    private int[] region;

    // list with all regions
    private List<int[]> regions;

    public StrangeRegions(VCFInformations vcfInformations){
        this.vcfInformations = vcfInformations;
    }


    public void findRegions(){

        double mean = vcfInformations.getMeanCoverage();
        double stdev = vcfInformations.getStDevCOverage();

        HashMap<Integer, Double> coverage = vcfInformations.getCoverage();
        this.regions = new ArrayList<>();

        int posOld = 1;
        this.region = new int[2];
        this.region[0] = 1;
        for(int pos : coverage.keySet()){
            double cov = coverage.get(pos);


            if(cov > mean+stdev){

                if(pos-posOld < 10){
                    //System.out.println("Still in strange region");
                } else {
                    this.region[1] = posOld;
                    if((this.region[1] - this.region[0]) > 10)
                        this.regions.add(region);
                    this.region = new int[2];
                    this.region[0] = pos;
                }
                posOld = pos;
            }

        }

    }


    public VCFInformations getVcfInformations() {
        return vcfInformations;
    }

    public int[] getRegion() {
        return region;
    }

    public void setRegion(int[] region) {
        this.region = region;
    }

    public List<int[]> getRegions() {
        return regions;
    }

    public void setRegions(List<int[]> regions) {
        this.regions = regions;
    }
}
