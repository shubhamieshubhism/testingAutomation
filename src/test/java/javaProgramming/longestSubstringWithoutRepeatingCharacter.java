package javaProgramming;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class longestSubstringWithoutRepeatingCharacter {
    public static String longestsubstringwtrepeatingchar(String s){
        int n = s.length();
        int maxLength =0;
        StringBuilder result = new StringBuilder();
        Set<Character> charSet = new HashSet<>();
        int left=0;
        for(int right = 0 ; right<n ; right++){
            if(!charSet.contains(s.charAt(right))){
                charSet.add(s.charAt(right));

                maxLength=Math.max(maxLength,right-left+1);
            }else{
                while(charSet.contains(s.charAt(right))){
                    charSet.remove(s.charAt(left));
                    left++;
                }
            }
            charSet.add(s.charAt(right));
        }
        //return maxLength;
        return charSet.toString();
    }

    public static String lst(String str){
        int maxLen=0;
        int n = str.length();
        Set<Character> charSet = new LinkedHashSet<>();
        int left =0;
        for(int right=0;right<n;right++){
            if(!charSet.contains(str.charAt(right))){
                charSet.add(str.charAt(right));
                maxLen=Math.max(maxLen,right-left+1);
            }else{
                while(charSet.contains(str.charAt(right))){
                    charSet.remove(str.charAt(left));
                    left++;
                }
            }
            charSet.add(str.charAt(right));
        }
        return charSet.toString();

    }

    public static void main(String[] args) {
        String input = "xyzxyabcx";
        String output = lst(input);
        System.out.println(output);

    }
}
