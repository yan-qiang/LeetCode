package com.yq.leetcode.string;

import com.sun.codemodel.internal.JForEach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName : Solution
 * @Author : Yanqiang
 * @Date : 2019/5/21
 * @Description :无重复字符的最长子串
 */
public class Solution {

    /**
     * @Author : Yanqiang
     * @Date : 2019/5/17
     * @Param : [s]
     * @return : int
     * @Description : 使用 HashMap 这个数据结构来建立字符和其最后出现位置之间的映射
     */
    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        //返回最长记录
        int res = 0;
        //
        int left = 0;

        for (int i = 0; i < s.length(); i++) {

            if (hashMap.containsKey(s.charAt(i))) {
                //获取当前字符
                char c = s.charAt(i);
                //从map里拿到重复的这个key的value，也就是序列号
                Integer integer = hashMap.get(c);
                //比较当前这个序列号与
                left = Math.max(left, integer);
            }
            //两个当前字符间的字符的数量 = 当前出现的位置 - 上一次出现的位置
            int a = (i + 1) - left;
            //比较 最长记录 与 a
            res = Math.max(res, a);
            //更新当前字符最后出现的位置
            hashMap.put(s.charAt(i), i + 1);
        }
        return res;
    }




    /**
     * @Author : Yanqiang
     * @Date : 2019/5/24
     * @Param : [nums, target]
     * @return : int[]
     * @Description : 两数之和, ---暴力运算
     */
    public static int[] twoSum1(int[] nums, int target) {
        //定义默认返回值
        int[] result = {0,0};

        for (int i = 0; i<nums.length; i++){
            //目标值a = 两数之和 - 当前值
            int a = target - nums[i];
            //从当前值往后循环，比如{2, 7, 11, 15};i为2，就从7开始查
            for (int k = i+1; k<nums.length; k++){
                //如果nums[k] = 目标值a,说明找到了
                if (nums[k] == a){
                    result[0] = i;
                    result[1] = k;
                }
            }
        }
        return result;
    }
    /**
     * @Author : Yanqiang
     * @Date : 2019/5/24
     * @Param : [nums, target]
     * @return : int[]
     * @Description : 两数之和, ---HashMap匹配
     */
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //目标值a = 两数之和 - 当前值
            int a = target - nums[i];
            //如果HashMap包含目标值 a=nums[i] ,说明找到了
            if (map.containsKey(a)) {
                return new int[] { map.get(a), i };
            }
            //如果没有重复的，HashMap存放的是Map<当前值, 当前值的数组下标>
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public static int reverse(int x) {
        int a = 0;
        String s = String.valueOf(x);
        StringBuffer buffer = new StringBuffer(s);
        buffer.reverse();
        if (x < 0){
            s.replace("-","");
            a = Integer.parseInt("-"+buffer);
        }

        return 1;
    }


    public static void main(String[] args) {
        //int[] nums = {3,2,4};
        //int[] nums = {2, 7, 11, 15};
        //System.out.println(Arrays.toString(twoSum2(nums, 9)));
        String str = "abcdabcdaaa";
        Map<Character, Integer> a = a(str);
        for (Map.Entry<Character, Integer> i : a.entrySet()) {
            System.out.println("key:"+i.getKey() +" value "+ i.getValue());
        }
    }

    private static Map a(String str){
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
