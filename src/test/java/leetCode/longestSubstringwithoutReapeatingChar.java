package leetCode;

import java.util.LinkedHashSet;

public class longestSubstringwithoutReapeatingChar {
    public static int LongestSubStringWithoutReapeatingChar(String str){
        int n = str.length();
        int left = 0;
        int maxLength = 0;
        LinkedHashSet<Character>charSet = new LinkedHashSet<>();
        for(int right = 0 ; right < n ; right++){
            if(!charSet.contains(str.charAt(right))){
                charSet.add(str.charAt(right));
                maxLength = Math.max(maxLength, right-left+1);
            }else{
                while(charSet.contains(str.charAt(right))){
                    charSet.remove(str.charAt(left));
                    left++;
                }
                charSet.add(str.charAt(right));
            }
        }
        return maxLength;
    }
    
    
    
}
