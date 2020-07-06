package cn.TrueNine.service;

import cn.TrueNine.dao.UserDAO;

/**
 * 用户服务层接口
 *
 * @author TrueNine
 * @version 1.0
 * @date 2020/6/27
 */
public interface UserService {
    void getUser();

    /**
     * 用于动态设置值
     *
     * @param userDAO 实现类
     */
    void setUserDAO(UserDAO userDAO);
}
