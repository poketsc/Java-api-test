package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account) {

        System.out.println(userId);
        System.out.println(account);

//        delete -> 리소스 삭제 200 ok
//        삭제할 데이터가 없어도 에러를 줄 필요가 없음
    }
}
