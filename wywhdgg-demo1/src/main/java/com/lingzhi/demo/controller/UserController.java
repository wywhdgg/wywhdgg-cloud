package com.lingzhi.demo.controller;

import com.lingzhi.demo.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *@author dongzb
 *@date 2020/11/21 14:43
 *@version 1.0.0
 *@Description
 */
@RestController
public class UserController {


    @GetMapping("/")
    public User index() {
        User user = new User();
        user.setName("张三");
        user.setAge(28);
        user.setSex("男");
        return user;
    }


    @GetMapping("user")
    public Object getUser() {
        User user = new User();
        user.setName("张三");
        user.setAge(28);
        user.setSex("男");
        user.setSource("client1");
        System.out.println("this is client1 return response");
        return user;
    }


}
