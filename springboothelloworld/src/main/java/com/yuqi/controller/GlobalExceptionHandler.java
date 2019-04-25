package com.yuqi.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody//按照json格式来返回数据，如果返回String类型，则不写即可
    public Map<String,Object> resultError(){

        Map<String,Object> result = new HashMap<String, Object>();
        result.put("errorCode","500");
        result.put("errorMsg","系统错误");
        return result;
    }
}
