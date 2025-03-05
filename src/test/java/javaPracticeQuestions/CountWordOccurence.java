package javaPracticeQuestions;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CountWordOccurence {
    public static void countWordOccurence(String str){
        String [] words = str.toLowerCase().split("\\s+");
        HashMap<String,Integer>wordMap = new HashMap<>();
        for(String word : words){
            word = word.replaceAll("[^a-zA-Z0-9]","");
            wordMap.put(word,wordMap.getOrDefault(word,0)+1);
        }

        System.out.println("Word counts are as follows");
        for(Map.Entry<String,Integer> entry : wordMap.entrySet()){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
    }

    public static void main(String[] args) {
        countWordOccurence("Hello my name is shubham and my other name is also shubham hello hi");
    }
}
