package com.yq.leetcode.string;

/**
 * @ClassName : Dynamic
 * @Author : Yanqiang
 * @Date : 2019/5/21
 * @Description :动态或贪心
 */
public class Dynamic {


    /**
     * @Author : Yanqiang
     * @Date : 2019/5/21
     * @Param : [nums]
     * @return : int
     * @Description :  最大子序和
     *      n: 从第一个正数开始,一直往后累加，如果加到 n > sum,说明之前sum存的并不是最大的子序列，将n 赋值给sum
     */
    public static int maxSubArray(int[] nums) {// 动态规划法
        //储存最大的子序列的和
        int sum=nums[0];

        int n=nums[0];

        for(int i=1;i<nums.length;i++) {

            if(n > 0){
                n += nums[i];
            }else {
                n = nums[i];
            }
            if(sum < n){
                sum = n;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] a = {-2,1,3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(a));
    }
}
