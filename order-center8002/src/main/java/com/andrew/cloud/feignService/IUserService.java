package com.andrew.cloud.feignService;

import com.andrew.cloud.feignService.impl.IUserServiceHystrixImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(value = "user-center-service", fallback = IUserServiceHystrixImpl.class)
public interface IUserService {

    @GetMapping("/t-user/id/{id}")
    Object byId(@PathVariable("id") Integer id);

}
