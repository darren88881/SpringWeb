package com.atguigu.spring.di;

import org.springframework.stereotype.Repository;

/**
 * @author darren
 * @create 2020-11-07 10:02
 */
@Repository
public class UserDao {
    public void findUsers() {
        System.out.println("数据已查询！");
    }
}
