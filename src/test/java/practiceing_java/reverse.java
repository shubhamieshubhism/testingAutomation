package practiceing_java;
public class reverse {
    private static String reverseSecondWord(String str){
        String [] words = str.split(" ");
        String secondWord = words[1];
        String reverseWord = new StringBuilder(secondWord).reverse().toString();
        words[1]=reverseWord;
        return String.join(" ",words);
    }

    private static String reverseWHoleString(String str){
        StringBuilder reverse = new StringBuilder(str);
        reverse.reverse();
        return reverse.toString();
    }

    private static String reverseWOrdsOfString(String str){
        StringBuilder result = new StringBuilder();
        String [] words =  str.split(" ");
        for (int i = words.length-1; i >=0 ; i--) {
            result.append(words[i]);
            if(i!=0){
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "hello Shubham i am good";
        String output = reverseSecondWord(input);
        String output1 = reverseWHoleString(input);
        String output2 = reverseWOrdsOfString(input);
        System.out.println(output2);
    }
}
