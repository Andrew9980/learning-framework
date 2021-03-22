package com.andrew.timing.controller;


import com.andrew.timing.service.ITLearningFeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户动态 前端控制器
 * </p>
 *
 * @author andrew
 * @since 2021-03-21
 */
@RestController
@RequestMapping("/t-learning-feed")
public class TLearningFeedController {

    @Autowired
    private ITLearningFeedService feedService;

//    @PostMapping("")

}

