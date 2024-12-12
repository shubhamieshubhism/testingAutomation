package com.com;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] a = {1,2,3,44,54,54,6,8};
        int n = a.length;
        for(int i = 0 ; i <n ; i++){
            for(int j = 0 ; j < n - i -1 ; j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.print("sorted array will be : ");
        printarray(a);
    }

    private static void printarray(int arr[]) {
        for(int i = 0 ; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
