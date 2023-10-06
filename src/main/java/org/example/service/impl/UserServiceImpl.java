package org.example.service.impl;

import org.example.dao.UserDao;
import org.example.service.UserService;
import org.springframework.beans.factory.InitializingBean;

public class UserServiceImpl implements UserService, InitializingBean {

    // BeanFactory调用该方法，注入UserDao对象
    public void setUserDao(UserDao userDao) {
        System.out.println("setUserDao方法被调用: " + userDao);
    }

    public void init() {
        System.out.println("初始化方法被调用");
    }

    public void destroy() {
        System.out.println("销毁方法被调用");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet方法被调用");
    }
}
