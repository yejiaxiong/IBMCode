package com.ibm.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.demo.config.ConfigBeanProperty;

@RestController
public class TestController {
	@Autowired
	private Environment environment; // 注入环境

	@Autowired
	private ConfigBeanProperty configBeanProperty;

	@Value("${springboot.demo.name}")
	private String name;
	@Value("${springboot.demo.age}")
	private String age;

	@RequestMapping(value = "/get/value")
	public String getByValue() {
		return "get properties value by ''@Value'' :" +
		// 1、使用@Value注解读取
				" name=" + name + " , age=" + age;
	}

	@RequestMapping(value = "/get/environment")
	public String getByEnv() {
		return "get properties value by  ''Environment'' :" +
		// 1、使用@Value注解读取
				" name=" + environment.getProperty("springboot.demo.sex") + " , age="
				+ environment.getProperty("springboot.demo.age");
	}

	@RequestMapping(value = "/get/config")
	public String getByConfigBean() {
		return "get properties value by  ''@ConfigurationProperties'' :" + " phone=" + configBeanProperty.getPhone()
				+ " , hobby=" + configBeanProperty.getHobby();
	}
}
