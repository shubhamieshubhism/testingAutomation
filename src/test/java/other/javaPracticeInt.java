package other;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class javaPracticeInt {
    public static int [] removeDuplicateFromArray(int [] arr){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : arr){
            set.add(num);
        }
        int [] array = new int [set.size()];
        int index = 0;
        for(int num : set){
            array[index++]=num;
        }
        return array;
    }

    public static String removeDupFromString(String str){
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        String realStr = str.toLowerCase();
        for(char ch : realStr.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void countWordOccurenceINT(String str){
        String [] words = str.toLowerCase().split("\\s+");
        HashMap<String , Integer> wordMap = new HashMap<>();
        for(String word : words){
            word = word.replaceAll("[^a-zA-Z0-9]","");
            wordMap.put(word,wordMap.getOrDefault(word,0)+1);
        }
        System.out.println("Word counts are as follows");
        for(Map.Entry<String,Integer> entry :wordMap.entrySet()){
            System.out.println(entry.getKey()+" --> "+entry.getValue());
        }
    }

    public static void countWordOccurenceChar(String str){

        HashMap<Character , Integer> wordMap = new HashMap<>();
        for(char word : str.toCharArray()){

            wordMap.put(word,wordMap.getOrDefault(word,0)+1);
        }
        System.out.println("Word counts are as follows");
        for(Map.Entry<Character,Integer> entry :wordMap.entrySet()){
            System.out.println(entry.getKey()+" --> "+entry.getValue());
        }
    }

    public static int thirdLargest(int [] arr){
        if(arr == null || arr.length<3){
            throw new IllegalArgumentException("There is no appropriate elements are present in an array");
        }

        int third = Integer.MIN_VALUE,
                second = Integer.MIN_VALUE,
                first = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > first){
                third = second;
                second = first;
                first=num;
            }
            else if(num > second && num!=first){
                third=second;
                second = num;
            }else if(num > third && num!=second && num!= first){
                third = num;
            }
        }
        if(third == Integer.MIN_VALUE){
            throw new IllegalArgumentException("There is no third largest number");
        }
        return third;
    }



    public static void main(String[] args) {
        int [] array = {12,2,3,33,4,55,567,78,98,555,568};
        int output = thirdLargest(array);
        System.out.println("The third largest number is --> "+output);
    }
}
