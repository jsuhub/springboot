package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class YuLiangController {
    @RequestMapping("/get")
    public String returnName(){
        return "yuliang";
    }
}
