package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RakhiController {
	
	@GetMapping("rakhi.html")
	public String greetings()
	{
		return "rakhi special";
	}

}
