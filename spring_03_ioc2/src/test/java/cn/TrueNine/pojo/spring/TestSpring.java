package cn.TrueNine.pojo.spring;

import cn.TrueNine.pojo.Pojo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/6/27
 */
public class TestSpring {

    /**
     * 测试引入对象
     */
    @Test
    public void test() {
        // 获取 spring 上下文对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // 对象都已经交由 spring 管理,取出即可
        Object hello = applicationContext.getBean("hello");
        // 进行强转
        Pojo object = hello instanceof Pojo ? (Pojo) hello : null;
        // 使用该对象
        System.out.println(object);
    }
}