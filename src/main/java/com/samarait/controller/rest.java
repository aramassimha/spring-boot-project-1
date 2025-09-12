package com.samarait.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/app")
public class rest {
	
	@GetMapping
	public String getname() {
		
		return "my app is running";
	}

}
