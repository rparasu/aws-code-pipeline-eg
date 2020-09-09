package com.guru.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {


    @GetMapping
    public String hello()
    {
        String message = "Hello World - aws-code-pipeline";
        System.out.println("message = " + message);
        return message;
    }
}
