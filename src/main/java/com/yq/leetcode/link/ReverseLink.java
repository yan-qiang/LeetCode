package com.yq.leetcode.link;

/**
 * @ClassName :  ReverseLink
 * @Author :  Yanqinag
 * @Date :  2020-05-06 11:23
 * @Description :  链表反转
 */
public class ReverseLink {


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


        Node returnNode = null;
        while (node != null){
            //tmp = 234
            Node tmp = node.next;
            // next = null
            node.next = returnNode;
            returnNode = node;
            node = tmp;
        }

        System.out.println(returnNode);
    }
}
