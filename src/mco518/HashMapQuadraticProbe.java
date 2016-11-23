package mco518;

/**
 * @author Benny Ioschikhes
 */
public class HashMapQuadraticProbe {
    
    private final int[] backingArray;

    public HashMapQuadraticProbe(int... numbers) {
        backingArray = new int[numbers.length];

        for (int number : numbers) {
            int index = getIndex(number);
            backingArray[index] = number;
        }
    }
    
    private int getIndex(int number) {
        int index;
        int c1 = 1, c2 = 2;
        
        for (int i = 0; i < backingArray.length; i++) {
            index = ((number + c1 * i + c2 * ((int) Math.pow(i, 2)))) 
                    % (backingArray.length);
            if (backingArray[index] == 0)
                return index;
        }

        return -1;
    }
}
