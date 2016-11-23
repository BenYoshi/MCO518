package mco518;

import java.util.Arrays;

/**
 * O(n)
 * @author Benny Ioschikhes
 */
public class HornersRule {
    
    public static int calculateHash(String s, int x) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        String newString = new String(array);
        
        int hashValue = 0;

        for (int i = 0; i < newString.length(); i++)
            hashValue = x * hashValue + newString.charAt(i);

        return hashValue;
    }
}