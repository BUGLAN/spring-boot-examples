package com.neo.controller;


import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@RestController
public class ArgumentParerController {


    /**
     * @param count: 数字
     * @return int
     */
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public int count(int count) {
        return 2 * count;
    }

    @RequestMapping(value = "/count2", method = RequestMethod.GET)
    public Object count2(HttpServletRequest request) {
        String count = request.getParameter("count");
        int result = 0;
        try {

            result = Integer.parseInt(count);
        } catch (NumberFormatException e) {
            return "解析失败";
        }
        return 2 * result;
    }

    @RestController
    public class HelloController {
        @RequestMapping(value = "/hello/{id}/{name}", method = RequestMethod.GET)
        public String sayHello(@PathVariable("id") Integer id, @PathVariable("name") String name) {
            return "id:" + id + " name:" + name;
        }
    }

    @RestController
    public class HController {
        @RequestMapping(value = "/hello/name", method = RequestMethod.GET)
        public String SaySorry(@RequestParam String name) {
            return name;
        }
    }

    @RestController
    public class JController {
        @RequestMapping(value = "/do", method = RequestMethod.POST)
        public HashMap<String, Object> SayGreet(@RequestBody User user) {

            HashMap<String, Object> map = new HashMap<>();
            map.put("use", user);
            map.put("hello", "hello");
            return map;
        }
    }

    @RequestMapping(value = "/request/json", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public HashMap<String, Object> getByRequest(@RequestParam(value="name", required = false, defaultValue = "buglan") String name,
                                                @RequestParam(value="age", required = false, defaultValue = "0") Integer age) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("age", age);
        return map;
    }

}
