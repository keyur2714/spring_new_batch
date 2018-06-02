package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(value = "/sayHello", method = RequestMethod.GET)
	public String sayHello(ModelMap modelMap) {
		System.out.println("hi...");
		modelMap.addAttribute("message", "Hello Radhe Krishna...");
		return "message";
	}

	@RequestMapping(value = "/sayBye", method = RequestMethod.GET)
	public String sayBye(ModelMap modelMap) {
		modelMap.addAttribute("message", "Good Bye");
		return "message";
	}
}
