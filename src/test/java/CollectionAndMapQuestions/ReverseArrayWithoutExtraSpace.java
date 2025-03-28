package CollectionAndMapQuestions;

import java.util.Arrays;

public class ReverseArrayWithoutExtraSpace {
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("Original array : " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Reverse array : " + Arrays.toString(arr));
    }
}
