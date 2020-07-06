package cn.TrueNine.pojo.spring;

import cn.TrueNine.controller.SpringApplicationContextConfig;
import cn.TrueNine.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/6/29
 */
public class PojoTest {

    @Test
    public void test() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringApplicationContextConfig.class);
        User user = applicationContext.getBean("getUser", User.class);
        System.out.println("user.name.toString() = " + user.name);
    }
}