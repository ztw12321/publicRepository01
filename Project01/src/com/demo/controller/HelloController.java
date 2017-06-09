package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(value="/world", method=RequestMethod.GET)
	public String hello(Model model){
		model.addAttribute("msg", "ÄãºÃ£¡");
		return "index";
	}
	
}
