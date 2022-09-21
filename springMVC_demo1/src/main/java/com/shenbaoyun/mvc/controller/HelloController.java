package com.shenbaoyun.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shenbaoyun
 * @create 2022-09-19 15:28
 * @Controller 作为springIOC的组件将其标识为一个控制层组件
 */

@Controller
public class HelloController {
    // @RequestMapping 请求映射
    // @RequestMapping注解：处理请求和控制器方法之间的映射关系
    // @RequestMapping注解的value属性可以通过请求地址匹配请求，/表示的当前工程的上下文路径
    // localhost:8080/springMVC/
    @RequestMapping("/")
    public String index() {
        //返回视图（页面）名称
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }


}
