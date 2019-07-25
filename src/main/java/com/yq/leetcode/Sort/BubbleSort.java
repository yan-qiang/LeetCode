package com.yq.leetcode.Sort;

/**
 * @ClassName :  BubbleSort
 * @Author :  Yanqinag
 * @Date :  2019-07-25 16:27
 * @Description :  冒泡排序
 *
 *
 * 参考：有图
 *      https://www.cnblogs.com/ysocean/p/7896269.html
 */
public class BubbleSort {

    /**
     * 冒泡算法的运作规律如下：
     *
     * 　　①、比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     *
     * 　　②、对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数（也就是第一波冒泡完成）。
     *
     * 　　③、针对所有的元素重复以上的步骤，除了最后一个。
     *
     * 　　④、持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     */
    private static int[] sort(int[] data){

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

    //遍历显示数组
    public static void display(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {4,2,8,9,5,7,6,1,3};
        //未排序数组顺序为
        System.out.println("未排序数组顺序为：");
        display(array);
        System.out.println("-----------------------");
        array = sort(array);
        System.out.println("-----------------------");
        System.out.println("经过冒泡排序后的数组顺序为：");
        display(array);
    }
}
