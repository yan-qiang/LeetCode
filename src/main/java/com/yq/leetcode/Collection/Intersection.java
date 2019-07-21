package com.yq.leetcode.Collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName :  Intersection
 * @Author :  Yanqinag
 * @Date :  2019-07-21 18:43
 * @Description :  两个有序整数集合的交集？
 */
public class Intersection {


    /**
     * @Author : Yanqiang
     * @Date : 2019-07-21
     * @Params : [a, b]
     * @Return : java.util.Set<java.lang.Integer>
     * @Description : hashSet 方案
     */
    private static Set<Integer> setMethod(int[] a, int[] b){
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        //把 a 放入第一个 set 集合中
        for(int i=0; i<a.length; i++) {
            set.add(a[i]);
        }
        //循环 b 将每一个也尝试放入 set 中，如果重复，将返回 false，
        //如果为 false 说明是重复的，放入 set2 中
        for(int j=0; j<b.length; j++) {
            if(!set.add(b[j]))
                set2.add(b[j]);
        }
        return set2;
    }


    /**
     * @Author : Yanqiang
     * @Date : 2019-07-21
     * @Params : [a, b]
     * @Return : java.util.Set<java.lang.Integer>
     * @Description : 同样也是 set 的方案，也可以用其他集合
     */
    private static Set<Integer> forMethod(int[] a,int[] b){
        Set<Integer> set=new HashSet<Integer>();
        int i=0,j=0;
        while(i<a.length && j<b.length){
            //如果 a[0] < b[0]，因为是排好序的，
            //说明 a[0] 同样小于 b[0+N] ,就 i++ 取 a 里面的第二个
            if(a[i]<b[j])
                i++;
            else if(a[i]>b[j])
                //a 里面的第一个比 b 里面的第一个大，
                //就拿 b 里面的第二个与 a 里面的第一个比较
                j++;
            else{
                //相等就说明重复，放入新的 set 中，同时都++，取下一位比较
                set.add(a[i]);
                i++;
                j++;
            }
        }
        return set;
    }
}
