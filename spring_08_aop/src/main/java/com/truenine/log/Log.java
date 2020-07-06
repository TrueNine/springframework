package com.truenine.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/7/1
 */
public class Log implements MethodBeforeAdvice {

    /**
     * @param method 执行目标对象的方法
     * @param args   参数列表
     * @param target 目标对象
     * @throws Throwable 异常
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        if (null != target) {
            System.out.println(target.getClass().getName() +
                    " 的 " + method.getName() +
                    " 方法被执行");
        }
    }
}
