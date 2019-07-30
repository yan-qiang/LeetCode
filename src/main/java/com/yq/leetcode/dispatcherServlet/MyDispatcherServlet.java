package com.yq.leetcode.dispatcherServlet;

import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName :  MyDispatcherServlet
 * @Author :  Yanqinag
 * @Date :  2019-07-30 11:52
 * @Description :  自定义 DispatcherServlet
 *  PS: 记得将这个类在启动类中声明
 */
public class MyDispatcherServlet extends DispatcherServlet {


    /**
     * @Author : Yanqiang
     * @Date : 2019-07-30
     * @Params : [request, response]
     * @Return : void
     * @Description : 继承 DispatcherServlet 调用父类的 doDispatch 方法
     */
    protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
        super.doDispatch(request, response);
    }
}
