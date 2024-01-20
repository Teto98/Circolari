package com.circolari.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AmministratoreController {
	
	@RequestMapping("/amministratore")
	public String amministratore() {
		return "amministratore";
	}

}
