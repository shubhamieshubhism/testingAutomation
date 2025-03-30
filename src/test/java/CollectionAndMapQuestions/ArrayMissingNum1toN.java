package CollectionAndMapQuestions;

public class ArrayMissingNum1toN {
    public static int findMissingNum1ToN(int [] array,int n){
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;

        for(int num : array){
            actualSum+=num;
        }
        return expectedSum-actualSum;
    }

    public static void main(String[] args) {
        int input [] = {1,3,4,5,6};
        int output = findMissingNum1ToN(input,6);
        System.out.println("Missing number is : "+output);
    }
}
