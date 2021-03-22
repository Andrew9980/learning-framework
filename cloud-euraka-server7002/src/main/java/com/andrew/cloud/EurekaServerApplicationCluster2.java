package com.andrew.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplicationCluster2 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplicationCluster2.class, args);
    }

}
