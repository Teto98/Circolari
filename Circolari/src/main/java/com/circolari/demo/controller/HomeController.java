package com.circolari.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //Per dire a Spring che questo è un controller
public class HomeController {
	
	
	@RequestMapping("/") //path
	public String login() {
		return "login";
	}
	
	/*
	@RequestMapping("/") //path
	public String index() {
		return "index";
	}
	*/
}
