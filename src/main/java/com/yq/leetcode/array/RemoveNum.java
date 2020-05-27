package com.yq.leetcode.array;

/**
 * @ClassName :  RemoveNum
 * @Author :  Yanqinag
 * @Date :  2020-05-23 10:15
 * @Description :
 */
public class RemoveNum {


    /**
     * @Author : Yanqiang
     * @Date : 2020-05-23
     * @Params : [nums, target]
     * @Return : int[]
     * @Description :
     *
     * 1 2 2 3 4
     * 1 3 4 ***
     */
    public static int[] removeNum(int[] nums, int target){

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (target == nums[i]){
                k++;
            }else {
                nums[i-k] = nums[i];
            }
        }
        System.out.println(nums.length - k);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int target = 2;
        int[] ints = removeNum(nums, target);
        for (int anInt : ints) {
            System.out.print(anInt);
        }
    }

}
