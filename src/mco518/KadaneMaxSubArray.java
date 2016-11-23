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
            System.out.println("localMax of " + j +" is:" + sumFinal);
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
    
    public static int findMaxSubArray2(int[] inputArray) {

        int maxSum = Integer.MIN_VALUE;

        int cumulativeSum = 0;

        for (int currentIndex = 0; currentIndex < inputArray.length; currentIndex++) {

            int eachArrayItem = inputArray[currentIndex];

            cumulativeSum += eachArrayItem;

            if (cumulativeSum > maxSum) {
                System.out.println(cumulativeSum);
                maxSum = cumulativeSum;
            } else if (cumulativeSum < 0)
                cumulativeSum = 0;
        }

        System.out.println("Max sum: " + maxSum);
        return maxSum;

    }
}
