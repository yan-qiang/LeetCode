package com.yq.leetcode.array;

import java.util.HashMap;

/**
 * @ClassName :  FindErrorNums
 * @Author :  Yanqinag
 * @Date :  2020-05-31 20:06
 * @Description :
 *
 * 集合 S 包含从1到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，导致集合丢失了一个整数并且有一个元素重复。
 *
 * 给定一个数组 nums 代表了集合 S 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
 *
 * 示例 1:
 *
 * 输入: nums = [1,2,2,4]
 * 输出: [2,3]
 * 注意:
 *
 * 给定数组的长度范围是 [2, 10000]。
 * 给定的数组是无序的。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/set-mismatch
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FindErrorNums {



    public static int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] a = new int[2];
        for (int num : nums) {
            if (map.containsKey(num)) {
                if (map.get(num - 1) == null) {
                    a[0] = num - 1;
                    a[1] = num;
                } else {
                    a[0] = num;
                    a[1] = num + 1;
                }
            } else {
                map.put(num, num);
            }
        }
        return a;
    }

    public static void main(String[] args) {

        int[] a = {2,2};
        int[] errorNums = findErrorNums(a);
        System.out.println(errorNums);
    }


}
