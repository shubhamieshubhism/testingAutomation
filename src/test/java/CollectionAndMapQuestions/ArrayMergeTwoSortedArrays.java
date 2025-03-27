package CollectionAndMapQuestions;

import java.util.Arrays;

public class ArrayMergeTwoSortedArrays {
    public static int[] mergedSort(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];
        int i = 0;
        int j = 0;
        int k = 0;
        //merge both arrays
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        //copy the remaining element from arr1 (if any)
        while (i < n1) {
            mergedArray[k++] = arr1[i++];
        }
        while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }
    /*
    * Let’s take arr1 = {1, 3, 5, 7} and arr2 = {2, 4, 6, 8, 10}.

Step	i (arr1)	j (arr2)	Comparison	Smaller Element	Added to mergedArray	mergedArray
1	    1	        2	        1 < 2	        1	        mergedArray[0] = 1	    {1}
2	    3	        2	        3 > 2	        2	        mergedArray[1] = 2	    {1, 2}
3	    3	        4	        3 < 4	        3	        mergedArray[2] = 3	    {1, 2, 3}
4	    5	        4	        5 > 4	        4	        mergedArray[3] = 4	    {1, 2, 3, 4}
5	    5	        6	        5 < 6	        5	        mergedArray[4] = 5	    {1, 2, 3, 4, 5}
6	    7	        6	        7 > 6	        6	        mergedArray[5] = 6	    {1, 2, 3, 4, 5, 6}
7	    7	        8	        7 < 8	        7	        mergedArray[6] = 7	    {1, 2, 3, 4, 5, 6, 7}
Now arr1 is fully traversed (i == n1), but arr2 still has {8, 10}.*/



    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 7, 8};
        int[] arr2 = {3, 5, 9, 10};
        int[] output = mergedSort(arr1, arr2);
        System.out.println(Arrays.toString(output));
    }
}
