package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 해당 class 는 rest api 를 처리하는 controller
@RequestMapping("/api") // requestMapping uri 를 지정해주는 annotation
public class ApiController {
    @GetMapping("/hello") // 해당 주소 http://localhost:9090/api/hello
    public String hello(){
        return "hello spring boot!";
    }
}
