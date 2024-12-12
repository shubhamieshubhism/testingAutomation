package javaProgramming;

import java.util.LinkedHashSet;

public class removeDuplicates {

    public static String removedups(String str){
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for(char ch :str.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "ssbbhihoiggjf";
        String result = removedups(input);
        System.out.println(result);
        System.out.println("Changing for git commit");






        }
    }

