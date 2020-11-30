package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * description Eureka 启动类
 *
 * @author Leet
 * @date 2020-11-28 16:46
 **/
@SpringBootApplication
@EnableEurekaServer
public class Eureka7002 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7002.class, args);
    }
}
