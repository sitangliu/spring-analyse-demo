package com.bail.analyse.springdemo.service.impl;

import com.bail.analyse.springdemo.service.IOrderService;
import com.bail.analyse.springdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author kai O'Brian
 * @create 2021/12/4 17:43
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IOrderService orderService;


    @Override
    public String getUsers() {
        return "list users:"+System.currentTimeMillis();
    }

    @Override
    public String getUserById(Integer id) {
        return "user:"+id;
    }
}
