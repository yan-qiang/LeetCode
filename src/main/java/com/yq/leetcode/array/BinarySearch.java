package com.yq.leetcode.array;

/**
 * @ClassName :  BinarySearch
 * @Author :  Yanqinag
 * @Date :  2020-05-18 09:35
 * @Description :  二分查找
 */
public class BinarySearch {


    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int search = search(arr, 8);
        System.out.println(search);
    }

    public static int search(int[] arr, int data){
        int l = 0;
        int h = arr.length-1;
        int middle = (l + h) /2;
        while (arr[middle] != data){

            if (arr[middle] > data) {
                h = middle - 1;
            }else{
                l = middle +1;
            }
            middle = (l + h) /2;
        }
        return arr[middle];
    }

}
