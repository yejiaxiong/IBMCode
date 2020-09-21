package com.ibm.po.newannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** 配置类等价于applicationContext.xml文件 */
@Configuration
public class AppConfig {

    /** 给容器中注册一个bean,类型是方法返回值，id就是方法名称*/
    @Bean
    public NewPerson newPerson() {
        return new NewPerson("John", 18);
    }
}
