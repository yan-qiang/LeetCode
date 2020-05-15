package com.yq.leetcode.string;

/**
 * @ClassName :  ReverseString
 * @Author :  Yanqinag
 * @Date :  2020-05-15 10:06
 * @Description :  字符串反转
 */
public class ReverseString {


    /**
     * @Author : Yanqiang
     * @Date : 2020-05-15
     * @Params : [str]
     * @Return : java.lang.String
     * @Description : 递归方式（360 安全面试题）
     */
    public static String reverseStr(String str) {
        int length = str.length();
        if (length <= 1) {
            return str;
        }
        return reverseStr(str.substring(1)) + str.charAt(0);
    }


    public static void main(String[] args) {

        String str = "abcd";
        String s = reverseStr(str);
        System.out.println(s);
    }
}
