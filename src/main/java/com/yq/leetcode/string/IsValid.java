package com.yq.leetcode.string;

import java.util.HashSet;

/**
 * @ClassName :  isValid
 * @Author :  Yanqinag
 * @Date :  2020-04-21 23:07
 * @Description :
 *  给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class IsValid {

    static String str = "([]";


    /**
     * @Author : Yanqiang
     * @Date : 2020-04-21
     * @Params : [args]
     * @Return : void
     * @Description :  这个题存疑，我在提交时 "([]" 提示我应该输出 false ，看题目应该是 true？？
     */
    public static void main(String[] args) {
        char[] chars = str.toCharArray();
    }

}
