package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class HomeController {

	public HomeController() {
		System.out.println(this.getClass().getName());
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printHello(Model model) {
		System.out.println("im in print hello method");
		model.addAttribute("message", "hi!welcome to springs");
		return "index";
	}
}