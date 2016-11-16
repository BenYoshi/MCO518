package mco518;

/**
 * @author Benny Ioschikhes
 */
public class ModularExponentiation {

    public static int mEHomemade(int base, int exponent, int modulus) {
        if (modulus == 1)
            return 0;

        int result = 1;

        for (int i = 0; i < exponent; i++)
            result = (result * base) % modulus;

        return result;
    }
    
    public static int mEBitShifts(int base, int exponent, int modulus) {
        if (modulus == 1)
            return 0;
        
        int result = 1;
        base = base % modulus;

        while (exponent > 0) {
            if (exponent % 2 == 1)
                result = (result * base) % modulus;
            
            exponent = exponent >> 1;
            base = (base * base) % modulus;
        }
        
        return result;
    }
}
