package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/new")
    public ModelAndView methood(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("new");
        mav.addObject("nums",100);
        return mav;
    }
}
