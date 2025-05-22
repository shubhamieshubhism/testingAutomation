package javaPracticeQuestions;

import java.util.Arrays;

public class ReverseTheArrayInSubsetOfN {
    public static void reverseSubset(int arr[],int k){
        int length = arr.length;
        for(int i = 0;i<length;i+=k){
            int left = i;
            int right = Math.min(i+k-1,length-1);
            while(left<right){
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int array []={1,2,3,3,2,1,4,5,6,9,8,7};
        reverseSubset(array,3);
        System.out.println("Reverse array with subset : "+ Arrays.toString(array));
    }
}
