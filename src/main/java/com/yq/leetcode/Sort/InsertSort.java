package com.yq.leetcode.Sort;

/**
 * @ClassName :  InsertSort
 * @Author :  Yanqinag
 * @Date :  2019-07-26 23:06
 * @Description :  插入排序
 */
public class InsertSort {

    /**
     *  使用插入排序对数组进行排序的函数
     *  待排序的数组a： 4  3  2  10  12  1  5  6
     *
     *  插入排序会将数组a 的 a[0] 4当做默认的已排好序的，
     *  第一次：a[0] 4 与 a[1] 3 相比较，如果 a[1] 3 < a[0] 4, 3 放在 4 前面,  3  4  2  10  12  1  5  6
     *
     *  第二次：a[2] 2 与 4 和 3 相比较，2 放在 3 前面,  2  3  4  10  12  1  5  6
     *
     *  第三次：a[3] 10 比 4 大，10 不用动,  2  3  4  10  12  1  5  6
     *
     *  第四次：a[3] 12 比 10 大，12 不用动,  2  3  4  10  12  1  5  6
     *
     *  第五次：a[4] 1 与 12 和 10 和 4 和 3 和 2 相比较，1从右放左依次比较了一遍，自己最小，插入到最前面,  1  2  3  4  10  12  5  6
     *
     *  第六次：a[5] 5 与 12 和 10 和 4 相比较，5 比 4 大，插入到 4 后面,  1  2  3  4  5  10  12  6
     *
     *  第七次：a[6] 6 与 12 和 10 和 5 相比较，6 比 5 大，插入到 5 后面,  1  2  3  4  5  6  10  12
     *
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
