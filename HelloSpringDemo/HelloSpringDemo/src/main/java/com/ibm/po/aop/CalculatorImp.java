package com.ibm.po.aop;

import org.springframework.stereotype.Repository;

@Repository("calculator")
public class CalculatorImp implements Calculator {

    @Override
    public int division(int a, int b) {
        System.out.println("division 方法执行了 ----> " + (a / b));
        return (a / b);
    }
}
