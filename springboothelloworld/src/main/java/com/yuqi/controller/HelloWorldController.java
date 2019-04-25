package com.yuqi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


//标识该接口全部返回json格式。
@RestController
public class HelloWorldController {

    @RequestMapping("/index")
    public String index(){
        return "success";
    }

    @RequestMapping("/getMap")
    public Map<String, Object> getMap(){
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("errorCode","200");
        result.put("errorMsg","成功..");
        return result;
    }
}
