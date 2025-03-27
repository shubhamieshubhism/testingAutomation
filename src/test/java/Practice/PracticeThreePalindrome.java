package Practice;

public class PracticeThreePalindrome {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        str = str.toLowerCase();
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void findPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String subString = str.substring(i, j);
                if (isPalindrome(subString) && subString.length() > 2) {
                    System.out.println(subString);
                }
            }
        }
    }

    public static void main(String[] args) {
        String input = "madam How Level at Noon Are woW";
//        String [] words = input.split("\\s+");
//        for(String word : words){
//            if(isPalindrome(word)){
//                System.out.println(word);
//            }
//        }

        findPalindrome(input);
    }
}
