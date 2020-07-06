package cn.TrueNine.service;

import cn.TrueNine.dao.UserDAO;

/**
 * 用户服务层接口实现类
 *
 * @author TrueNine
 * @version 1.0
 * @date 2020/6/27
 */
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    /**
     * 利用 set实现动态值的注入
     *
     * @param userDAO 实现类
     */
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void getUser() {
        userDAO.getUser();
    }
}
