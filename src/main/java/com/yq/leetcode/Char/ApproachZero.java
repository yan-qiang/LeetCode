package com.yq.leetcode.Char;

/**
 * @ClassName :  ApproachZero
 * @Author :  Yanqinag
 * @Date :  2020-04-20 14:16
 * @Description :  两数之和最接近 0
 */
public class ApproachZero {

    private static int[] intArr = {-9,5,4,-3,8,2,1,-4};

    //找出最接近 0 的两个数

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            int k = intArr.length - 1 - i;
            int sum1 = intArr[i] + intArr[k];
            if (i == 0){
                sum = sum1;
            }else {

            }
        }
    }

}
