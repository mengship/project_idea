package com.yuqi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping("/indexController")
    public String indexController(Map<String, Object>result){
        System.out.println("IndexController...index");
        result.put("name","wangyuqi");
        result.put("sex",0);
        List<String> list = new ArrayList<String>();
        list.add("zhangsan");
        list.add("lisi");
        return "index";
    }

}
