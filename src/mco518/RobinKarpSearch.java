package mco518;

/**
 * @author Benny Ioschikhes
 */
public class RobinKarpSearch {
    
    private static final int prime = 101;

    public static int searchForSubstring(String str, String subString) {
        char[] strCharArray = str.toCharArray();
        char[] subStringCharArray = subString.toCharArray();
        
        int subStrLength = subStringCharArray.length;
        int strLength = strCharArray.length;
        
        long subStrHash = createHash(subStringCharArray, subStrLength - 1);
        long strHash = createHash(strCharArray, subStrLength - 1);
        
        for (int index = 1; index <= strLength - subStrLength + 1; index++) {
            if (subStrHash == strHash && equals(strCharArray, index - 1, 
                    index + subStrLength - 2, subStringCharArray, 0, 
                    subStrLength - 1))
                return index - 1;
            if (index < strLength - subStrLength + 1)
                strHash = rollHash(strCharArray, index - 1, 
                        index + subStrLength - 1, strHash, subStrLength);
        }
        
        return -1;
    }

    private static long rollHash(char[] str, int oldIndex, int newIndex, 
            long oldHash, int patternLength) {
        long newHash = oldHash - str[oldIndex];
        newHash = newHash / prime;
        newHash += str[newIndex] * Math.pow(prime, patternLength - 1);
        return newHash;
    }

    private static long createHash(char[] str, int end) {
        long hash = 0;
        for (int i = 0; i <= end; i++)
            hash += str[i] * Math.pow(prime, i);
        return hash;
    }

    private static boolean equals(char str1[], int start1, int end1, 
            char str2[], int start2, int end2) {
        if (end1 - start1 != end2 - start2)
            return false;
        
        while (start1 <= end1 && start2 <= end2) {
            if (str1[start1] != str2[start2])
                return false;
            start1++;
            start2++;
        }
        
        return true;
    }
}
