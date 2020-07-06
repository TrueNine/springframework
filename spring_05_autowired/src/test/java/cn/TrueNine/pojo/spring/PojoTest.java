package cn.TrueNine.pojo.spring;

import cn.TrueNine.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/6/29
 */
public class PojoTest {

    /**
     * 用于测试自动装配???
     */
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        People people = applicationContext.getBean("people", People.class);
        System.out.println("people = " + people);
        people.getDog().shout();
        people.getCat().shout();
    }
}
