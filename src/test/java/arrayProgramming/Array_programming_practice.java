package arrayProgramming;

import java.util.Scanner;

public class Array_programming_practice {
    public static void main(String[] args) {
        int a[]={1,2,3,4,55,56,77};
        averageOfAnArray(a);
        averageOfEvenElementsOfAnArray(a);
        averageOfOddElementsOfAnArray(a);
        binarySearch(a,77);
    }
    public static void averageOfAnArray(int a[]){
        int sum = 0;
        for(int i=0; i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("The sum of an elements of an array : "+sum);
        System.out.println("The average of an elements present in an array : "+(double)sum/a.length);
    }
    public static void averageOfEvenElementsOfAnArray(int a[]){
        int sum =0;
        int count = 0;
        for(int i =0; i<a.length;i++){
            if(a[i]%2==0){
                sum+=a[i];
                count++;
            }
        }
        System.out.println("The sum of even elements of an array : "+sum);
        System.out.println("The number of an even elements present in an array : "+count);
        System.out.println("The average of even elements of an array : "+(double)sum/count);
    }

    public static void averageOfOddElementsOfAnArray(int a[]){
        int sum =0;
        int count = 0;
        for(int i =0; i<a.length;i++){
            if(a[i]%2!=0){
                sum+=a[i];
                count++;
            }
        }
        System.out.println("The sum of odd elements of an array : "+sum);
        System.out.println("The number of an odd elements present in an array : "+count);
        System.out.println("The average of odd elements of an array : "+(double)sum/count);
    }

    public static void binarySearch(int a [],int ele){
        int l = 0;
        int r = a.length-1;
        int mid;
        boolean flag = false;
        while (l<=r){
            mid=(l+r)/2;
            if(ele==a[mid]){
                flag =true;
                System.out.println("Element has been found successfully and the found element is "+a[mid]);
                break;
            }else if (ele >a[mid]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        if(flag==false){
            System.out.println("The element is not found");
        }
    }

}
