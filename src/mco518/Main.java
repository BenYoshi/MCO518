package mco518;

/**
 * @author Benny Ioschikhes
 */
public class Main {

    public static void main(String[] args) {
//        int[] array = {1, -3, 2, 1, -1};
        int[] array = {-1, 0, 1, 2, -4};
        
        System.out.println("maxSubArray: " + KadaneMaxSubArray.findMaxSubArray2(array));
    }
}
