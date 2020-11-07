package com.atguigu.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author darren
 * @create 2020-11-07 17:43
 */
@Controller
public class HelloHandler {

    @RequestMapping(value = "/hello")
    public String hello(){

        System.out.println("到了controllerAAAA");
        return "/WEB-INF/pages/success.jsp";
    }
}
