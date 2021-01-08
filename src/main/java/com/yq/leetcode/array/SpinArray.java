package com.yq.leetcode.array;

/**
 * @author yanqiang
 * @className SpinArray
 * @date 2021/1/8
 * @description
 **/
public class SpinArray {

    /**
     * @author YanQiang
     * @date 2021/1/8
     * @description 旋转数组
     */
    public static void rotate(int[] nums, int k) {
        // [1,2,3,4,5,6,7]
        // [5,6,7,1,2,3,4]
        k %= nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1};
        rotate(arr,2);
    }



    public static void reverse(int[] nums, int start,int end) {
        // [1,2,3,4,5,6,7]
        // [5,6,7,1,2,3,4]
       while (start < end){
           int tmp = nums[start];
           nums[start] = nums[end];
           nums[end] = tmp;
           start++;
           end--;
       }
    }
}
