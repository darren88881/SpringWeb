package com.atguigu.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author darren
 * @create 2020-11-12 20:13
 */

@Controller
public class BookHandler {

    @RequestMapping(value = "/book",method = {RequestMethod.POST})
    public String addBook(){
        System.out.println("添加一本图书");
        return "success";
    }

    @RequestMapping(value = "/book/{id}",method = {RequestMethod.DELETE})
    public String deleteBook(@PathVariable("id") String id){
        System.out.println("删除"+id+"本图书");
        return "success";
    }

    @RequestMapping(value = "/book/{id}",method = {RequestMethod.PUT})
    public String updateBook(@PathVariable("id") String id){
        System.out.println("更新"+id+"本图书");
        return "success";
    }

    @RequestMapping(value = "/book/{id}",method = {RequestMethod.GET})
    public String selectBook(@PathVariable("id") String id){
        System.out.println("查询"+id+"本图书");
        return "success";
    }
}