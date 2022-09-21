package com.shenbaoyun.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shenbaoyun
 * @create 2022-09-21 16:58
 */
@Controller
public class TestController {

    @RequestMapping("/testInterceptor")
    public String testInterceptor(){
        return "success";
    }
}
