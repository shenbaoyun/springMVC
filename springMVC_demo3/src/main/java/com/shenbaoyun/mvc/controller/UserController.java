package com.shenbaoyun.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author shenbaoyun
 * @create 2022-09-21 8:43
 */
@Controller
public class UserController {

    /**
     * 使用restful模拟用户资源的增删改查
     * /User      Get        查询所有用户信息
     * /User/1    Get        根据ID查询用户信息
     * /User      Post       添加用户信息
     * /User/1    DELETE     删除用户信息
     * /User      PUT        修改用户信息
     */
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getAllUser(){
        System.out.println("查询所有用户信息");
        return "success";
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getUserById(){
        System.out.println("根据用户ID查询用户信息");
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String InsertUser(String username,String password){
        System.out.print("添加用户信息:");
        System.out.println("username:"+username+"\tpasswprd:"+password);
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String UpdatetUser(String username,String password){
        System.out.print("修改用户信息:");
        System.out.println("username:"+username+"\tpasswprd:"+password);
        return "success";
    }

}
