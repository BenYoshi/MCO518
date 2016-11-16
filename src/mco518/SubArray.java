package mco518;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Benny Ioschikhes
 */
public class SubArray {

    public static boolean isSubArrayForLoop(String[] subArray, String[] array) {
        int subArrayHash = Arrays.hashCode(subArray);

        for (int i = 0; i < array.length - subArray.length; i++)
            if (subArrayHash == Arrays.hashCode(Arrays.copyOfRange(array, 
                    i, i + subArray.length)))
                return true;
            
        return false;
    }

    public static boolean isSubArrayHashMap(String[] subArray, String[] array) {
        HashMap hashmap = new HashMap();
        int value = 0;

        for (int i = 0; i < array.length - (subArray.length - 1); i++) {
            String[] arrayToBeHashed = new String[subArray.length];

            for (int j = 0; j < subArray.length; j++)
                arrayToBeHashed[j] = array[i + j];
                
            hashmap.put(Arrays.hashCode(arrayToBeHashed), value++);
        }

        if (hashmap.get(Arrays.hashCode(subArray)) != null)
            return true;
        else
            return false;
    }
}
