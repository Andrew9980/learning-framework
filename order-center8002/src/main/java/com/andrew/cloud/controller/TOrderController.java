package com.andrew.cloud.controller;


import com.andrew.cloud.service.ITOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author andrew
 * @since 2021-03-20
 */
@RestController
@RequestMapping("/t-order")
public class TOrderController {

    @Autowired
    private ITOrderService orderService;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    private String host = "http://USER-CENTER-SERVICE";

    @GetMapping("/id/{id}")
    public Object byId(@PathVariable("id") Integer id) {
        return orderService.getById(id);
    }

    @GetMapping("/userId/{id}")
    public Object byUserId(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(host + "/t-user/id/" + id, Object.class);
    }

    @GetMapping("/service")
    public Object service() {
        return discoveryClient.getServices();
    }

}

