package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
 //테스트용 프로젝트 
    @GetMapping("/test")
    public String test() {
        return "test";
    }
}