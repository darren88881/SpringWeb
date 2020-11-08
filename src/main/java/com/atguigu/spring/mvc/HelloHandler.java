package com.atguigu.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author darren
 * @create 2020-11-07 17:43
 */
@Controller
public class HelloHandler {

    @RequestMapping(value = "/hello")
    public String handle1(){

        System.out.println("到了controllerAAAA");
        return "success";
    }

    @RequestMapping(value="/testRequestParam")
    public String handle2(@RequestParam(value="name1") String name, String age, @RequestHeader(value="Connection") String value){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("value:"+value);
        return "success";
    }


    /**
     * 转发
     */
    @RequestMapping(value = "/hello1")
    public String hello1(){

        System.out.println("转发！");
        return "forward:/forward.jsp";
    }

    /**
     * 重定向
     * @return
     */
    @RequestMapping(value = "/hello2")
    public String hello2(){

        System.out.println("重定向！");
        return "redirect:/hello1";
    }

    /**
     * 获取路径上的变量;rest风格
     */
    @RequestMapping(value="/hello3/{name}")
    public String hello3(@PathVariable(value = "name") String name){
        System.out.println("name:"+name);
        return "success";
    }
}
