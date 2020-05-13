package com.yq.leetcode;

import java.util.LinkedList;

/**
 * @ClassName :  Test
 * @Author :  Yanqinag
 * @Date :  2020-05-06
 * @Description :
 */
public class Test {

    /**
     * 查找数组arr中第k小的奇数,如果不存在则返回0. (arr[i] > 0 (i>=0))
     * 计算出时间复杂度（注意代码注释，尽可能不用全排序，不要使⽤库函数或脚本中已经实现好的排序算法和⼯具,需要⾃⼰实现数据结构和所需要的算法）
     */
    public static int findKth(int[] arr, int k){
        LinkedList<Integer> list = new LinkedList<>();
        //先找出所有的奇数，避免全部遍历
        for (int i = 0; i < arr.length ; i++) {
            //如果是奇数，先放到一个新的 list 中
            if (arr[i]%2==1){
                list.add(arr[i]);
            }
        }
        //转化为 int 数组
        Integer[] arr2 = list.toArray(new Integer[]{});
        //如果要查询的第 K 个值已经大于奇数组的长度，说明没有要找的值，直接返回 0，避免再次排序
        if (arr2.length < k){
            return 0;
        }
        //对所有的奇数集合排序
        Integer[] sort = sort(arr2);
        //取到第 K 个值
        int i = sort[k];
        return i;
    }

    /**
     * @Author : Yanqiang
     * @Date : 2020-05-06
     * @Description : 冒泡排序
     */
    private static Integer[] sort(Integer[] data){
        for (int i = 0; i < data.length; i++) {
            //定义一个标记点，如果第二层循环走完还是为 true，说明当前那层的时候，排序已经完成了，直接跳出就行
            boolean flag = true;
            for (int j = 0; j < data.length - 1; j++) {
                //如果当前的大于后面一位的值，说明需要互换位置
                if (data[j] > data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }
        return data;
    }

    /**
     * @Author : Yanqiang
     * @Date : 2020-05-06
     * @Description : main 方法测试
     */
    public static void main(String[] args) {
        int[] array = {4,2,8,9,5,7,6,1,3};
        int kth = findKth(array, 12);
        System.out.println(kth);
    }
}
