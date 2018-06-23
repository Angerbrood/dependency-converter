package edu.elte.dependencyconverter.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.elte.dependencyconverter.backend.form.view.ConverterFormView;

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
		return new ModelAndView("gradle");
	}
	@RequestMapping(value = "/manual", method = RequestMethod.GET)
	public ModelAndView getManual() {
		return new ModelAndView("manual");
	}
}
