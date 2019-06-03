package com.yq.leetcode.Thread;

/**
 * @ClassName : MyTask
 * @Author : Yanqiang
 * @Date : 2019/5/27
 * @Description :TODO
 */
public class MyTask  implements Runnable{
    private  int num=200;
    @Override
    public void run() {
        try {
            num--;
            System.out.println("num---------->"+num);
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) throws Exception{
        MyTask task=new MyTask();
        for(int i=0;i<200;i++){
            Thread t=new Thread(task);
            t.start();
        }
    }
}