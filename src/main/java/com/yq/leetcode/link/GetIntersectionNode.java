package com.yq.leetcode.link;

import com.yq.leetcode.base.model.SingleLinkedNode;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;

/**
 * @ClassName :  GetIntersectionNode
 * @Author :  Yanqinag
 * @Date :  2020-05-25 00:06
 * @Description :
 */
public class GetIntersectionNode {

    public static void main(String[] args) {

        SingleLinkedNode singleLinkedNode3 = new SingleLinkedNode(3);

        SingleLinkedNode singleLinkedNodeJ = new SingleLinkedNode(1);
        //SingleLinkedNode singleLinkedNode2 = new SingleLinkedNode(2);
        //singleLinkedNode2.next = singleLinkedNode3;
        singleLinkedNodeJ.next = singleLinkedNode3;

        SingleLinkedNode singleLinkedNodeK = new SingleLinkedNode(5);
        SingleLinkedNode singleLinkedNode5 = new SingleLinkedNode(6);
        singleLinkedNode5.next = singleLinkedNode3;
        singleLinkedNodeK.next = singleLinkedNode5;

        System.out.println(singleLinkedNodeJ);
        System.out.println(singleLinkedNodeK);
        SingleLinkedNode singleLinkedNode = getIntersectionNode(singleLinkedNodeJ, singleLinkedNodeK);

        System.out.println(singleLinkedNode);
    }


    /**
     * @Author : Yanqiang
     * @Date : 2020-05-25
     * @Params : [headA, headB]
     * @Return : com.yq.leetcode.base.model.SingleLinkedNode
     * @Description :
     * 1 -> 3
     * 5 -> 6 -> 3
     */
    private static SingleLinkedNode getIntersectionNode(SingleLinkedNode headA, SingleLinkedNode headB) {
        if (headA == null || headB == null){
            return null;
        }

        SingleLinkedNode a = headA;
        SingleLinkedNode b = headB;
        while (a != b){
            a = a == null ? headA : a.next;
            b = b == null ? headB : b.next;
        }
        return a;
    }

    public static SingleLinkedNode getIntersectionNode2(SingleLinkedNode headA, SingleLinkedNode headB) {

        if (headA == null || headB == null) return null;
        SingleLinkedNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
