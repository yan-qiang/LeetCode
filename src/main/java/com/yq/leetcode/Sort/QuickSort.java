package com.yq.leetcode.Sort;

import java.util.Arrays;

/**
 * @ClassName :  QuickSort
 * @Author :  Yanqinag
 * @Date :  2019-07-22 13:07
 * @Description :  快速排序
 *
 * 通过两个不相邻元素交换，可以一次交换消除多个逆序，加快排序速度。
 * 快速排序方法在要排序的数据已经有序的情况下最不利于发挥其长处。
 *
 *
 */
public class QuickSort {


    /**
     * @Author : Yanqiang
     * @Date : 2019-07-22
     * @Params :
     * @Return :
     * @Description : 上面还有一种方法，相比之下，这种更严谨一点
     */
    static class QuickTwo {
        public static void main(String[] args) {
            int[] arr = {7, 9, 3, 5, 7, 6, 1, 2, 4 };
            sort(arr, 0, arr.length - 1);
        }
        public static void sort(int arr[], int low, int high) {
            int start = low;
            int end = high;
            int k = arr[low];
            while (start < end) {
                // 从后往前比较，取最后一个，与临时基准值（第一个）比较，
                // 如果没有比基准值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                // 目的：找到比基准值小的值
                while (start < end && arr[end] >= k) {
                    end--;// end=6
                }
                //只有上一步找的值位于起始值的后面，才进入下面的 if
                //如果没进入这个 if 说明没有找到 比基准值【小】的值
                if (start < end) {
                    int temp = arr[end];
                    arr[end] = arr[start];
                    arr[start] = temp;
                    //进行过一次替换后，没必要将替换后的两值再次比较，所以i++直接下一位与k对比
                    start++;
                }
                // 从前往后比较
                while (start < end && arr[start] <= k) { // 如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                    start++;
                }
                if (start < end) {
                    int temp = arr[end];
                    arr[end] = arr[start];
                    arr[start] = temp;
                    end--;
                }
                // 此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
            }
            print(arr);
            System.out.print("start=" + (start + 1) + "  end=" + (end + 1) + "  k=" + k + "\n");
            // 递归
            if (start > low)//先判断start > low再次经行左边排序
                sort(arr, low, start - 1);// 左边序列。第一个索引位置到关键值索引-1
            if (end < high)//左边依次排序执行完递归后，弹栈进行右边排序
                sort(arr, start + 1, high);// 右边序列。从关键值索引+1到最后一个
        }
        // 打印数组的方法
        private static void print(int[] arr) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                if (i != (arr.length - 1)) {
                    System.out.print(arr[i] + ",");
                } else {
                    System.out.print(arr[i] + "]");
                    System.out.println();
                }
            }
        }
    }


    public static void sort(int a[], int low, int hight) {

        int start, end, temp;

        if(low > hight) {
            return;
        }
        start = low;
        end = hight;
        temp = a[start]; // 用原数组中的第一个值做基准

        while(start < end){
            //如果没有比基准值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
            while(start < end && a[end] >= temp){
                end--;
            }

            if(end > start){
                a[start] = a[end];
                start = start + 1;
            }

            while(start < end && a[start] < temp){
                start=start+1;
            }

            if(end > start){
                a[end] = a[start];
                end--;
            }
        }

        a[start] = temp;// 将基准数值替换回 a[i]

        sort(a, low, start - 1); // 对低子表进行递归排序

        sort(a, start + 1, hight); // 对高子表进行递归排序

    }

    public static void quickSort(int a[]) {

        sort(a, 0, a.length - 1);

    }

    public static void main(String[] args) {

        int a[] = {87, 49, 38, 65, 97, 76, 13, 27, 49 };

        quickSort(a);

        System.out.println(Arrays.toString(a));

    }

}
