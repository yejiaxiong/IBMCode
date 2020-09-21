package com.ibm.po.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController2 {
    @Autowired
    private UserService2 userService;
    public void execute() {
        System.out.println("UserController2 execute...");
        userService.add();
    }
}
