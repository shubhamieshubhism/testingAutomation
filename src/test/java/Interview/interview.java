package Interview;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class interview {


    public static int findSecondLargest (int [] arr){
        if(arr==null||arr.length<2){
            throw new IllegalArgumentException("Array must contain legal amount of element");
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num : arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }else if (num>secondLargest && num!=largest){
                secondLargest=num;
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            throw new IllegalArgumentException("no second largest num is there");
        }
        return secondLargest;

    }

    public static int fourthLargestNumber(int []arr){
        if(arr==null ||arr.length<4){
            throw new IllegalArgumentException("The array must contain legal amount of elements");
        }
        int first=Integer.MIN_VALUE,
                second=Integer.MIN_VALUE,
                third=Integer.MIN_VALUE,
                fourth=Integer.MIN_VALUE;
        for(int num : arr){
            if(num>first){
                fourth=third;
                third=second;
                second=first;
                first=num;
            } else if (num>second && num!= first) {
                fourth=third;
                third=second;
                second=num;
            } else if (num > third && num!=second && num!=first) {
                fourth=third;
                third=num;
            } else if (num > fourth && num != third && num != second && num!= first) {
                fourth=num;
            }
        }
        if(fourth==Integer.MIN_VALUE){
            throw new IllegalArgumentException("No fourth largest element is found");
        }
        return fourth;
    }

    public static int [] removeDuplicates(int[] arr){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : arr){
            set.add(num);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for(int num : set){
            result[index++]=num;
        }
        return result;
    }

    public static void main(String[] args) {
        int []array={8,78,100,66,100,56,56,0,11};
        int fourthLargest = fourthLargestNumber(array);
        System.out.println(fourthLargest);



    }


}
