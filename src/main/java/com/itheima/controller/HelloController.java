package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author 胡国兴
 * @version 1.0
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String Hello(){
        System.out.println("hello world");
        return "OK";
    }
}
