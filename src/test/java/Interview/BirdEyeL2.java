package Interview;

public class BirdEyeL2 {
    String input="MALAYALAM";
    public static Boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
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
        for(int i = 0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String subString = str.substring(i,j);
                if(isPalindrome(subString) && subString.length()>1){
                    System.out.println(subString);
                }
            }
        }
    }

    public static void main(String[] args) {
        String input="MALAYALAM";
        findPalindrome(input);

    }
}
