package practiceing_java;

public class findTheMissingNumber {
    private static int findMissingNo(int [] arr,int n){
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int num : arr){
            actualSum+=num;
        }
        return expectedSum-actualSum;
    }

    public static void main(String[] args) {
        int [] array = {4,5,6,7,9};
        int output = findMissingNo(array, 9);
        System.out.println("The missing number is :"+output);
    }
}
