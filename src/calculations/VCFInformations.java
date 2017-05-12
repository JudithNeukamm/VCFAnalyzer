package calculations;

import htsjdk.variant.variantcontext.Allele;

import java.util.HashMap;
import java.util.List;

/**
 * Created by neukamm on 05.05.17.
 */
public class VCFInformations {

    private HashMap<Integer, Double> coverage;
    private double stDevCOverage = 0.0;
    private double meanCoverage = 0.0;
    private HashMap<Integer, List<Allele>> pos_snp;
    private HashMap<int[], String> region_sequence;
    private String sequence;

    public VCFInformations(){
        this.coverage = new HashMap<>();
        this.pos_snp = new HashMap<>();
        this.region_sequence = new HashMap<>();
        this.sequence = "";
    }

    public void addSNP(int pos, List<Allele> allele){
        this.pos_snp.put(pos, allele);

    }

    private void addSequence(int[] region, String sequence){
        this.region_sequence.put(region, sequence);

    }

    public void addCoverageValue(double cov, int pos){
        this.coverage.put(pos, cov);
    }

    public HashMap<Integer, Double> getCoverage() {
        return coverage;
    }

    public void setStDevCOverage(double stDevCOverage) {
        this.stDevCOverage = stDevCOverage;
    }

    public void setMeanCoverage(double meanCoverage) {
        this.meanCoverage = meanCoverage;
    }

    public double getStDevCOverage() {
        return stDevCOverage;
    }

    public double getMeanCoverage() {
        return meanCoverage;
    }

    public HashMap<Integer, List<Allele>> getPos_snp() {
        return pos_snp;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
}
