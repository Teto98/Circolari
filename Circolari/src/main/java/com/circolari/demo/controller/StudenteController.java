package com.circolari.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudenteController {
	
	@RequestMapping("/studente")
	public String studente() {
		return "studente";
	}

}
