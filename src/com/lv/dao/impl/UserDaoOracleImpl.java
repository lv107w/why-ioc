package com.lv.dao.impl;

import com.lv.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取Oracle用户");
    }
}
