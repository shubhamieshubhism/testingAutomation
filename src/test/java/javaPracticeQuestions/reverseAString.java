package javaPracticeQuestions;

import org.testng.annotations.Test;

public class reverseAString {
    public static String reverseString(String str){
        StringBuilder reverse = new StringBuilder();
        String [] words = str.split(" ");
        for(int i = words.length-1;i>=0;i--){
            reverse.append(words[i]);
            if(i!=0){
                reverse.append(" ");
            }
        }
        return reverse.toString();
    }

    public static String reverseSpecificWord(String str,int index){
        StringBuilder reverse = new StringBuilder();
        String [] words = str.split(" ");
        String indexWord = words[index];
        String reveseWord = new StringBuilder(indexWord).reverse().toString();
        words[index]=reveseWord;
        return String.join(" ",words);
    }

    public static String reverseWholeString(String str){
        StringBuilder reverse = new StringBuilder(str);
        return reverse.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "hello world how are you";
        String output = reverseWholeString(input);
        System.out.println(output);
    }
}
