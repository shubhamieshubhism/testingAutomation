package StringProgramming;

public class ReverseStringAndWordDemo {
    public static String reverseWordsAndString(String input) {
        // Split the string into words
        String[] words = input.split(" ");
        StringBuilder reversedWords = new StringBuilder();

        // Reverse each word and append to the result
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWords.append(reversedWord.reverse()).append(" ");
        }

        // Reverse the entire string of reversed words
        return reversedWords.reverse().toString().trim();
    }

    public static void main(String[] args) {
        String input = "Hello World";
        String result = reverseWordsAndString(input);

        System.out.println("Original String: " + input);
        System.out.println("Processed String: " + result);
    }
}
