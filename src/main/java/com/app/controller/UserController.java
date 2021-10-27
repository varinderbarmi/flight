package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/greet")
	public String greet() {
		return "Welcome User";
	}
	
	/*
	 * @GetMapping("/authenticate") public String authenticate() { return
	 * "Welcome User"; }
	 */
	
	@GetMapping("/greet/{username}")
	public String greet(@PathVariable String username) {
		return "Welcome "+ username;
	}
	
	
}
