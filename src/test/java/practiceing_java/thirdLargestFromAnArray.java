package practiceing_java;

import java.util.Arrays;

public class thirdLargestFromAnArray {

    private static int thirdLargest(int [] arr){
        if(arr==null || arr.length<3){
            throw new IllegalArgumentException("need more than three elements");
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int num : arr){
            if(num>first){
                third=second;
                second=first;
                first=num;
            } else if (num>second && num!=first) {
                third=second;
                second=num;
            } else if (num>third && num!= second && num!=first) {
                third=num;
            }
        }
        if(third==Integer.MIN_VALUE){
            throw new IllegalArgumentException("There is no third largest element in the array");
        }
        return third;
    }

    public static void main(String[] args) {
        int [] array = {12,32,43,55,56,56,99,78,78,99};
        //int [] array = {12};
        System.out.println("Original array "+Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted Array "+Arrays.toString(array));
        int output = thirdLargest(array);
        System.out.println(output);
    }
}
