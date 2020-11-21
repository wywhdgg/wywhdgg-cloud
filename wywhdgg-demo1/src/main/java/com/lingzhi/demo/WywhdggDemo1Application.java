package com.lingzhi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
//@RefreshScope
public class WywhdggDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(WywhdggDemo1Application.class, args);
    }

}
