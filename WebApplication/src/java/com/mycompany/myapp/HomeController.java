package com.mycompany.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		System.out.println("home()");
		return "home";
	}
	@RequestMapping("/html")
	public String html() {
		return "html";
	}
    
	@RequestMapping("/css0/exam01")
	public String cssExam01() {
		return "css0/exam01";
	}
}
