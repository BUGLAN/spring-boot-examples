package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot 2.0!";
    }


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "this is get method";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello1() {
        return "this is post method";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.PUT)
    public String hello2() {
        return "this is put method";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.DELETE)
    public String hello3() {
        return "this is delete method";
    }
}