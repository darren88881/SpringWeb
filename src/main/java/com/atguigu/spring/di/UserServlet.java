package com.atguigu.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author darren
 * @create 2020-11-07 10:02
 * @Component：最普通的组件，可以被注入到spring容器进行管理
 * @Controller:控制层注解
 * @Service：service层注解
 * @Repository：Dao层注解
 * 它们的作用是一样的
 */
@Controller
public class UserServlet {

    @Autowired
    private UserService userService;

    public void helloServlet(){
        System.out.println("UserServlet已被创建");
        userService.helloService();
    }
}
