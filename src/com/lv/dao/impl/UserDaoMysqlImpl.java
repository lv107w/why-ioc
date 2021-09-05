package com.lv.dao.impl;

import com.lv.dao.UserDao;

public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取mysql用户");
    }
}
