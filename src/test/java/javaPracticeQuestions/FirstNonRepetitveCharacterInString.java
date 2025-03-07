package javaPracticeQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepetitveCharacterInString {
    public static char firstNonRepetitivechar(String str){
        Map<Character,Integer> charCount = new LinkedHashMap<>();
        for(char ch : str.toCharArray()){
            charCount.put(ch,charCount.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer>entry : charCount.entrySet()){
            System.out.println("Key : "+entry.getKey()+" --> "+"Value : "+entry.getValue());
        }
        for(Map.Entry<Character,Integer>entry : charCount.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return '\0';
     }

    public static void main(String[] args) {
        String input = "abc";
        char output = firstNonRepetitivechar(input);

        if(output!='\0'){
            System.out.println("First non repetitive char "+output);
        }else {
            System.out.println("No non repetitive char found");
        }
    }
}
