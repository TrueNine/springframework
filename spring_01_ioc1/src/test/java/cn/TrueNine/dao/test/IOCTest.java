package cn.TrueNine.dao.test;

import cn.TrueNine.dao.UserDAOForOracle;
import cn.TrueNine.service.UserService;
import cn.TrueNine.service.UserServiceImpl;
import org.junit.Test;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/6/27
 */
public class IOCTest {

    /**
     * 测试调取服务层
     */
    @Test
    public void test() {
        // 用户实际调用的是业务层
        UserService userService = new UserServiceImpl();
        userService.setUserDAO(new UserDAOForOracle());

        userService.getUser();
    }
}
