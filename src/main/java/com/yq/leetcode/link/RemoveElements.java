package com.yq.leetcode.link;

import com.yq.leetcode.base.model.SingleLinkedNode;

/**
 * @ClassName :  RemoveElements
 * @Author :  Yanqinag
 * @Date :  2020-05-26 12:14
 * @Description :
 * <p>
 * 删除链表中等于给定值 val 的所有节点。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class RemoveElements {


    public static SingleLinkedNode removeElements(SingleLinkedNode head, int val) {
        SingleLinkedNode singleLinkedNode = new SingleLinkedNode(0);
        singleLinkedNode.next = head;
        SingleLinkedNode prev = singleLinkedNode;
        SingleLinkedNode curr = head;

        while (curr != null){
            if (curr.val == val){
                prev.next = curr.next;
            }else {
                prev = curr;
            }
            curr = curr.next;
        }
        return singleLinkedNode.next;
    }


    public static void main(String[] args) {

        SingleLinkedNode singleLinkedNode = new SingleLinkedNode(1);
        SingleLinkedNode singleLinkedNode2 = new SingleLinkedNode(2);
        SingleLinkedNode singleLinkedNode22 = new SingleLinkedNode(3);
        SingleLinkedNode singleLinkedNode3 = new SingleLinkedNode(4);
        singleLinkedNode3.next = new SingleLinkedNode(5);
        singleLinkedNode22.next = singleLinkedNode3;
        singleLinkedNode2.next = singleLinkedNode22;
        singleLinkedNode.next = singleLinkedNode2;
        SingleLinkedNode node = removeElements(singleLinkedNode, 4);
        System.out.println(node.toString());
    }


}
