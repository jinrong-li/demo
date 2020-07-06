package com.example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: ljr
 * @Date: 2020/7/6 18:31
 */
@RestController
public class TestApi {
    @GetMapping("/test")
    public String test(){
        return "this is a test page!";
    }
}
