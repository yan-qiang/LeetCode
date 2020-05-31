package com.yq.leetcode.Integer;

/**
 * @ClassName :  AddDigits
 * @Author :  Yanqinag
 * @Date :  2020-05-28 22:19
 * @Description :
 */
public class AddDigits {

    public static int addDigits(int num) {
        int a = num - 1;
        int b = a % 9;
        return b + 1;
    }

    public static void main(String[] args) {
        int i = addDigits(39);
        System.out.println(i);
    }
}
