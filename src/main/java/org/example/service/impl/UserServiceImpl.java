package org.example.service.impl;

import org.example.dao.UserDao;
import org.example.service.UserService;

public class UserServiceImpl implements UserService {

    // BeanFactory调用该方法，注入UserDao对象
    public void setUserDao(UserDao userDao) {
        System.out.println("setUserDao方法被调用: " + userDao);
    }
}
