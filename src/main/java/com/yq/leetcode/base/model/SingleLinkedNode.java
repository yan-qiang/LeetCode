package com.yq.leetcode.base.model;

/**
 * @ClassName :  Node
 * @Author :  Yanqinag
 * @Date :  2020-05-23 14:36
 * @Description :
 */
public class SingleLinkedNode {

    public int val;
    public SingleLinkedNode next;
    public SingleLinkedNode(int val){
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
