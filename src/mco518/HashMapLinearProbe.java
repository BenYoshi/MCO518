package mco518;

/**
 * @author Benny Ioschikhes
 */
public class HashMapLinearProbe {

    private int[] backingArray;

    public HashMapLinearProbe(int... numbers) {
        backingArray = new int[numbers.length];
        int index;
        
        for (int number : numbers) {
            index = getIndex(number);
            backingArray[index] = number;
        }
    }

    private int getIndex(int number) {
        int index;
        
        for (int i = 0; i < backingArray.length; i++) {
            index = ((number % backingArray.length) + i) % backingArray.length;
            if (backingArray[index] == 0)
                return index;
        }

        return -1;
    }
}