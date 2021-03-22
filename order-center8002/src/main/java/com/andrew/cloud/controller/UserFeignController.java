package com.andrew.cloud.controller;

import com.andrew.cloud.feignService.IUserService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
@DefaultProperties(defaultFallback = "exceptionHandle")
public class UserFeignController {

    @Autowired
    private IUserService userService;

    @GetMapping("/user/{id}")
//    @HystrixCommand(fallbackMethod = "exceptionHandle")
    public Object getUserById(@PathVariable("id") Integer id) {
        return userService.byId(id);
    }
}
