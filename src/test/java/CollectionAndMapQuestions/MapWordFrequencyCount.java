package CollectionAndMapQuestions;

import java.util.HashMap;

public class MapWordFrequencyCount {

    public static void countWordFrequency(String sentence){
        String [] words = sentence.toLowerCase().split("\\s+");
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        for(String word : words){
            wordCountMap.put(word,wordCountMap.getOrDefault(word,0)+1);
        }
        System.out.println("Word frequencies : "+wordCountMap);
    }

    public static void main(String[] args) {
        String input = "java is java shubham Shubham Have Has has Had";
        countWordFrequency(input);
    }
}
