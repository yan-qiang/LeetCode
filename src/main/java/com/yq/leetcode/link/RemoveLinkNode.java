package com.yq.leetcode.link;

import com.fasterxml.jackson.databind.util.LinkedNode;
import com.yq.leetcode.base.model.SingleLinkedNode;

/**
 * @ClassName :  RemoveLinkNode
 * @Author :  Yanqinag
 * @Date :  2020-05-23 12:28
 * @Description :
 *
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 *
 * 1 1 1 2 3
 */
public class RemoveLinkNode {


    public static SingleLinkedNode removeLinkNode(SingleLinkedNode node) {

        SingleLinkedNode curr = node;
        while (curr != null && curr.next != null) {
            // 1 1 1 2 3
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            }else {
                curr = curr.next;
            }
        }
        return node;
    }


    public static void main(String[] args) {
        SingleLinkedNode singleLinkedNode = new SingleLinkedNode(1);
        SingleLinkedNode singleLinkedNode2 = new SingleLinkedNode(1);
        SingleLinkedNode singleLinkedNode22 = new SingleLinkedNode(1);
        SingleLinkedNode singleLinkedNode3 = new SingleLinkedNode(3);
        singleLinkedNode3.next = new SingleLinkedNode(4);
        singleLinkedNode22.next = singleLinkedNode3;
        singleLinkedNode2.next = singleLinkedNode22;
        singleLinkedNode.next = singleLinkedNode2;
        SingleLinkedNode node = removeLinkNode(singleLinkedNode);
        System.out.println(node.toString());

    }
}