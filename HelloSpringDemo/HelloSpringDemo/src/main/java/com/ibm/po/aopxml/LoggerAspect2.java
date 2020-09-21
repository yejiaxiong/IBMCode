package com.ibm.po.aopxml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

public class LoggerAspect2 {


    public void beforeAdvice(JoinPoint joinPoint) {

        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("@Before 前置通知 : 方法名 【 " + methodName + " 】and args are " + args);
    }

    public void afterAdvice(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("@After 后置通知 : 方法名 【 " + methodName + " 】and args are " + args);
    }


    public void declareExecutionExpression(){}

    public void afterRunningAdvice(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("@AfterReturning 返回通知 : 方法名 【 " + methodName + " 】and args are " + args + " , result is " + result);
    }

    public void afterThrowingAdvice(JoinPoint joinPoint, Exception exception) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("@AfterThrowing 异常通知 : 方法名 【 " + methodName + " 】and  exception is " + exception);
    }

}
