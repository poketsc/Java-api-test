package com.example.hello.controller;

import com.example.hello.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // 해당 class 는 rest api 를 처리하는 controller
@RequestMapping("/api") // requestMapping uri 를 지정해주는 annotation
public class ApiController {
//    @GetMapping("/hello") // 해당 주소 http://localhost:9090/api/hello
//    public String hello(){
//        return "hello spring boot!";
//    }
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

//    JSON
//    req -> object mapper -> object -> method -> object -> object mapper -> json -> response
    @PostMapping("/json")
    public User json(@RequestBody User user) {
        return user;
    }

//    ResponseEntity
    @PutMapping("/put-response")
    public ResponseEntity<User> put(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
