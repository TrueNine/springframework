package com.truenine.mapper.impl;

import com.truenine.mapper.UserMapper;
import com.truenine.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/7/4
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public List<User> selectAllUserToList() {
        return getSqlSession().getMapper(UserMapper.class).selectAllUserToList();
    }

    @Override
    public Integer addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public Integer deleteUser(Integer id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}