package com.shenbaoyun.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author shenbaoyun
 * @create 2022-09-19 16:22
 */
@Controller
//@RequestMapping("/hello")
public class RequestMappingController {

    @RequestMapping(
            value = {"/testRequestMapping","/test"},
            method = {RequestMethod.GET,RequestMethod.POST},
            params = {"username"}
    )
    public String success(){
        return "success";
    }

    @RequestMapping("/testGetMapping")
    public String testGetMapping() {
        return "success";
    }

    @RequestMapping(
            value = "/testPut",
            method = {RequestMethod.PUT}
    )
    public String testPut() {
        return "success";
    }

    @RequestMapping(value = "/testParamsAndHeaders",
            headers = {"Host=localhost:8080 "}
    )
    public String testParamsAndHeaders(){
        return "success";
    }


    @RequestMapping("/**/testAnt")
    public String testAnt(){
        return "success";
    }
    @RequestMapping("/testPath/{id}/{username}")
    public String testPath(@PathVariable("id") Integer id ,@PathVariable("username") String  username){
        System.out.println("id     "+id+"\tuser:" + username);
        return "success";
    }



}
