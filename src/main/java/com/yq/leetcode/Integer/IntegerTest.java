package com.yq.leetcode.Integer;

/**
 * @ClassName : Integer
 * @Author : Yanqiang
 * @Date : 2019/5/27
 * @Description :TODO
 */
public class IntegerTest {


    private static Block holder = null;

    public static void main(String[] args) throws Exception {
        holder = new Block();
        holder = null;
        System.gc();
        //System.in.read();
    }

    static class Block {
        byte[] _200M = new byte[200*1024*1024];
        @Override
        protected void finalize() throws Throwable {
            System.out.println("invoke finalize");
        }
    }

/*    public static void main(String[] args) {
        long i = fibonacci(10);
        System.out.println(i);

    }*/

    public static long fibonacci(long number){
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
