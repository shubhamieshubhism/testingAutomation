package Practice;

public class PracticeOneReverse {

    public static String reverseWordInString(String str,int index){
        String [] words = str.toLowerCase().split("\\s+");
        String wordIndex = words[index];
        String reverseWord = new StringBuilder(wordIndex).reverse().toString();
        words[index]=reverseWord;
        return String.join(" ",words);
    }

    public static String reverseStringWords(String str){
        String [] words = str.toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i = words.length-1 ; i >=0 ; i--){

            result.append(words[i]);
            if(i!=0){
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static String reverseString(String str){
        StringBuilder reverse = new StringBuilder(str.toLowerCase());
        reverse.reverse();
        return reverse.toString();
    }

    public static void main(String[] args) {
        String input = "Hello Shubham How are you today ?";

        String output = reverseString(input);
        System.out.println(output);
    }
}
