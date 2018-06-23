package edu.elte.dependencyconverter.backend.controller;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleProject;
import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenProject;
import edu.elte.dependecy_converter.dependecy_converter.reader.maven.MavenFileReader;
import edu.elte.dependecy_converter.dependecy_converter.transformer.maven.MavenProjectTransformer;
import edu.elte.dependecy_converter.dependecy_converter.utils.StringUtils;
import edu.elte.dependecy_converter.dependecy_converter.writer.FileService;
import edu.elte.dependecy_converter.dependecy_converter.writer.gradle.GradleProjectWriter;
import edu.elte.dependencyconverter.backend.form.view.ConverterFormView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MavenController {

	@RequestMapping(value = "/uploadMaven", method = RequestMethod.POST)
	public ModelAndView uploadMaven(@ModelAttribute("mavenConversationFormView") ConverterFormView mavenConversationFormView) {
		ModelAndView modelAndView = new ModelAndView("maven");
		ConverterFormView result = new ConverterFormView();
		result.setRawInputLines(mavenConversationFormView.getRawInputLines());

		MavenFileReader mavenFileReader = new MavenFileReader();
		MavenProject mavenProject = mavenFileReader.getProject(FileService.getFileAsBytes(mavenConversationFormView.getRawInputLines()));
		GradleProject gradleProject = MavenProjectTransformer.transform(mavenProject);

		result.setRawConversationResult(StringUtils.convertListToString(GradleProjectWriter.writeProject(gradleProject)));
		modelAndView.addObject("mavenConversationFormView", result);
		return modelAndView;
	}
	
}
