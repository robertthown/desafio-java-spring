package com.example.jcc.desafiojava.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
		
	@RequestMapping("/")
	public String test() {
	return "index";
	
	}
}
