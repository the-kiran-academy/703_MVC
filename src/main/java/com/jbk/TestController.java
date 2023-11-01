package com.jbk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class TestController {
	
	@RequestMapping("/")
	public String openLoginPage() {
		return "login";
	}
	
	@RequestMapping("/login")
	public String login (@ModelAttribute User user) {
		
		System.out.println(user);
		
		return null;
		
		
	}

}
