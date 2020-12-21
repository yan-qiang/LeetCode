package com.yq.leetcode.string;

import java.util.*;

/**
 * @author yanqiang
 * @className VerifyBrackets
 * @date 2020/12/21
 * @description
 **/
public class VerifyBrackets {


    //官方解答
    public static boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(test("[(){}]"));
    }


    //理解
    public static boolean test(String s){
        //如果长度为单数，说明不匹配
        int length = s.length();
        if (length%2 == 1){
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        //栈
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            //map 包含
            if (map.containsKey(c)){
                //栈空，或者取出栈顶 ！= map的value，则为false，直接return
                if (stack.isEmpty() || stack.peek() != map.get(c) ){
                    return false;
                }
                stack.pop();
            }else {
                //map不包含时，进栈
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

}
