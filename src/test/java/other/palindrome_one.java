package other;

public class palindrome_one {
    public static void main(String[] args) {
        String input = "levelracecarmadamnoon";
        String [] words = input.split(" ");
        System.out.println(input);
        System.out.println("Palindrome of the above word are as follows : ");
//        for( String word : words){
//            if(isPalindrome(word)){
//                System.out.println(word);
//            }
//        }
        findPalindrome(input);

    }
    public static void findPalindrome(String str){
        int length = str.length();
        for(int i = 0 ; i< length ;i++){
            for(int j=i+1 ; j<=length ; j++){
                String substring = str.substring(i,j);
                if(isPalindrome(substring)){
                    System.out.println(substring);
                }
            }
        }

    }
    public static boolean isPalindrome(String word){
        int left = 0;
        int right = word.length()-1;
        while(left<right){
            if(word.charAt(left)!=word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}