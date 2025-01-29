package javaProgramming;

public class practice {
    public static String reverseWord(String str,int index)
    {
        String words[]= str.split(" ");
        try {
            String secondWord = words[index];
            String reversedWord = new StringBuilder(secondWord).reverse().toString();
            words[index] = reversedWord;
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Please enter valid index and below is the original String");
        }
        finally {
            return String.join(" ",words);
        }

    }
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
        for(int i =0 ; i < str.length() ; i++){
            for(int j=i+1 ; j<=str.length();j++){
                String substring = str.substring(i,j);
                if(isPalindrome(substring)){
                    System.out.println(substring);
                }
            }
        }
    }

    public static void occurence(String str){
        char[] a = str.toCharArray();

        for(int i = 0 ; i < a.length ; i++){
            int count = 1;

            for(int j = i+1 ; j <a.length ; j++){
                if(a[i]==a[j]){
                    a[j]= '1';
                    count++;
                }
            }
            if(a[i]!='1'){
                System.out.println(a[i]+"-->"+count);
            }
        }
    }

    public static int occurenceOfChar(String str, int target){
        char a [] = str.toCharArray();
        int count = 0;
        for(int i = 0 ; i < a.length ; i++){
            if(a[i]==target){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "madam is on another level at noon";
        char target = 'a';
        int occurence = occurenceOfChar(input,target);
        System.out.println("The character '"+target+"' has been occure "+occurence+" times");
        }
    }



