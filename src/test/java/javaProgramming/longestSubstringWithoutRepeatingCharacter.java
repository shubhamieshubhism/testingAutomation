package javaProgramming;

import java.util.HashSet;
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

    public static void main(String[] args) {
        String input = "abcdabcdbb";
        String output = longestsubstringwtrepeatingchar(input);
        System.out.println(output);

    }
}
