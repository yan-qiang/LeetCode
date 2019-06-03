package com.yq.leetcode.string;

import java.util.Stack;

/**
 * @ClassName : MinStack
 * @Author : Yanqiang
 * @Date : 2019/5/23
 * @Description :最小栈
 */
public class MinStack {

    private Stack<Integer> diff = new Stack<Integer>();
    private int minValue;

    public void push(int x) {
        if (diff.isEmpty()) {
            minValue = x;
            diff.push(0);
        } else {
            int compare = x - minValue;
            diff.push(compare);
            minValue = compare < 0 ? x : minValue;
        }
    }

    public void pop() {
        int top = diff.peek();
        minValue = top < 0 ? (minValue - top) : minValue;
        diff.pop();
    }

    public int top() {
        int top = diff.peek();
        return top > 0 ? top + minValue : minValue;
    }

    public int getMin() {
        return minValue;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(-1);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());//  --> 返回 -3
        minStack.pop();
        System.out.println(minStack.top());//  --> 返回 0
        System.out.println(minStack.getMin());//  --> 返回 -2
    }
}