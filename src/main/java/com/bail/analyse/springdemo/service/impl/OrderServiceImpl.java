package com.bail.analyse.springdemo.service.impl;

import com.bail.analyse.springdemo.service.IOrderService;
import com.bail.analyse.springdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author kai O'Brian
 * @create 2021/12/4 17:44
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Resource
    private IUserService userService;

    @Override
    public String getOrderById(Integer id) {
        return "order :"+id;
    }

    @Override
    public String getOrderByUser(Integer userId) {
        String user = userService.getUserById(userId);
        return user+"[order]";
    }


}
