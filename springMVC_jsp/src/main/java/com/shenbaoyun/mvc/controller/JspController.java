package com.shenbaoyun.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shenbaoyun
 *
 * @create 2022-09-20 18:11
 */
@Controller
public class JspController {
    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}
