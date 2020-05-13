package com.yq.leetcode.link;

import java.util.HashSet;

/**
 * @ClassName :  JudgeLinkRing
 * @Author :  Yanqinag
 * @Date :  2020-05-13 14:45
 * @Description : 判断一个链表是否有环
 */
public class JudgeLinkRing {

    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node3.next = new Node(4);
        node2.next = node3;
        node.next = node2;

    }

    /**
     * @Author : Yanqiang
     * @Date : 2020-05-13
     * @Params : [node]
     * @Return : java.lang.Boolean
     * @Description : set遍历法，O(n)
     */
    public static Boolean linkRing(Node node){
        if (node == null){
            return false;
        }
        HashSet<Node> set = new HashSet<>();
        while (node.next != null){
            if (!set.contains(node)) {
                set.add(node);
                node = node.next;
            }else {
                return true;
            }
        }
        return false;
    }
}
