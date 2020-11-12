package com.atguigu.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author darren
 * @create 2020-11-12 20:52
 */
@Controller
public class ResponseHandler {

    @RequestMapping(value ="/response/handle01",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String handle01(){
        return "成功";
    }

    @RequestMapping(value ="/response/handle02")
    public ModelAndView handle02(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name","李明");
        mv.setViewName("success");
        return mv;
    }

}
