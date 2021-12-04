package com.bail.analyse.springdemo.controller;

import com.bail.analyse.springdemo.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author kai O'Brian
 * @create 2021/12/4 17:38
 */
@RestController
@RequestMapping("/front")
public class UserController {


    @GetMapping("/user/list")
    public String getUsers(){
        return "list user:"+System.currentTimeMillis();
    }


}
