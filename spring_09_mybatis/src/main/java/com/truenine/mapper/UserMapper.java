package com.truenine.mapper;

import com.truenine.pojo.User;

import java.util.List;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/7/2
 */
public interface UserMapper {

    List<User> selectAllUserToList();

}
