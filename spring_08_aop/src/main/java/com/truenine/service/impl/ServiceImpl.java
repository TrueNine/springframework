package com.truenine.service.impl;

import com.truenine.service.Service;

/**
 * @author TrueNine
 * @version 1.0
 * @date 2020/7/1
 */
public class ServiceImpl implements Service {

    public ServiceImpl() {

    }

    @Override
    public void add() {
        System.out.println("增加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void update() {
        System.out.println("修改用户");
    }

    @Override
    public void select() {
        System.out.println("查询用户");
    }
}
