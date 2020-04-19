package com.yq.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName :  arra
 * @Author :  Yanqinag
 * @Date :  2020-04-07 00:34
 * @Description : 一次for循环实现查询有序数组中所有重复的元素
 */
public class DuplicateNum {


    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("start");
        //源数组
        int source[] = { 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5, 5, 6 };
        //目标集合,将所有重复元素放入此集合中
        List<Integer> target = new ArrayList<Integer>();
        //标识符,用于在循环中标识上次比较的结果
        boolean flag = false;
        for (int i = 0; i < source.length - 1; i++) {
            int after = source[i + 1];
            int value = source[i];
            if (after == value) {
                target.add(value);
                flag = true;
                System.out.println(value);
            } else {
                //如果上次比较结果(source[i] == source[i-1])为真
                if (flag) {
                    target.add(value);
                    flag = false;
                    System.out.println(value);
                }
            }
        }
        System.out.println("本次遍历消耗了:" + (System.currentTimeMillis() - start)
                + "毫秒!");
    }

}
