package mco518;

import java.util.Arrays;

/**
 * @author Benny Ioschikhes
 */
public class HashMapDoubleHash {
    private int[] backingArray;

    public HashMapDoubleHash(int... numbers) {
        backingArray = new int[numbers.length];

        for (int number : numbers) {
            int index = getIndex(number);

            backingArray[index] = number;
        }
    }
    
    private int getIndex(int number) {
        int index;
        
        for (int i = 0; i < backingArray.length; i++) {
            index = (hashOne(number) + i * hashTwo(number)) % (backingArray.length);
            if (backingArray[index] == 0)
                return index;
        }

        return -1; // blows up
    }

    private int hashOne(int number) {
        return number % backingArray.length;
    }

    private int hashTwo(int number) {
         return (int) Math.floor((number + 1) / 2) % backingArray.length;
    }
}
