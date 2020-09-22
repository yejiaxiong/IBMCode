package com.ibm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/index")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("message", "Hello8888 Spring MVC");
		return mav;
	}

	@RequestMapping("/hello")
	public ModelAndView handleRequest1(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("hello");
		mav.addObject("message", "Hello8888 Spring MVC");
		mav.setViewName("hello");
		return mav;
	}

	@RequestMapping("login") // 用来处理前台的login请求
	private @ResponseBody String login(@RequestParam(value = "username", required = false) String username,
			@RequestParam(value = "password", required = false) String password) {
		return "Hello " + username + ",Your password is: " + password;

	}
}
