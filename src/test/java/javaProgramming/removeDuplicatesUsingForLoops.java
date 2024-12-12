package javaProgramming;

public class removeDuplicatesUsingForLoops {

    public static String removeDuplicatesByOnlyForLoops(String str){
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i<str.length();i++){
            char currentCharacter = str.charAt(i);
            boolean isDuplicate = false;
            for(int j = 0 ;j<result.length();j++){
                if(result.charAt(j)==currentCharacter){
                    isDuplicate=true;
                    break;
                }
                }
            if(!isDuplicate){
                result.append(currentCharacter);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String input = "programming";
        String output = removeDuplicatesByOnlyForLoops(input);
        System.out.println(output);

    }
}
