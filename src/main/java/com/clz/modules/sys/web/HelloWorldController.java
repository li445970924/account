package com.clz.modules.sys.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String index() {
        /*mapper.selectByPrimaryKey("1");*/
        return "Hello World";
    }
}
