package com.gasystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	
	@GetMapping("/")
	public String showLogin()
	{
		return "views/login";
	}
	
	@PostMapping("/")
	public String showProfile()
	{
		return "views/profile";
	}
}
