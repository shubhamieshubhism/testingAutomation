package javaPracticeQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromArray {
    public static int [] removeDupFromArray(int[] arr){
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

    public static void main(String[] args) {
        int [] array = {1,1,2,2,3,4,5,6,7,7,8,9};
        int[] output = removeDupFromArray(array);
        System.out.println(Arrays.toString(output));
    }
}
