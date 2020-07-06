package cn.TrueNine.pojo.spring;

import cn.TrueNine.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/6/27
 */
public class TestSpring {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Student bean = applicationContext.getBean(Student.class);

        System.out.println("bean = " + bean);
    }

    /**
     * 测试 p 命名空间
     * 测试通过
     */
    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeansCopy.xml");
        Student bean = applicationContext.getBean("user1", Student.class);
        System.out.println(bean);
    }

    /**
     * 测试 c 命名空间
     */
    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeansCopy.xml");
        Student user2 = applicationContext.getBean("user2", Student.class);
        System.out.println(user2);
    }
}