package practiceing_java;

public class occurenceOfChar {
    private static int occurenceOfCharacter(String str,char target){
        char a [] = str.toCharArray();
        int count = 0;
        for(int i = 0 ; i <str.length() ; i++){
            if(a[i]==target){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "hello world";
        char target = 'o';
        int output = occurenceOfCharacter(input, target);
        System.out.println("'"+target+"'"+" have occured "+output+" times");
    }
}
