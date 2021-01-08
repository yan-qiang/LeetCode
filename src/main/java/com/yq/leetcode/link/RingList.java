package com.yq.leetcode.link;

/**
 * @author yanqiang
 * @className RingList
 * @date 2020/12/29
 * @description
 **/
public class RingList {

/*
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (fast == slow) {
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }*/


    public static void main(String[] args) {

        String[] s1 = {"ab", "c"};
        String[] s2 = {"a","bc"};

        StringBuilder sb1 = new StringBuilder();
        for (String s : s1) {
            sb1.append(s);
        }

        StringBuilder sb2 = new StringBuilder();
        for (String s : s2) {
            sb2.append(s);
        }
        String s = sb2.toString();
        System.out.println(sb1.toString().equals(s));

    }

}
