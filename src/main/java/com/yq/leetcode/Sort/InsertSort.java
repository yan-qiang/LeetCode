package com.yq.leetcode.Sort;

/**
 * @ClassName :  InsertSort
 * @Author :  Yanqinag
 * @Date :  2019-07-26 23:06
 * @Description :  插入排序
 */
public class InsertSort {

    /**
     * 使用插入排序对数组进行排序的函数
     */
    public static void InsertSort(int arr[]) {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6};

        InsertSort(arr);

        printArray(arr);
    }


}
