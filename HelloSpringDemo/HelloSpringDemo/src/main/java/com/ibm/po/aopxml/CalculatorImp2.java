package com.ibm.po.aopxml;

public class CalculatorImp2 implements Calculator2 {
    @Override
    public int division2(int a, int b) {
        System.out.println("division2 方法执行了 ----> " + (a / b));
        return (a / b);
    }
}
