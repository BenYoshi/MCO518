package mco518;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PSList {

    private ArrayList<Integer> psList;

    public PSList(int size) {
        psList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            Double primeDouble = Math.pow(i, 2);
            Double primePlusOneDouble = Math.pow((i + 1), 2);
            psList.add(primeDouble.intValue() + primePlusOneDouble.intValue());
        }
    }
    
    public PSList(BigInteger size) {
        psList = new ArrayList<>();

        for (int i = 0; i < size.intValue(); i++) {
            Double primeDouble = Math.pow(i, 2);
            Double primePlusOneDouble = Math.pow((i + 1), 2);
            psList.add(primeDouble.intValue() + primePlusOneDouble.intValue());
        }
    }

    public void soutPSList() {
        int count = 0;
        for (Integer squareNumber : psList) {
            count++;
            System.out.printf("%d^2 + (%d + 1)^2 = %d\n", count, count, squareNumber);
        }
    }

    public HashMap<Integer, List<Integer>> turnIntoModList() {
        HashMap<Integer, List<Integer>> squareModList =
                new HashMap<Integer, List<Integer>>();

        for (Integer ps : psList) {
            List<Integer> intList = new ArrayList<>();
            for (int i = 0; i < 200; i++) {
                int x = ps % (i + 1);
                if(!intList.contains(x)){
                    intList.add(x);
                }
            }
            squareModList.put(ps, intList);
        }
        System.out.println(squareModList);
        HashMap<HashMap<Integer, List<Integer>>, List<Integer>> hi;
        return squareModList;
    }
    
    public int turnIntoPhi(List<Integer> intList){
        return intList.size(); // STUB
    }
}
