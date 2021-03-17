package com.andrew.study.controller;


import com.andrew.study.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author andrew
 * @since 2021-03-16
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/{id}")
    public String byId(@PathVariable("id") int id) {
        return userService.getById(id).toString();
    }

    @PostMapping("/login-success")
    public String success() {
        return getName() + "登录成功";
    }

    @GetMapping("/r/r1")
    public String r1() {
        return getName() + " r1";
    }

    private String getName() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (!(Objects.isNull(principal)) && principal instanceof UserDetails) {
            return ((UserDetails) principal).getUsername();
        }
        return "匿名";
    }



}

