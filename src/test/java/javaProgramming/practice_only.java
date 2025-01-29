package javaProgramming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class practice_only {
    public static void main(String[] args) {
        String input = "mam your level is high at noon";
        String result = reverseTheString(input);
        System.out.println(result);


    }

    public static String removeDups(String str){
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        for(Character ch : str.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static String removedupswithloops(String str){
        StringBuilder result = new StringBuilder();
        for(int i =0 ; i<str.length();i++){
            char currentChar = str.charAt(i);
            boolean isDuplicate = false;
            for(int j = 0 ; j < result.length() ; j++){
                if(result.charAt(j)==currentChar){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    public static String reverseTheString(String str){
        StringBuilder reverse = new StringBuilder(str);
        return reverse.reverse().toString();
    }

    public static String reverseSpecificWord(String str,int index){
        String[] words = str.split(" ");
        try {
            if (str.length() >= index) {
                String indexWord = words[index];
                String reverseWord = new StringBuilder(indexWord).reverse().toString();
                words[index] = reverseWord;
            }
        }catch(Exception e){
            System.out.println("you have put index more than limit");
        }
        return String.join(" ",words);
    }
    public static boolean isPalindrome(String word){
        int left = 0;
        int right = word.length()-1;
        while(left<right){
            if(word.charAt(left)!=word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void findPalindrome(String str){
        int n = str.length();
        for(int i = 0 ; i <n ; i++){
            for(int j = i+1 ; j <= n ; j++){
                String substring = str.substring(i,j);
                if(isPalindrome(substring)){
                    System.out.println(substring);
                }
            }
        }
    }

    public static String reversewordsofstring(String str)
    {

        StringBuilder reverse = new StringBuilder();
        String[] word = str.split(" ");
        for (int i = word.length-1;i>=0;i--){
            reverse.append(word[i]);
            if(i!=0){
                reverse.append(" ");
            }
        }
        return reverse.toString();

    }



}
