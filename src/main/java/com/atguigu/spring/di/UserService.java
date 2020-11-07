package com.atguigu.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author darren
 * @create 2020-11-07 10:02
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void helloService() {
        System.out.println("UserService已被创建");
        userDao.findUsers();
    }
}
