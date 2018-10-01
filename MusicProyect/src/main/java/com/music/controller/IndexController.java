package com.music.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {

	ModelAndView modelAndView = new ModelAndView();
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView inicio() {
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@RequestMapping(value = "/inicio", method = RequestMethod.POST)
    public ModelAndView irInicio(@RequestParam(value = "user", required=true) String user, @RequestParam("password") String pass) {
		modelAndView.addObject("user", user);
		modelAndView.setViewName("inicio");
		return modelAndView;	
	}
	
	@RequestMapping(value = "/gestion", method = RequestMethod.GET)
	public ModelAndView irGestion() {
		modelAndView.setViewName("gestion");
		return modelAndView;
	}
	
	
	
}
