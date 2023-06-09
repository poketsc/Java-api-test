package com.example.hello.controller;

import com.example.hello.dto.PutRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {
    @PutMapping("/put/{userId}")
    public PutRequest put(@RequestBody PutRequest putRequest, @PathVariable Long userId) {
        System.out.println(userId);
        System.out.println(putRequest);
        return putRequest;

    }
}
