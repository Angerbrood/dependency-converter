package edu.elte.dependencyconverter.backend.controller;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleProject;
import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenProject;
import edu.elte.dependecy_converter.dependecy_converter.reader.maven.MavenFileReader;
import edu.elte.dependecy_converter.dependecy_converter.transformer.maven.MavenProjectTransformer;
import edu.elte.dependecy_converter.dependecy_converter.utils.StringUtils;
import edu.elte.dependecy_converter.dependecy_converter.writer.gradle.GradleProjectWriter;
import edu.elte.dependencyconverter.backend.dto.GradleResult;
import edu.elte.dependencyconverter.backend.form.view.MavenFormView;
import edu.elte.dependecy_converter.dependecy_converter.writer.FileService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MavenController {

	@RequestMapping(value = "/uploadMaven", method = RequestMethod.POST)
	public ModelAndView uploadMaven(@ModelAttribute("mavenFormView") MavenFormView mavenFormView) {
		ModelAndView modelAndView = new ModelAndView("maven");
		MavenFormView result = new MavenFormView();
		result.setMavenDto(mavenFormView.getMavenDto());

		MavenFileReader mavenFileReader = new MavenFileReader();
		MavenProject mavenProject = mavenFileReader.getProject(FileService.getFileAsBytes(mavenFormView.getMavenDto().getLines()));
		GradleProject gradleProject = MavenProjectTransformer.transform(mavenProject);
		GradleResult gradleResult = new GradleResult();
		gradleResult.setLines(StringUtils.convertListToString(GradleProjectWriter.writeProject(gradleProject)));
		result.setGradleResult(gradleResult);
		modelAndView.addObject("mavenFormView", result);
		return modelAndView;
	}
	
}
