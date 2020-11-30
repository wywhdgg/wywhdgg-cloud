package com.lingzhi.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker//客戶端的服務斷路器
//@RibbonClient(name = "helloclient", configuration = RibbonConfiguration.class)
public class WywhdggRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(WywhdggRibbonApplication.class, args);
    }


    @Bean
    @LoadBalanced//java.lang.IllegalStateException: No instances available for 127.0.0.1
    public RestTemplate template(){
        return new RestTemplate();
    }

}
