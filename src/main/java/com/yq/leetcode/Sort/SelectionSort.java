package com.yq.leetcode.Sort;

/**
 * @ClassName : SelectionSort
 * @Author : Yanqiang
 * @Date : 2019/5/31
 * @Description :选择排序
 */
public class SelectionSort {

    /**
     * @Author : Yanqiang
     * @Date : 2019/5/31
     * @Param : [args]
     * @return : void
     * @Description :
     *
     *  原理：   从待排序的记录中选出最小的元素，顺序放在已排好序的序列最后，直到全部记录排序完毕
     *          两层遍历，下面是以最好理解的方式讲的，实际是包含全部的，（第一位代表第i位）
     *
     *  第一步：从{3,7,5,6,9,2,0} 拿到最小的0,与第一位的交换位置，排序结果{0,7,5,6,9,2,3}
     *  第二步：从{7,5,6,9,2,3} 拿到最小的2,与第一位的交换位置，排序结果{2,5,6,9,7,3}
     *  第三步：从{5,6,9,7,3} 拿到最小的3,与第一位的交换位置，排序结果{3,6,9,7,5}
     *  第四步：从{6,9,7,5} 拿到最小的5,与第一位的交换位置，排序结果{5,9,7,6}
     *  第五步：从{9,7,6} 拿到最小的6,与第一位的交换位置，排序结果{6,7,9}
     *  第六步：从{7,9} 拿到最小的7,发现与第一位相等，跳过排序
     *  最后就得到排好序的数组
     *  PS：返回的是原数组，并不是创建的新的数组
     */
    public static void main(String[] args) {
        int[] arr={3,7,5,6,9,2,0};
        System.out.println("交换之前：");
        for(int num:arr){
            System.out.print(num+" ");
        }
        //选择排序的优化
        for(int i = 0; i < arr.length - 1; i++) {// 做第i趟排序
            int k = i;
            for(int j = k + 1; j < arr.length; j++){// 选最小的记录
                if(arr[j] < arr[k]){
                    k = j; //记下目前找到的最小值所在的位置
                }
            }
            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
            if(i != k){  //交换a[i]和a[k]
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        System.out.println();
        System.out.println("交换后：");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

}