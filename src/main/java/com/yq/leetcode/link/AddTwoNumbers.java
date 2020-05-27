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
        System.out.println(5 + 5);
    }


    public static SingleLinkedNode addTwoNumber(SingleLinkedNode n1, SingleLinkedNode n2){
        int i = 0;
        SingleLinkedNode singleLinkedNode = new SingleLinkedNode(-1);
        SingleLinkedNode curr = singleLinkedNode;
        while (n1 != null && n2 != null){
            int num = n1.val + n2.val;
            if (i == 1){
                num = num + i;
            }
            if(num >= 10){
                curr.next = new SingleLinkedNode(num % 10);
                i++;
            }else {
                curr.next = new SingleLinkedNode(num);
                i=0;
            }
            n1 = n1.next;
            n2 = n2.next;
            curr = curr.next;
        }
        if (n1 == null && n2 == null){
            if (i == 1){
                curr.next = new SingleLinkedNode(i);
            }
            return singleLinkedNode.next;
        }else if (n1 == null){
            n2.val = n2.val + i;
            curr.next = n2;
        }else {
            n1.val = n1.val + i;
            curr.next = n1;
        }
       return singleLinkedNode.next;
    }
}
