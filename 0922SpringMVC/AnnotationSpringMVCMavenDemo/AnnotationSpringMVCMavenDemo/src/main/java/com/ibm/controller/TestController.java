package com.ibm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/do")
	@ResponseBody
	public String test() {
		System.out.println("This is test AnnotationSpringMVC restful ");
		return "ok!";
	}

}
