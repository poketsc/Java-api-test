package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")
    public String Hello() {
        return "get Hello";
    }

//    옛날 방식
    @RequestMapping(path = "/hi",method = RequestMethod.GET) //get / http://localhost:9090/api/get/hi
    public String hi() {
        return "hi";
    }

//    http://localhost:9090/api/get/path-variable{name}
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name="name") String pathName) {
        System.out.println("PathVariable : " + pathName);
        return pathName;
    }

    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });

        return sb.toString();
    }

    @GetMapping("query-param02")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ){
        return name + email + age;
    }

    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest){
        return userRequest.toString();
    }
}
