package com.eyecool.sba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer

public class SbaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbaDemoApplication.class, args);
		System.out.println("spring boot admin server start.........");

	}

}
