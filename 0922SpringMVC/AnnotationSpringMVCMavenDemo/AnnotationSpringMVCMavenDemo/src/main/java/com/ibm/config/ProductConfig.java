package com.ibm.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Configuration
@ComponentScan("com.ibm.controller")
@Import(SpringMVCConfig.class)
public class ProductConfig {

}
