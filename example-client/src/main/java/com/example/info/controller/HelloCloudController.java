package com.example.info.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCloudController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloCloud(){
        return "hello SpringCloud !";
    }
}
