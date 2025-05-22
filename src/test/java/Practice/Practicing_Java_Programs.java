package Practice;

import org.testng.annotations.Test;

import java.util.LinkedHashSet;

class Practicing_Java_Programs {
    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }
    public static boolean isPalindrome(int num) {
        String original = Integer.toString(num);
        String reverse = new StringBuilder(original).reverse().toString();
        return original.equals(reverse);
    }
    public static void main(String[] args) {
        String inputString = "madam";
        int inputNum = 12321;
        boolean stringoutput = isPalindrome(inputString);
        boolean numOutput = isPalindrome(inputNum);
        System.out.println("Is the string is palindrome : " + stringoutput);
        System.out.println("Is the int is palindrome : " + numOutput);
    }
}
class RempveDuplicates{
    public static String removeDuplicte(String str){
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

    public static void main(String[] args) {
        String input = "successfull";
        String output = removeDuplicte(input);
        System.out.println("Original input before removing duplicates : "+input);
        System.out.println("Output after removeing duplicates : "+output);
    }
}

