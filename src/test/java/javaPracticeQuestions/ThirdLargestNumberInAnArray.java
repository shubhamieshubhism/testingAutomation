package javaPracticeQuestions;

import java.util.Arrays;

public class ThirdLargestNumberInAnArray {

    public static int thirdLargestNum(int [] arr){
        if(arr == null || arr.length<3){
            throw new IllegalArgumentException("The array does not contain the legal amount element");
        }
        int third = Integer.MIN_VALUE,
                second = Integer.MIN_VALUE,
                first =Integer.MIN_VALUE;

        for(int num : arr){
            if(num > first){
                third=second;
                second=first;
                first=num;
            }else if(num > second){
                third = second;
                second = num;
            }else if(num > third){
                third = num;
            }
        }
        if(third == Integer.MIN_VALUE){
            throw new IllegalArgumentException("No third largest number is found");
        }
        return third;

    }

    public static void main(String[] args) {
        int [] array = {11,33,2,44,54,57,66,55,55,44,33,54};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int output = thirdLargestNum(array);

        System.out.println("The third largest number is : "+output);
    }
}
