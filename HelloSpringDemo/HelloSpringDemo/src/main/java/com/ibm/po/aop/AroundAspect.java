package com.ibm.po.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Order(1)
@Aspect
@Component
public class AroundAspect {

    /**
     * 环绕通知，很强大，但用的不多。
     * 环绕通知需要用ProceedingJoinPoint 类型的参数
     */
    @Around("execution(* com.ibm.po.aop.CalculatorImp.*(..))")
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
