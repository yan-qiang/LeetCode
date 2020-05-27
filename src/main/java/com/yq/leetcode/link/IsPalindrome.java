package com.yq.leetcode.link;

import com.yq.leetcode.base.model.SingleLinkedNode;

import java.util.ArrayList;

/**
 * @ClassName :  IsPalindrome
 * @Author :  Yanqinag
 * @Date :  2020-05-27 22:17
 * @Description :
 * <p>
 * <p>
 * 请判断一个链表是否为回文链表。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 * <p>
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class IsPalindrome {


    /**
     * @Author : Yanqiang
     * @Date : 2020-05-27
     * @Params : [head]
     * @Return : boolean
     * @Description :
     * <p>
     * 1 -> 2 -> 3 -> 3 -> 2 -> 1
     * <p>
     * 3 -> 2 -> 1
     * 3 -> 2 -> 1
     *
     * 这个解法思路是对的，但是没有解出来，暂时先留着
     * 只想着 O(n) 的时间了，忘记了 O(2n) ≈ O(n)
     */
    public static Boolean isPalindrome(SingleLinkedNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        SingleLinkedNode node = null;
        while (head.next != null) {
            SingleLinkedNode tmp = head.next;
            if (head.val != head.next.val) {
                //null
                head.next = node;
                //1
                node = head;
                head = tmp;
            } else {
                if (node == null || node.val != tmp.next.val) {
                    return false;
                }
                node = node.next;
                head = tmp.next;
            }


        }
        return false;
    }


    public static void main(String[] args) {
        SingleLinkedNode singleLinkedNode = new SingleLinkedNode(1);
        SingleLinkedNode singleLinkedNode2 = new SingleLinkedNode(2);
        SingleLinkedNode singleLinkedNode3 = new SingleLinkedNode(3);
        SingleLinkedNode singleLinkedNode4 = new SingleLinkedNode(3);
        SingleLinkedNode singleLinkedNode5 = new SingleLinkedNode(2);
        SingleLinkedNode singleLinkedNode6 = new SingleLinkedNode(1);
        singleLinkedNode5.next = singleLinkedNode6;
        singleLinkedNode4.next = singleLinkedNode5;
        singleLinkedNode3.next = singleLinkedNode4;
        singleLinkedNode2.next = singleLinkedNode3;
        singleLinkedNode.next = singleLinkedNode2;

        Boolean b = isPalindrome2(singleLinkedNode);
        System.out.println(b);
    }


    /**
     * @Author : Yanqiang
     * @Date : 2020-05-27
     * @Params : [head]
     * @Return : java.lang.Boolean
     * @Description :
     *  先放到 list 中，再前后指针比对
     */
    static Boolean isPalindrome2(SingleLinkedNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int first = 0;
        int last = list.size()-1;

        while (first < last) {
            if (!list.get(first).equals(list.get(last))){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }

}
