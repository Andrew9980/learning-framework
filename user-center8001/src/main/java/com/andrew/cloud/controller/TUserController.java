package com.andrew.cloud.controller;


import com.andrew.cloud.entity.TUser;
import com.andrew.cloud.service.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author andrew
 * @since 2021-03-20
 */
@RestController
@RequestMapping("/t-user")
public class TUserController {

    @Autowired
    private ITUserService userService;

    @GetMapping("/id/{id}")
    public Object byId(@PathVariable("id") Integer id) {
        return userService.getById(id);
    }

}

