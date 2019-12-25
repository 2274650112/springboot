package com.blb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

/**
 * @Author: Mr.Xue
 * @Description:
 * @Date: Created in 12:14 2019/12/25
 */
@Controller
@RequestMapping("say")
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("hello")
    public @ResponseBody String sayHello(){
        System.out.println(dataSource);
        return "hello springboot";
    }
}
