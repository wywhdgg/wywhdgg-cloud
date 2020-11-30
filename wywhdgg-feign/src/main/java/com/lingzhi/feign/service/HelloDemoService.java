package com.lingzhi.feign.service;


import com.lingzhi.feign.fallback.HelloDemoFallback;
import com.lingzhi.feign.model.Teacher;
import feign.Body;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name="HELLOCLIENT",fallback = HelloDemoFallback.class)
public interface HelloDemoService {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public Object getTeacher();

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public Teacher getByTeacher(@RequestParam("id")String id);

    @Body("%7B\"orderNo\": \"{orderNo}\"%7D")
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public int addOrder(@Param("orderNo")String orderNo);

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public int addTeacher(@Param("orderNo")String orderNo);




}
