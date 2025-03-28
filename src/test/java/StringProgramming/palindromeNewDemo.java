package StringProgramming;

public class palindromeNewDemo {
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void findPalindrome(String str){
        for(int i = 0 ; i < str.length();i++){
            for(int j = i+1 ; j<=str.length();j++){
                String substring = str.substring(i,j);
                if(isPalindrome(substring)){
                    System.out.println(substring);
                }
            }
        }

    }

    public static void main(String[] args) {
        String input = "level noon madam";
        String[]words = input.split(" ");
        for(String word : words){
            if(isPalindrome(word)){
                System.out.println(word);
            }
        }
    }
}
