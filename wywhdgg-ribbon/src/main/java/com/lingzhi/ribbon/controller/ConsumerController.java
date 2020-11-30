package com.lingzhi.ribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    private final static String HTTP1 = "http://127.0.0.1:8001/user";
    private final static String HTTP2 = "http://127.0.0.1:8002/user";


    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "callTimeoutFallback",
            // 配置线程池
            threadPoolProperties = { @HystrixProperty(name = "coreSize", value = "1"),
                    @HystrixProperty(name = "queueSizeRejectionThreshold", value = "1") },
            // 配置命令执行相关的，示例：超时时间
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3500") })
    @GetMapping("user")
    public Object user() {
//        return restTemplate.getForObject(HTTP1, Object.class);
        //不适用eureka做负载均衡,自定义ribbon
        return restTemplate.getForObject("http://helloclient/user", Object.class);
    }


    public Object callTimeoutFallback(){
        return "查询超时啦，我降级了。";
    }

    @GetMapping("/getUser")
    public String getUser() {
//        User user = new User();
//        user.setName("张三");
//        user.setAge(28);
//        user.setSex("男");
        return restTemplate.getForObject(HTTP2, String.class);
//        return restTemplate.postForObject("http://spring-cloud-ribbon-provider/user",user,String.class);
    }


}
