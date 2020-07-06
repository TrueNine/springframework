package com.truenine.mapper;

import com.truenine.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/7/2
 */
public interface UserMapper {

    List<User> selectAllUserToList();

    Integer addUser(User user);

    Integer deleteUser(@Param("id") Integer id);
}
