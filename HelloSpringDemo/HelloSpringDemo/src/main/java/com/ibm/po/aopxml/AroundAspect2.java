package com.ibm.po.aopxml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


public class AroundAspect2 {

    public Object aroundAdvice(ProceedingJoinPoint joinPoint) {
        Object result = null;
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        try {
            System.out.println("@Around 前置通知 : 方法名 【 " + methodName + " 】and args are " + args);
            result = joinPoint.proceed();
            System.out.println("@Around 返回通知 : 方法名 【 " + methodName + " 】and args are " + args + " , result is " + result);
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("@Around 异常通知 : 方法名 【 " + methodName + " 】and  exception is " + e);
        }
        System.out.println("@Around 后置通知 : 方法名 【 " + methodName + " 】and args are " + args);

        return result;
    }

}
