package CollectionAndMapQuestions;

import org.testng.collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapsMostFrequentElement {
    public static int mostFrequentEle(int [] arr){

        Map<Integer,Integer> freqMap = new HashMap<>();
        int maxCOunt = 0;
        int mostFrequent = -1;

        for(int num : arr){
            int count = freqMap.getOrDefault(num,0)+1;
            freqMap.put(num,count);
            if(count>maxCOunt){
                maxCOunt=count;
                mostFrequent=num;
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        //int arr [] = {1,1,2,2,3,4,5,5,6,6,6,6,6,7};
        int [] arr = {};
        int output = mostFrequentEle(arr);
        System.out.println("The most frequent element : "+output);
    }
}
