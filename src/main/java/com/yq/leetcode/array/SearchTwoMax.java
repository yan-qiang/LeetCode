package com.yq.leetcode.array;

/**
 * @ClassName :  SearchTwoMax
 * @Author :  Yanqinag
 * @Date :  2020-05-18 14:03
 * @Description : 10000个数字求第二大的数字，不许用排序算法
 */
public class SearchTwoMax {


    public static void main(String[] args) {
        //假设有个10000 个数字的数组，不一定有序
        int[] arr = {0,1,4,3,2,5,6,7,8,9,};
        // 最大
        int max = 0;
        // 次大
        int twoMax = 0;
        for (int a : arr){
            if(a >= max){
                // 大于等于的时候，把【最大】的给【次大】，当前的给【最大】，
                // 因为大于最大，肯定也大于次大
                twoMax = max;
                max = a;
            }else{
                // 小于最大的时候，再判断是否大于【次大】
                if (a > twoMax){
                    twoMax = a;
                }
            }
        }
        System.out.println(max);
        System.out.println(twoMax);
    }
}
