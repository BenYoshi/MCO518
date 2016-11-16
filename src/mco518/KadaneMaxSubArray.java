package mco518;

/**
 * @author Benny Ioschikhes
 */
public class KadaneMaxSubArray {

    public static int findMaxSubArray(int[] full) {
        int sumFinal = 0;
        int maxFinal = 0;
        for (int j = 0; j < full.length; j++) {
            sumFinal = localMax(full, j);
            if (sumFinal > maxFinal)
                maxFinal = sumFinal;
        }

        return maxFinal;
    }
    
    private static int localMax(int[] full, int sublength) {
        int sum = 0;
        int max = 0;
        
        for (int i = sublength; i >= 0; i--) {
            sum = sum + full[i];
            if (sum > max)
                max = sum;
        }
        
        sum = 0;
        return max;
    }
}
