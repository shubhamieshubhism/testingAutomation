package CollectionAndMapQuestions;

import java.util.HashSet;
import java.util.Set;

public class ArrayInterSectionAndUnion {
    public static void findIntersectionNUnion(int [] arr1,int [] arr2){
        Set<Integer> unionSet = new HashSet<>();
        for(int num : arr1) unionSet.add(num);
        for(int num : arr2) unionSet.add(num);

        Set<Integer>set1 = new HashSet<>();
        Set<Integer> intersection= new HashSet<>();

        for(int num : arr1) set1.add(num);
        for(int num : arr2){
            if(set1.contains(num)){
                intersection.add(num);
            }
        }

        System.out.println("Union is : "+unionSet);
        System.out.println("Intersection is : "+intersection);
    }

    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6};
        int [] arr2 = {4,5,6,7,8};
        findIntersectionNUnion(arr1,arr2);
    }
}
