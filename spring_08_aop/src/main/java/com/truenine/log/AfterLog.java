package com.truenine.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/7/1
 */
public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行方法: " + method.getName() +
                " 并且返回: " + returnValue);
    }
}
