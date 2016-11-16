package mco518;

import java.util.HashSet;

/**
 * @author Benny Ioschikhes
 */
public class UniqueChars {
    private static boolean isUniqueCharsHomemade(String str) {
        HashSet<Character> unique = new HashSet<Character>();
        
        for (int i = 0; i < str.length(); i++)
            unique.add(str.charAt(i));
        
        if (unique.size() != str.length())
            return false;
        
        return true;
    }

    private static boolean isUniqueCharsBitShifts(String str) {
        int checker = 0;
        
        for (int i = 0; i < str.length(); i++) {
            
            int val = str.charAt(i) - 'a';
            
            if ((checker & (1 << val)) > 0)
                return false;
            
            checker |= (1 << val);
        }
        
        return true;
    }
}
