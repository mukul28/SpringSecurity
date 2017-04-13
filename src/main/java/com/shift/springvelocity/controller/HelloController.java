package com.shift.springvelocity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView mymethod(){
		System.out.println("MMMM");
		return new ModelAndView("hellopage","msg","Hello First Spring");
	}
}
