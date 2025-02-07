package practiceing_java;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class removeDuplicates {
    private static int [] removeDuplicateFromArray(int [] arr){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : arr){
            set.add(num);
        }
        int index = 0;
        int [] result = new int [set.size()];
        for(int num : set){
            result[index++]=num;
        }
        return result;
    }

    private static String removeDuplicateFromString(String str){
        StringBuilder result = new StringBuilder();
        LinkedHashSet<Character>set = new LinkedHashSet<>();
        for(char ch : str.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int [] array = {1,1,2,2,3,4,5,5};
        int[] output = removeDuplicateFromArray(array);
        System.out.println(Arrays.toString(output));

        String ip = "ssuuccsful";
        String op = removeDuplicateFromString(ip);
        System.out.println(op);
    }
}
