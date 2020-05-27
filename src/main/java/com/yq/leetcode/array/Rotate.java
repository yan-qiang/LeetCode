package com.yq.leetcode.array;

/**
 * @ClassName :  Rotate
 * @Author :  Yanqinag
 * @Date :  2020-05-26 10:42
 * @Description :
 *
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 *
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * 说明:
 *
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的 原地 算法。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Rotate {


    /**
     * @Author : Yanqiang
     * @Date : 2020-05-26
     * @Params : [nums, k]
     * @Return : void
     * @Description :
     * [1,2,3,4,5,6,7] 和 k = 3
     */
    public static void rotate(int[] nums, int k) {
        int last = nums.length - 1;
        int first = nums.length - k;

        for (int i = nums.length - 1 - k; i < nums.length - 1; i++) {
            if (first < last) {
                int tmp = nums[first];
                nums[first] = nums[last];
                nums[last] = tmp;
                first++;
                last--;
            }else {
                break;
            }
        }

        int[] nums2 = new int[nums.length];
        int j = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            nums2[j] = nums[i];
            j++;
        }

        for (int i : nums2) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};

        rotate(nums,3);

    }

}
