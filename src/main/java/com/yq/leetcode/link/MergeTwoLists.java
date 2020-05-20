package com.yq.leetcode.link;

/**
 * @ClassName :  MergeTwoLists
 * @Author :  Yanqinag
 * @Date :  2020-05-20 11:55
 * @Description :  合并两个有序链表
 * <p>
 * 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4
 *      1->3->4
 * 输出：1->1->2->3->4->4
 */
public class MergeTwoLists {

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

        Node nodeJ = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node3.next = new Node(4);
        node2.next = node3;
        nodeJ.next = node2;

        Node nodeK = new Node(3);
        Node node5 = new Node(5);
        node5.next = new Node(6);
        nodeK.next = node5;

        System.out.println(nodeJ);
        System.out.println(nodeK);

        Node node = MergeLists(nodeJ, nodeK);
        System.out.println(node);

    }


    public static Node MergeLists(Node n1, Node n2){
        Node prehead = new Node(-1);

        Node prev = prehead;
        while (n1 != null && n2 != null) {
            if (n1.val <= n2.val) {
                prev.next = n1;
                n1 = n1.next;
            } else {
                prev.next = n2;
                n2 = n2.next;
            }
            prev = prev.next;
        }

        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        prev.next = n1 == null ? n2 : n1;

        return prehead.next;
    }
}
