package javaPracticeQuestions;

import io.cucumber.java.sl.In;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharacter {

    public static void removeDuplicaateChar(String str){
        HashMap<Character,Integer> charCount = new HashMap<>();
        for(char ch : str.toCharArray()){
            charCount.put(ch,charCount.getOrDefault(ch,0)+1);
        }
        System.out.println("The removed character are as follows");

        for(char ch : charCount.keySet()){
            if(charCount.get(ch)>1){
                System.out.println(ch+" --> "+charCount.get(ch)+" times");
            }
        }
    }

    public static String removeDuplicates(String str){
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        removeDuplicaateChar("successfull");
        String input = "successfullHitt";
        String output = removeDuplicates(input);
        System.out.println("removed Char from a string are --> "+output);
    }
}
