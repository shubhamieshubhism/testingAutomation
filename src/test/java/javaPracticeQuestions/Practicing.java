package javaPracticeQuestions;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;

public class Practicing {
    /*Remove duplicates from an array*/
    public static int [] removeDuplicates(int [] arr){
        LinkedHashSet<Integer> set =new LinkedHashSet<>();
        for(int num : arr){
            set.add(num);
        }

        int index = 0;
        int [] result = new int[set.size()];
        for(int num : set){
            result[index++]=num;
        }
        return result;
    }

    public static void duplicateOccurence(int [] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("The numbers which are occured once are as follows : ");
        map.forEach((num,count)->{
            if(count==1){
                System.out.println(num + " -->" + count);
            }
        });
    }

    public static char firstNonRepetitiveChar(String str){
        Map<Character,Integer> charCount = new LinkedHashMap<>();
        str=str.toLowerCase();
        for(char ch : str.toCharArray()){
            charCount.put(ch,charCount.getOrDefault(ch,0)+1);
        }

        /*for(Map.Entry<Character,Integer>entry: charCount.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }*/

        charCount.forEach((character,count)->{
            if(count==1){
                System.out.println(character);
            }
        });
        return '\0';
    }

    public static void wordOccurrence(String str){
        HashMap<String,Integer>map = new HashMap<>();
        String [] words = str.toLowerCase().split("\\s+");
        for(String word : words){

        }
    }

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while (left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static void findPalindrome(String str){
        str=str.replaceAll("\\s+","");
        for(int i=0 ; i<str.length();i++){
            for(int j = i+1;j<=str.length();j++){
                String subString = str.substring(i,j);
                if(isPalindrome(subString) && subString.length()>2){
                    System.out.println(subString);
                }
            }
        }
    }

    public static String removeDuplicates(String str){
        StringBuilder result = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        for(char ch : str.toCharArray() ){
            if(!set.contains(ch)){
                set.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static int sumOfDigitsInString(String str){
        int sum=0;
        String temp ="";
        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                temp+=ch;
            }else{
                if(!temp.isEmpty()){
                    sum+=Integer.parseInt(temp);
                    temp="";
                }
            }
        }
        if(!temp.isEmpty()){
            sum+=Integer.parseInt(temp);
        }
        return sum;
    }

    public static int sumOfIndividualDigit(String str){
        int sum =0;
        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                sum+=Character.getNumericValue(ch);
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        String input = "successfull";
        Character out = firstNonRepetitiveChar(input);
        System.out.println(out);

    }
}
