package leetCode;

public class Que9 {
    /*
    * 9. Palindrome Number
Easy
Topics
Companies
Hint
Given an integer x, return true if x is a palindrome, and false otherwise.



Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

    * */
    public static boolean isPalilndrome(int x){
        if(x<0){
            return false;
        }

        int reverse =0;
        int xcopy = x;
        while(x>0){
            reverse = (reverse*10)+(x%10);
            x/=10;
        }
        return reverse==xcopy;
    }

    public static boolean isPallindrome(int x){
        if(x<0){
            return false;
        }
        StringBuilder s = new StringBuilder(String.valueOf(x));
        String original = s.toString();
        return original.equals(s.reverse().toString());
    }

    public static boolean isPallindrome(String str){

        StringBuilder s = new StringBuilder(str);
        String original = s.toString();
        return original.equals(s.reverse().toString());
    }

    public static void findPalindrome(String str){
        str=str.toLowerCase().replaceAll(" ","");
        for(int i =0 ; i<str.length();i++){
            for (int j=i+1;j<=str.length();j++){
                String subString = str.substring(i,j);
                if(isPallindrome(subString) && subString.length()>2){
                    System.out.println(subString);
                }
            }
        }
    }

    public static void main(String[] args) {
//        boolean out = isPallindrome("racecars");
//        System.out.println("Is the number palindrome --> "+out);
        String input = "madam noon wow racecar isit";
        String [] words = input.toLowerCase().split("\\s+");
        /*for(String word : words){
            if(isPallindrome(word)){
                System.out.println(word);
            }
        }*/

        findPalindrome(input);
    }
}
