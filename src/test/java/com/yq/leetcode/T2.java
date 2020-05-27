package com.yq.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName :  T2
 * @Author :  Yanqinag
 * @Date :  2020-05-21 10:54
 * @Description :
 *
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 进阶:
 *
 * 你能不将整数转为字符串来解决这个问题吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T2 {


    public static void main(String[] args) {
        Boolean palindrome = isPalindrome(12321);
        System.out.println(palindrome);
    }

    public static Boolean isPalindrome(int a){
        if (a < 0){
            return false;
        }
        List<Integer> list = new LinkedList<>();
        while (a >= 0){
            list.add(a % 10);
            a = a / 10;
            if (a == 0){
                a = -1;
            }
        }
        for (int i = 0; i < list.size()/2; i++) {
            if (!list.get(i).equals(list.get(list.size() - 1 - i))){
                return false;
            }
        }
        return true;
    }

}
