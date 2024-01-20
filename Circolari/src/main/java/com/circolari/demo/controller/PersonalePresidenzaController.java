package com.circolari.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonalePresidenzaController {
	
	@RequestMapping("/personale_presidenza")
	public String personalePresidenza() {
		return "personale_presidenza";
	}

}
