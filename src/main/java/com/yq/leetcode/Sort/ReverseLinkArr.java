package com.yq.leetcode.Sort;

/**
 * @ClassName :  ReverseLinkArr
 * @Author :  Yanqinag
 * @Date :  2020-04-19 12:52
 * @Description : 链表倒序
 */
public class ReverseLinkArr {

    public static void main(String[] args) {
        Node node = new Node(1, null);
        Node node2 = new Node(2, null);
        node.after = node2;
        Node node3 = new Node(3, null);
        node2.after = node3;
        node3.after = new Node(4, null);

        System.out.println(node);

        // 1-2-3-4  to  4-3-2-1

        Node surplus = node;
        Node result = null;
        while (surplus != null) {
            Node temp = surplus.after;
            surplus.after = result;
            result = surplus;
            surplus = temp;
        }
        System.out.println(result);

    }


    /**
     * @Author : Yanqiang
     * @Date : 2020-04-19
     * @Description : 单向链表
     */
    static class Node {
        int value;
        Node after;

        Node(int value, Node after) {
            this.value = value;
            this.after = after;
        }

        public int getValue() {
            return value;
        }


        public Node getAfter() {
            return after;
        }


        public void setValue(int value) {
            this.value = value;
        }


        public void setAfter(Node after) {
            this.after = after;
        }


    }

}
