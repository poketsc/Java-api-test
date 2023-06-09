package com.example.hello.controller;

import com.example.hello.dto.PostRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

//    @PostMapping("/post")
//    public void post(@RequestBody Map<String, Object> requestData){
//
//        requestData.forEach((key, value) -> {
//            System.out.println(key);
//            System.out.println(value);
//        });
//    }

    @PostMapping("/post")
    public void post(@RequestBody PostRequest postRequest){

        System.out.println(postRequest);
    }
}
