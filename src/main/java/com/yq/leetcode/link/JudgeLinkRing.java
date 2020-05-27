package com.yq.leetcode.link;

import com.yq.leetcode.base.model.SingleLinkedNode;

import java.util.HashSet;

/**
 * @ClassName :  JudgeLinkRing
 * @Author :  Yanqinag
 * @Date :  2020-05-13 14:45
 * @Description : 判断一个链表是否有环
 */
public class JudgeLinkRing {

    public static void main(String[] args) {
        SingleLinkedNode singleLinkedNode = new SingleLinkedNode(1);
        SingleLinkedNode singleLinkedNode2 = new SingleLinkedNode(2);
        SingleLinkedNode singleLinkedNode3 = new SingleLinkedNode(3);
        singleLinkedNode3.next = new SingleLinkedNode(4);
        singleLinkedNode2.next = singleLinkedNode3;
        singleLinkedNode.next = singleLinkedNode2;

    }

    /**
     * @Author : Yanqiang
     * @Date : 2020-05-13
     * @Params : [node]
     * @Return : java.lang.Boolean
     * @Description : set遍历法，O(n)
     */
    public static Boolean linkRing(SingleLinkedNode singleLinkedNode){
        if (singleLinkedNode == null){
            return false;
        }
        HashSet<SingleLinkedNode> set = new HashSet<>();
        while (singleLinkedNode.next != null){
            if (!set.contains(singleLinkedNode)) {
                set.add(singleLinkedNode);
                singleLinkedNode = singleLinkedNode.next;
            }else {
                return true;
            }
        }
        return false;
    }
}
