package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PetClinicController {
	
	@GetMapping(value="")
	public String welcome() {
		return "welcome.html";
	}
}
