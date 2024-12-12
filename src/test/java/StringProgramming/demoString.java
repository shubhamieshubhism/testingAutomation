package StringProgramming;

public class demoString {
    // Method to reverse a string
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }

    // Method to process the input string
    public static String reverseWordsAndString(String input) {
        // Split the string into words
        String[] words = input.split(" ");
        String result = "";

        // Reverse each word
        for (String word : words) {
            result += reverseString(word) + " ";
        }

        // Remove trailing space and reverse the entire string
        return reverseString(result.trim());
    }

    public static void main(String[] args) {
        String input = "Hello World";
        String result = reverseWordsAndString(input);

        System.out.println("Original String: " + input);
        System.out.println("Processed String: " + result);
    }
}
