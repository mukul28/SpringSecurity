package com.shift.springvelocity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public ModelAndView mymethod() {
		return new ModelAndView("welcomepage");
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginPage(@RequestParam(value = "fail",required = false) String fail,
	@RequestParam(value = "logout",	required = false) String logout) {
		
		ModelAndView model = new ModelAndView();
		if (fail != null) {
			model.addObject("fail", "Invalid Credentials provided.");
		}

		if (logout != null) {
			model.addObject("logout", "Logged out successfully.");
		}

		model.setViewName("login");
		return model;
	}
}
