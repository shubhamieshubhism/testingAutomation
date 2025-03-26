package Practice;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class PracticeTwoDuplicates {
    public static String removeDuplicateChar(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void findDuplicateChar(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Duplicate character are as follows : ");
        charCount.forEach((character, count) ->
        {

            if (count > 1) {
                System.out.print(character + " ");
            }
        });
    }

    public static String removeDuplicateWord(String str) {

        String[] words = str.toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (String word : words) {
            if (!set.contains(word)) {
                set.add(word);
                result.append(word);
                result.append(" ");

            }
        }
        return result.toString();
    }

    public static void charCount(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        charCount.forEach((character, count) -> System.out.println(character + " --> " + count));
    }

    public static void wordCOunt(String str) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = str.toLowerCase().split("\\s+");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        wordCount.forEach((word, count) -> System.out.println(word + " --> " + count));
    }



    public static void main(String[] args) {
        String input = "Hello hi and hello how are you shubham , shubham is that you";
        wordCOunt(input);
    }


}
