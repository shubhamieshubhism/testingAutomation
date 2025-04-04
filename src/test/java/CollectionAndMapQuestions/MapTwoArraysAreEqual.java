package CollectionAndMapQuestions;

import java.util.HashMap;
import java.util.Map;

public class MapTwoArraysAreEqual {

    public static boolean areEqual(int[] arr1, int [] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }

        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int num : arr1){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        for(int num :arr2){
            if(!freqMap.containsKey(num)){
                return false;//element not found
            }
            freqMap.put(num,freqMap.get(num)-1);
            if(freqMap.get(num)==0){
                freqMap.remove(num); //remove key when count reaches zero
            }
        }
        return freqMap.isEmpty();
    }
}
