package com.joker.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

@Controller
public class HelloWorld {

    @RequestMapping("hello")
    @ResponseBody
    public Map<String,Object> showHelloWorld(){

        Map<String,Object> map=new HashMap();

        map.put("msg","helloworld");
        return map;
    }
}
