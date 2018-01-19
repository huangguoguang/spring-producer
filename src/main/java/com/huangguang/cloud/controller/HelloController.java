package com.huangguang.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description: 提供服务
 * User : huangguang
 * DATE : 2018-01-18 17:31
 */
@RestController
public class HelloController {

    @RequestMapping(value = "hello")
    public String hello(@RequestParam("name") String name) {
        return "hello " + name + ", this is eureka 1";
    }
}
