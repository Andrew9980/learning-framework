package com.andrew.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/login-success")
    public String success() {
        return "login success";
    }

    @GetMapping("/r/r1")
    public String r1() {
        return "r1";
    }

    @GetMapping("/r/r2")
    public String r2() {
        return "r2";
    }

}
