package com.ibm.po.annotation;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    public void execute() {
        System.out.println("UserController execute...");
    }
}
