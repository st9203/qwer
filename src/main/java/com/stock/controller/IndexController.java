package com.stock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@GetMapping("/index")
	public ModelAndView index() {
		String var = "대성공!";
		ModelAndView mav = new ModelAndView();
		mav.addObject("var",var);
		mav.setViewName("index");
		return mav;
	}
	
}
