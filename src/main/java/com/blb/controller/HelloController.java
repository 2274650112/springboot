package com.blb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Mr.Xue
 * @Description:
 * @Date: Created in 12:14 2019/12/25
 */
@Controller
@RequestMapping("say")
public class HelloController {
    @RequestMapping("hello")
    public @ResponseBody String sayHello(){
        return "hello springboot";
    }
}
