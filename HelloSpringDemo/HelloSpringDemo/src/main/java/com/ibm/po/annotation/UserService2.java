package com.ibm.po.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService2 {
    @Autowired
    private UserRepository2 userRepository;
    public void add() {
        System.out.println("UserService2 add...");
        userRepository.save();
    }
}
