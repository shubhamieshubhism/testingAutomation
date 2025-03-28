package CollectionAndMapQuestions;

import java.util.Arrays;

public class ArrayMoveZerosAtEnd {
    public static void moveZeros(int [] nums){
        int index=0;
        for(int num : nums){
            if(num!=0){
                nums[index++]=num;
            }
        }
        /*
        * For input: {0, 1, 0, 3, 12}, let's track the index and nums array:

Step	Current Num	    index Before	nums After Updating
1	        0	            0	            {0, 1, 0, 3, 12} (No change)
2	        1	            0 → 1	        {1, 1, 0, 3, 12}
3	        0	            1	            {1, 1, 0, 3, 12} (No change)
4	        3	            1 → 2	        {1, 3, 0, 3, 12}
5	        12	            2 → 3	        {1, 3, 12, 3, 12}
At this point, all non-zero elements are at the start: {1, 3, 12, 3, 12}. However, the last two positions still contain old values.*/
        while(index<nums.length){
            nums[index++]=0;
        }
        /*
        * Step	    index Before	nums After Updating
            1	    3 → 4	        {1, 3, 12, 0, 12}
            2	    4 → 5	        {1, 3, 12, 0, 0}
        Now, the final array is {1, 3, 12, 0, 0}, which is the expected output.*/
    }

    public static void main(String[] args) {
        int[] array = {0,10,2,0,3,0,4,5};
        moveZeros(array);
        System.out.println(Arrays.toString(array));
    }
}
