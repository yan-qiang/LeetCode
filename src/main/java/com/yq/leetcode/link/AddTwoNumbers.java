package com.yq.leetcode.link;

import com.yq.leetcode.base.model.SingleLinkedNode;

/**
 * @ClassName :  AddTwoNumbers
 * @Author :  Yanqinag
 * @Date :  2020-05-21 12:58
 * @Description :
 *  给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 输入：(2 -> 4) + (5 -> 6 -> 4)
 *      42 + 456
 * 输出：8 -> 9-> 6
 * 原因：342 + 465 = 807
 */
public class AddTwoNumbers {


    public static void main(String[] args) {
        SingleLinkedNode singleLinkedNodeJ = new SingleLinkedNode(2);
        SingleLinkedNode singleLinkedNode2 = new SingleLinkedNode(4);
        singleLinkedNode2.next = new SingleLinkedNode(3);
        singleLinkedNodeJ.next = singleLinkedNode2;

        SingleLinkedNode singleLinkedNodeK = new SingleLinkedNode(5);
        SingleLinkedNode singleLinkedNode5 = new SingleLinkedNode(6);
        singleLinkedNode5.next = new SingleLinkedNode(4);
        singleLinkedNodeK.next = singleLinkedNode5;

        System.out.println(singleLinkedNodeJ);
        System.out.println(singleLinkedNodeK);
        SingleLinkedNode singleLinkedNode = addTwoNumber(singleLinkedNodeJ, singleLinkedNodeK);

        //Node node = addTwoNumber(new Node(5),new Node(5));

        System.out.println(singleLinkedNode);
        System.out.println(342 + 465);
    }


    private static SingleLinkedNode addTwoNumber(SingleLinkedNode n1, SingleLinkedNode n2){

        SingleLinkedNode header = new SingleLinkedNode(0);
        SingleLinkedNode curr = header;
        int flag = 0;
        while (n1 != null || n2 != null){

            int a = n1 == null ? 0 : n1.val;
            int b = n2 == null ? 0 : n2.val;

            int num = a + b + flag;

            curr.next = new SingleLinkedNode(num % 10);

            curr = curr.next;

            flag = num / 10;

            if (n1 != null) n1 = n1.next;
            if (n2 != null) n2 = n2.next;
        }
        if (flag > 0){
            curr.next = new SingleLinkedNode(flag);
        }
       return header.next;
    }
}
