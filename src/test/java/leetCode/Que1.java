package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Que1 {
    /*
    1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
    * */
    public static int[] twoSum(int[]nums,int target){
        Map<Integer,Integer> pairInx = new HashMap<>();
        for(int i =0 ; i<nums.length;i++){
            int num = nums[i];
            if(pairInx.containsKey(target-num)){
                return new int[]{
                        i,pairInx.get(target-num)
                };
            }
            pairInx.put(num,i);
        }
        return new int []{};
    }

    public static void main(String[] args) {
        int num [] ={2,7,3,6,11,15,2};
        int target = 9;
        int[] out = twoSum(num, target);
        System.out.println(Arrays.toString(out));
    }

}
