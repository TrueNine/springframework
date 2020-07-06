package com.truenine.mapper.impl;

import com.truenine.mapper.UserMapper;
import com.truenine.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/7/2
 */
public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<User> selectAllUserToList() {
        return sqlSessionTemplate.getMapper(UserMapper.class).selectAllUserToList();
    }

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
}