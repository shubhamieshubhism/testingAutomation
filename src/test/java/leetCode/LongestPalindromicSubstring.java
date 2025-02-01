package leetCode;

public class LongestPalindromicSubstring {
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left< right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String longestPalindromicSubString(String str){
        if(str.length()<=1){
            return str;
        }
        int maxLen = 0;
        String maxStr = str.substring(0,1);
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+maxLen; j <= str.length(); j++) {
                if(j-i>maxLen && isPalindrome(str.substring(i,j))){
                    maxLen=j-i;
                    maxStr = str.substring(i,j);
                }
            }
        }
        return maxStr;
    }


    public static void main(String[] args) {
        String input = "abcbadefed";
        String output = longestPalindromicSubString(input);
        System.out.println(output);
    }
}
