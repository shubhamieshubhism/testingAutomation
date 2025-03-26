package javaPracticeQuestions;

import org.testng.annotations.Test;

public class reverseAString {
    public static String reverseString(String str) {
        StringBuilder reverse = new StringBuilder();
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            reverse.append(words[i]);
            if (i != 0) {
                reverse.append(" ");
            }
        }
        return reverse.toString();
    }

    public static String reverseSpecificWord(String str, int index) {
        StringBuilder reverse = new StringBuilder();
        String[] words = str.split(" ");
        String indexWord = words[index];
        String reveseWord = new StringBuilder(indexWord).reverse().toString();
        words[index] = reveseWord;
        return String.join(" ", words);
    }

    public static String reverseWholeString(String str) {
        StringBuilder reverse = new StringBuilder(str);
        return reverse.reverse().toString();
    }

    public static String reverseWordsInAString(String str) {
        StringBuilder reverse = new StringBuilder();
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            reverse.append(words[i]);
            if (i != 0) {
                reverse.append(" ");
            }
        }
        return reverse.toString();
    }

    public static String reverseStringRecursion(String str) {
        if (str.isEmpty())
            return str;
        return reverseStringRecursion(str.substring(1)) + str.charAt(0);
    }

    public static String reverseUsingLoop(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "hello world how are you";
        String output = reverseUsingLoop(input);
        System.out.println(output);
    }
}
