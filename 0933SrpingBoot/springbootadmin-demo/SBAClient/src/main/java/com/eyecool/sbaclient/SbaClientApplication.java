package com.eyecool.sbaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = { "com.eyecool" })

public class SbaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbaClientApplication.class, args);
		System.out.println("spring boot admin client start.........");
	}

}
