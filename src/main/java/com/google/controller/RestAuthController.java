package com.google.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAuthController {

	@GetMapping("/")
	public String getMessage() {

		return "Welcome to Oauth Security Demo";
	}

}
