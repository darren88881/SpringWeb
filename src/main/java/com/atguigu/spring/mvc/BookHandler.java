package com.atguigu.spring.mvc;

import com.atguigu.spring.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping(value = "/response/getAjax")
    @ResponseBody
    public Student getAjax(){
        Student stu = new Student("张三","22","180");
        return stu;
    }
    @RequestMapping(value = "/response/sendAjax")
    public String sendAjax(@RequestBody Student stu){
        System.out.println(stu);
        return "success";
    }
}
