package com.yq.leetcode;

import com.yq.leetcode.dispatcherServlet.MyDispatcherServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class LeetcodeApplication {

    private static final Logger log = LoggerFactory.getLogger(LeetcodeApplication.class);

    /**
     * @Author : Yanqiang
     * @Date : 2019-07-30
     * @Params : [args]
     * @Return : void
     * @Description : 启动类
     */
    public static void main(String[] args) {
        SpringApplication.run(LeetcodeApplication.class, args);
        log.info("=======================启动成功===========================");
    }

    /**
     * @Author : Yanqiang
     * @Date : 2019-07-30
     * @Params : []
     * @Return : org.springframework.web.servlet.DispatcherServlet
     * @Description : 声明重写的 DispatcherServlet
     */
    @Bean
    @Qualifier(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_BEAN_NAME)
    public DispatcherServlet dispatcherServlet(){
        return new MyDispatcherServlet();
    }

}
