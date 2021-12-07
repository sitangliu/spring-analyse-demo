package com.bail.analyse.springdemo.controller;

import com.bail.analyse.springdemo.service.IOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description：create
 * @author: ext.liukai3
 * @date: 2021/12/6 10:58
 */
@RestController
@RequestMapping("bail/order")
public class OrderController {

    @Resource
    private IOrderService orderService;

    @GetMapping("/getOrderDetail")
    public String getOrderDetail(Integer orderId){
        String order = orderService.getOrderById(orderId);
        return order;
    }


    @GetMapping("/getOrderList")
    public String getOrderList(){
        String orderList = orderService.getOrderList();
        return orderList;
    }

    @GetMapping("/getOrderByUser")
    public String getOrderByUser(Integer userId){
        String order = orderService.getOrderByUser(userId);
        return order;
    }
}
