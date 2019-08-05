package com.neo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetController {

    @RequestMapping("/a")
    @ResponseBody
    public String hello4() {
        return "hello";
    }
}
