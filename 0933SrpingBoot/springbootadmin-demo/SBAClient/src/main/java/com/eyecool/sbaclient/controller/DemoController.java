package com.eyecool.sbaclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {

	private static Logger logger = LoggerFactory.getLogger(DemoController.class);

	
	@PostMapping("/method2")
	@ResponseBody
	public String method2() {
		logger.info("method2 is called......");
		return "method2";
	}
	
	@GetMapping("/method1")
	public String method1() {
		logger.info("method1 is called......");
		return "method1";
	}
}
