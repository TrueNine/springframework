package com.truenine.service.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/7/2
 */
@Aspect
public class DiyPointCut {
    @Before("execution(* com.truenine.service.impl.ServiceImpl)")
    public void before() {
        System.out.println("DiyPointCut.before");
    }

    @After("execution(* com.truenine.service.impl.ServiceImpl.*(..))")
    public void after() {
        System.out.println("DiyPointCut.after");
    }
}