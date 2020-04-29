package com.yq.leetcode.utils;

import java.util.*;

/**
 * @ClassName :  Product
 * @Author :  Yanqinag
 * @Date :  2020-04-28 16:02
 * @Description :
 */
public class Test {

    private volatile static Test test;
    private Test(){};

    public static Test getTest(){
        if (test == null){
            synchronized (Test.class){
                if (test == null){
                    test = new Test();
                }
            }
        }
        return test;
    }
    
    /**
     * 1.学生表
     * Student(SID,Sname,Sage,Ssex) --SID 学生编号,Sname 学生姓名,Sage 出生年月,Ssex 学生性别
     *
     * 2.课程表
     * Course(CID,Cname,TID) --CID --课程编号,Cname 课程名称,TID 教师编号
     * 3.教师表
     * Teacher(TID,Tname) --TID 教师编号,Tname 教师姓名
     * 4.成绩表
     * SC(SID,CID,score) --SID 学生编号,CID 课程编号,score 分数
     *
     * 查询平均成绩大于等于60分的同学的学生编号和学生姓名和平均成绩
     *
     * select s.sid, s,Sname, avg(score) as avg_score Student s left join SC c On s.sid = c.sid group by c.sid,c.Sname having avg(score) > 60
     *
     */

}
