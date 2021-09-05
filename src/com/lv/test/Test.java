package com.lv.test;

import com.lv.dao.impl.UserDaoMysqlImpl;
import com.lv.service.impl.UserServiceImpl;

public class Test {
    public static void main(String[] args) {
        UserDaoMysqlImpl userDaoMysql = new UserDaoMysqlImpl();
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(userDaoMysql);
        userService.getUser();
    }
}
