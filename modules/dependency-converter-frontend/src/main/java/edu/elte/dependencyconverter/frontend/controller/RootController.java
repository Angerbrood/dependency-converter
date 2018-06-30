package edu.elte.dependencyconverter.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.elte.dependencyconverter.frontend.form.view.ConverterFormView;

@Controller
public class RootController {
	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
	public ModelAndView getHome() {
		return new ModelAndView("home");
	}
	@RequestMapping(value = "/maven", method = RequestMethod.GET)
	public ModelAndView getMaven() {
		ModelAndView modelAndView =  new ModelAndView("maven");
		modelAndView.addObject("mavenConversationFormView", new ConverterFormView());
		return modelAndView;
	}
	@RequestMapping(value = "/gradle", method = RequestMethod.GET)
	public ModelAndView getGradle() {
		ModelAndView modelAndView =  new ModelAndView("gradle");
		modelAndView.addObject("gradleConversationFormView", new ConverterFormView());
		return modelAndView;
	}
	@RequestMapping(value = "/manual", method = RequestMethod.GET)
	public ModelAndView getManual() {
		return new ModelAndView("manual");
	}

	
}
