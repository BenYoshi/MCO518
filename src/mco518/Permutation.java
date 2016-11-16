package mco518;

import java.util.Arrays;

/**
 * @author Benny Ioschikhes
 */
public class Permutation {
    
    private static boolean isPermutation(String strA, String strB) {
        if (strA.length() != strB.length())
            return false;

        int checker = 0;

        for (int i = 0; i < strA.length(); i++)
            checker ^= strA.charAt(i) ^ strB.charAt(i);

        return checker == 0;
    }

    private static boolean isPalindromePermutation(String str) {
        str = str.replaceAll("\\s+", "");

        boolean[] indexArray = new boolean[256];
        Arrays.fill(indexArray, true);

        int oddCount = 0;

        for (int i = 0; i < str.length(); i++) {
            int idx = (int) str.charAt(i);
            indexArray[idx] = !indexArray[idx];

            if (indexArray[idx])
                oddCount--;
            else
                oddCount++;
        }

        return (str.length() % 2 == 0) ? oddCount == 0 : oddCount == 1;
    }
}
