package com.yq.leetcode.link;

import com.yq.leetcode.base.model.SingleLinkedNode;

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
 *
 */
public class MergeTwoLists {

    public static void main(String[] args) {

        SingleLinkedNode singleLinkedNodeJ = new SingleLinkedNode(1);
        SingleLinkedNode singleLinkedNode2 = new SingleLinkedNode(2);
        SingleLinkedNode singleLinkedNode3 = new SingleLinkedNode(3);
        singleLinkedNode3.next = new SingleLinkedNode(4);
        singleLinkedNode2.next = singleLinkedNode3;
        singleLinkedNodeJ.next = singleLinkedNode2;

        SingleLinkedNode singleLinkedNodeK = new SingleLinkedNode(3);
        SingleLinkedNode singleLinkedNode5 = new SingleLinkedNode(5);
        singleLinkedNode5.next = new SingleLinkedNode(6);
        singleLinkedNodeK.next = singleLinkedNode5;

        System.out.println(singleLinkedNodeJ);
        System.out.println(singleLinkedNodeK);

        SingleLinkedNode singleLinkedNode = mergeTwoNode(singleLinkedNodeJ, singleLinkedNodeK);
        System.out.println(singleLinkedNode);

    }

    public static SingleLinkedNode mergeTwoNode(SingleLinkedNode n1, SingleLinkedNode n2){
        SingleLinkedNode singleLinkedNode = new SingleLinkedNode(-1);
        SingleLinkedNode curr = singleLinkedNode;
        while (n1 != null && n2 != null){
            if (n1.val <= n2.val){
                curr.next = n1;
                n1 = n1.next;
            }else {
                curr.next = n2;
                n2 = n2.next;
            }
            curr = curr.next;
        }
        curr.next = n1 == null ? n2 : n1;
        return singleLinkedNode.next;
    }
}
