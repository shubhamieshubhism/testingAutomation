package practiceing_java;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class wordCount {
    private static void countOccurenceOfWord(String str){
        String[] words = str.toLowerCase().split("\\s+");
        HashMap<String,Integer> wordmap = new HashMap<>();
        for(String word : words){
            word.replaceAll("[^a-zA-Z]","");//remove punctuations
            if(!word.isEmpty()){
                wordmap.put(word,wordmap.getOrDefault(word,0)+1);
            }
        }
        System.out.println("Word Occurrence");
        for(Map.Entry<String,Integer>entry : wordmap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        String input = "java is good, Shubham is good, Java and shubham Both are GOOD";
        countOccurenceOfWord(input);
    }
}
