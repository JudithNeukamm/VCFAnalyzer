package calculations;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by neukamm on 05.05.17.
 */


public class Statistics
{
    double[] data;
    int size;

    public Statistics(HashMap<Integer, Double> pos_cov)
    {
        data = new double[pos_cov.size()];
        int i = 0;
        for(int key : pos_cov.keySet()) {
            data[i] = pos_cov.get(key);
            i++;
        }
        size = data.length;
    }

    public double getMean()
    {
        double sum = 0.0;
        for(double a : data)
            sum += a;
        return sum/size;
    }

    public double getVariance()
    {
        double mean = getMean();
        double temp = 0;
        for(double a :data)
            temp += (a-mean)*(a-mean);
        return temp/size;
    }

    public double getStdDev()
    {
        return Math.sqrt(getVariance());
    }

    public double median()
    {
        Arrays.sort(data);

        if (data.length % 2 == 0)
        {
            return (data[(data.length / 2) - 1] + data[data.length / 2]) / 2.0;
        }
        return data[data.length / 2];
    }
}


