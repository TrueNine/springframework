package com.truenine.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/7/1
 */
public class TestSpringAOP {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Service service = applicationContext.getBean("service", Service.class);
        service.delete();
    }
}