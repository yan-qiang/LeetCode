package com.yq.leetcode.Sort;

import java.util.Arrays;

/**
 * @ClassName :  BinarySearch
 * @Author :  Yanqinag
 * @Date :  2019-07-21 19:16
 * @Description :  二分法查找
 */
public class BinarySearch {

    /**
     * @Author : Yanqiang
     * @Date : 2019-07-21
     * @Params :
     * @Return :
     * @Description : 查找一个数组元素的下标。
     *
     * 二分法适用于已经排好序的数组，定义两个变量，一个low,一个high,则mid=(low+high)/2
     *
     * 算法核心：
     * 如果 value==arr[mid],中间值正好等于要查找的值，则返回下标，return mid;
     *
     * 如果 value<arr[mid],要找的值小于中间的值，则再往数组的小端找，high=mid-1;
     *
     * 如果 value>arr[mid],要找的值大于中间的值，则再往数组的大端找，low=mid+1;
     */
    public static int myBinarySearch(int[] arr,int value) {
        int low=0;
        int high=arr.length-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(value==arr[mid]) {
                return mid;
            }
            if(value>arr[mid]) {
                low=mid+1;
            }
            if(value<arr[mid]) {
                high=mid-1;
            }

        }
        return -1;//没有找到返回-1
    }

    public static void main(String[] args) {
        int[] arr= {30,20,50,10,80,9,7,12,100,40,8,0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(myBinarySearch(arr,40));
    }

    static int myBinarySearchTest(int[] arr,int value) {
        //1234567
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (value == arr[mid]){
                return mid;
            }
            if (value > arr[mid]){
                low = mid+1;
            }
            if (value < arr[mid]){
                high = mid-1;
            }
        }
        return -1;

    }

}
