package com.atguigu.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author darren
 * @create 2020-11-12 20:52
 */
@Controller
public class ResponseHandler {


    /**
     * 相应字符串
     * @return
     */
    @RequestMapping(value ="/response/handle01",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String handle01(){
        return "成功";
    }

    /**
     * 转发携参
     * @return
     */
    @RequestMapping(value ="/response/handle02")
    public ModelAndView handle02(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name","李明");
        mv.setViewName("success");
        return mv;
    }

    /**
     * Application 域和session域携带参数
     */
    @RequestMapping(value = "/response/handle03")
    public String handle03(HttpSession session){
        session.setAttribute("session","session-value");
        session.getServletContext().setAttribute("Application","applection-value");
        return "success";
    }

}
