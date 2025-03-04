package javaPracticeQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromAnArray {

    public static int [] removeDuplicates(int [] arr){
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int [] result =new int [set.size()];
        int index = 0;
        for(int num :set){
            result[index++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] array = {11,33,2,44,54,57,66,55,55,44,33,54};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));

        int[] output = removeDuplicates(array);

        System.out.println("The removed duplicates from array : "+Arrays.toString(output));
        Arrays.sort(output);
        System.out.println("Sorted array --> "+Arrays.toString(output));
        System.out.println("The second largest number is : "+output[output.length-2]);
    }
}
