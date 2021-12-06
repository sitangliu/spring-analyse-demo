package com.bail.analyse.springdemo.service;

/**
 * @author kai O'Brian
 * @create 2021/12/4 17:43
 */
public interface IOrderService {

    String getOrderById(Integer id);


    String getOrderByUser(Integer userId);

    String getOrderList();
}
