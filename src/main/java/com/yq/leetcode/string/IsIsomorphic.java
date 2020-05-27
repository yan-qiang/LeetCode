package com.yq.leetcode.string;

/**
 * @ClassName :  IsIsomorphic
 * @Author :  Yanqinag
 * @Date :  2020-05-26 12:54
 * @Description :
 */
public class IsIsomorphic {


    public static void main(String[] args) {

        String a = "add";
        String b = "egg";
        boolean isomorphic = isIsomorphic(a,b);
        System.out.println(isomorphic);
    }

    public static boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int[] mapS = new int[128];
        int[] mapT = new int[128];
        for (int i = 0; i < n; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            //当前的映射值是否相同
            if (mapS[c1] != mapT[c2]) {
                return false;
            } else {
                //是否已经修改过，修改过就不需要再处理
                if (mapS[c1] == 0) {
                    mapS[c1] = i + 1;
                    mapT[c2] = i + 1;
                }
            }
        }
        return true;
    }
}
