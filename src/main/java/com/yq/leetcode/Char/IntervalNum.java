package com.yq.leetcode.Char;

/**
 * @ClassName :  IntervalNum
 * @Author :  Yanqinag
 * @Date :  2020-04-26 17:37
 * @Description :
 *  计算一个有序的数组内包含 0-9，10-19，20-29... 有多少个区间
 *  1、数据长度 [0-9999]
 *  2、数组有序
 */
public class IntervalNum {


    /**
     * @Author : Yanqiang
     * @Date : 2020-04-26
     * @Params : [args]
     * @Return : void
     * @Description : 这个是计算有多少个区间，
     *  如果计算有多少个值，也可以计算，
     *  比如一个区间有 8 位数，0-9 之间去掉头和尾共有 8 个数字，
     *  返回的长度 length * 8 就是有多少个数
     */
    public static void main(String[] args) {
        // 数组添加值
        int[] a = new int[9999];
        for (int i = 0; i < 9999; i++) {
            a[i] = i;
        }
        System.out.println(a.length);
        // 以 0 开头的数字，如 0，10，20...
        int first = 0;
        // 返回的长度
        int length = 0;
        for (int i = 0; i < a.length; i++) {
            // 当前数 - first == 9，比如 9 - 0 = 9，19 - 10 = 9...
            // 也可以用 9 + first = a[i], 比如 9 + 0 = 9, 9 + 10 = 19...
            if (a[i] - first == 9){
                // 长度 + 1
                length = length + 1;
                // 后一位赋值给 起始位置
                first = a[i + 1];
            }
        }
        System.out.println(length);
    }
}
