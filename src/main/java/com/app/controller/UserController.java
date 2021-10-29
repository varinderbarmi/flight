package com.app.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
	
	
	@GetMapping("/greet")
	public String greet() {
		return "Welcome User";
	}
	
	@GetMapping("/home") 
	public String homepage() { 
		return "Home Page";
	}
	
	@GetMapping("/auth") 
	public String auth() { 
		return "auth";
	}
	
	@Cacheable(key="#username", value="usernameCache")
	@GetMapping("/greet/{username}")
	public String greet(@PathVariable String username) {
		return "Welcome "+ username;
	}
	
	
}
