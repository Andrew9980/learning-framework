package com.andrew.cloud.feignService.impl;

import com.andrew.cloud.feignService.IUserService;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceHystrixImpl implements IUserService {
    @Override
    public Object byId(Integer id) {
        return "hystrix ---- fall back";
    }
}
