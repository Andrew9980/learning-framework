package com.andrew.timing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.andrew.timing.mapper")
public class TimingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimingApplication.class, args);
    }
}
