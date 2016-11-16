package mco518;

/**
 * @author Benny Ioschikhes
 */
public class Nine20 {

    public int modExpBruteForce(int base, int exponent, int mod) {
        if (exponent < 0) {
            throw new RuntimeException("number cannot be negative");
        } else if (exponent == 0) {
            return 1 % mod;
        } else {
            int newBase = base;
            for (int i = 1; i < exponent; i++) {
                newBase *= base;
            }
            return newBase % mod;
        }
    }
    
//    // TODO needs work
//    public int modExpKhan(int base, int exponent, int mod) {
//        int a = 256;
//        int b = a << 1;
//    }

    public int modpow(int base, int exponent, int mod) {
        int returnValue = 1;

        for (int i = 0; i < exponent; i++) {
            returnValue = ((returnValue * base) % mod);
        }

        return returnValue;
    }
}
