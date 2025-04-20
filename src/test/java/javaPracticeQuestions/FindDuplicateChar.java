package javaPracticeQuestions;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateChar {

    public static void findDuplicateCharacter(String str){
        Map<Character,Integer>charCount = new HashMap<>();
        for(char ch : str.toCharArray()){
             charCount.put(ch,charCount.getOrDefault(ch,0)+1);
        }
        charCount.forEach((key,value) ->{
            if(value==2){
                System.out.println(key + " --> "+value);
            }
                }
                );
    }

    public static void main(String[] args) {
        String str = "Successfullycompleeette";
        findDuplicateCharacter(str);
    }
}
