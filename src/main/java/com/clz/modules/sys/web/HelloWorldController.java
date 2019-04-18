package com.clz.modules.sys.web;

import com.clz.modules.sys.domain.dao.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    SysUserMapper mapper;
    @RequestMapping("/hello")
    public String index() {
        /*mapper.selectByPrimaryKey("1");*/
        return "Hello World";
    }
}
