package com.qxk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author 86080
 * @version 1.0
 * @date 2023/06/19 09:00
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "hello sb";
    }
}
