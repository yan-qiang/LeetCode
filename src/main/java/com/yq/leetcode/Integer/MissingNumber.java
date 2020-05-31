package com.yq.leetcode.Integer;

/**
 * @ClassName :  MissingNumber
 * @Author :  Yanqinag
 * @Date :  2020-05-28 22:31
 * @Description :
 */
public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }


    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9,10,11,12,14,15,16};
        int i = missingNumber(a);
        System.out.println(i);
    }
}
