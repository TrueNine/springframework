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
public class UserMapperImplTwo extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public List<User> selectAllUserToList() {
        return this.getSqlSession().getMapper(UserMapper.class).selectAllUserToList();
    }
}