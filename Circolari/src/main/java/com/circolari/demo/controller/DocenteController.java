package com.circolari.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DocenteController {
	
	@RequestMapping("/docente")
	public String docente() {
		return "docente";
	}

}
