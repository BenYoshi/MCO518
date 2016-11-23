package mco518;

/**
 * O(n)
 * @author Benny Ioschikhes
 */
public class GCDEuclid {
    public static int getGCDEuclid(int firstNumber, int secondNumber) {
        if (secondNumber == 0)
            return firstNumber;
        else
            return getGCDEuclid(secondNumber, firstNumber % secondNumber);
    }
}