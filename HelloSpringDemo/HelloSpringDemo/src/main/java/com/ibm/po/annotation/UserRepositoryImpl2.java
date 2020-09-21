package com.ibm.po.annotation;

import org.springframework.stereotype.Repository;

@Repository("userRepository2")
public class UserRepositoryImpl2 implements UserRepository2 {
    @Override
    public void save() {
        System.out.println("UserRepositoryImpl2 save...");
    }
}
