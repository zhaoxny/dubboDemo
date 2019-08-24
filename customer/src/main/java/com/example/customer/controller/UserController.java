package com.example.customer.controller;

import com.example.common.entity.User;
import com.example.common.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhaoxingyu
 * @description
 * @created 2019/8/23
 * @modified by zhaoxingyu on 2019/8/23
 */
@RestController
public class UserController {
    @Resource
    private UsersService userService;

    @GetMapping("/getUser")
    public User user(){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        System.out.println(userService.hashCode()+"!!!!!!!!!!!!!!!!");
        return userService.findUser();
    }

}
