package calculations;

import java.util.HashMap;

/**
 * Created by neukamm on 05.05.17.
 */
public class SNPFinder {

    private final StrangeRegions strangeRegions;
    private final VCFInformations vcfInformations;
    private HashMap<Integer, Integer> region_snps;

    public SNPFinder(VCFInformations vcfInformations, StrangeRegions strangeRegions){
        this.vcfInformations = vcfInformations;
        this.strangeRegions = strangeRegions;
        this.region_snps = new HashMap<>();
    }

    public void findNumberOfSNPs(){
        int i = 0;
        for(int[] region : strangeRegions.getRegions()){
            int start = region[0];
            int end = region[1];

            int numberOfSNPs = 0;
            for(int pos : vcfInformations.getPos_snp().keySet()){
                if(pos > start && pos < end){
                    numberOfSNPs++;
                }
            }

            region_snps.put(i, numberOfSNPs);
            i++;
        }
    }

    public StrangeRegions getStrangeRegions() {
        return strangeRegions;
    }

    public VCFInformations getVcfInformations() {
        return vcfInformations;
    }

    public HashMap<Integer, Integer> getRegion_snps() {
        return region_snps;
    }
}
