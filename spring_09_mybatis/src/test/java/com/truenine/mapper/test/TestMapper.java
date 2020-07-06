package com.truenine.mapper.test;

import com.truenine.mapper.UserMapper;
import com.truenine.pojo.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/7/2
 */
public class TestMapper {

    Logger logger = Logger.getLogger(TestMapper.class);

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapper userMapper = applicationContext.getBean("userMapperTwo", UserMapper.class);
        List<User> users = userMapper.selectAllUserToList();
        for (User user : users) {
            logger.info(user);
        }
    }
}