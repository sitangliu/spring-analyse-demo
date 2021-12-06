package com.bail.analyse.springdemo.config;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Description：create
 * @author: ext.liukai3
 * @date: 2021/12/6 10:50
 */
@Aspect
@Component
public class CoreAspectJ {


    @Before(value = "execution(* com.bail.analyse.springdemo.service.IOrderService.*(..))")
    public void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println("我是专门拦截订单接口的,当前执行方法是:"+name+",参数为：");
        Arrays.stream(args).forEach(a->System.out.println(a));
    }

    @After(value = "execution(* com.bail.analyse.springdemo.service.IOrderService.*(..))")
    public void after(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println("我是专门拦截订单接口的,方法"+name+"执行完毕");
    }

}
