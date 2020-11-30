package com.lingzhi.feign.Controller;


import com.lingzhi.feign.model.Teacher;
import com.lingzhi.feign.service.HelloDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignConsumer {

    @Autowired
    HelloDemoService helloDemoService;

    @GetMapping("/find-teacher")
    public Object findTeacher(){
        return helloDemoService.getTeacher();
    }

    @GetMapping("/find-by-teacher")
    public Teacher getTeacher(@RequestParam(value ="id")String id){
        return helloDemoService.getByTeacher(id);}

}
