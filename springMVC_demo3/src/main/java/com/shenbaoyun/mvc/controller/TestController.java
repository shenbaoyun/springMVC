package com.shenbaoyun.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转
 * @author shenbaoyun
 * @create 2022-09-20 16:09
 */
@Controller
public class TestController {

    /*@RequestMapping("/")
    public String index(){
        return "index";
    }*/

    @RequestMapping("/test_view")
    public String testView(){
        return "test_view";
    }
}
