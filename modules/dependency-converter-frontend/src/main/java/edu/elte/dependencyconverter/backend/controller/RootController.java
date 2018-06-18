package edu.elte.dependencyconverter.backend.controller;

import javax.enterprise.inject.New;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicInterface2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.elte.dependencyconverter.backend.dto.MavenDto;
import edu.elte.dependencyconverter.backend.form.view.MavenFormView;

@Controller
public class RootController {
	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
	public ModelAndView getHome() {
		return new ModelAndView("home");
	}
	@RequestMapping(value = "/maven", method = RequestMethod.GET)
	public ModelAndView getMaven() {
		ModelAndView modelAndView =  new ModelAndView("maven");
		modelAndView.addObject("mavenFormView", new MavenFormView());
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
