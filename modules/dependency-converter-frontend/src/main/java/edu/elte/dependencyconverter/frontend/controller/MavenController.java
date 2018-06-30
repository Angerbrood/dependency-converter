package edu.elte.dependencyconverter.frontend.controller;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleProject;
import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenProject;
import edu.elte.dependecy_converter.dependecy_converter.reader.maven.MavenFileReader;
import edu.elte.dependecy_converter.dependecy_converter.transformer.maven.MavenProjectTransformer;
import edu.elte.dependecy_converter.dependecy_converter.utils.StringUtils;
import edu.elte.dependecy_converter.dependecy_converter.writer.FileService;
import edu.elte.dependecy_converter.dependecy_converter.writer.gradle.GradleProjectWriter;
import edu.elte.dependencyconverter.frontend.form.view.ConverterFormView;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;


@Controller
public class MavenController {

	@RequestMapping(value = "/uploadMaven", method = RequestMethod.POST)
	public ModelAndView uploadMaven(@ModelAttribute("mavenConversationFormView") ConverterFormView mavenConversationFormView) {
		ModelAndView modelAndView = new ModelAndView("maven");
		ConverterFormView result = new ConverterFormView();
		if(mavenConversationFormView.getRawInputLines().isEmpty()) {
			result.setErrorMessage("Input cannot be empty");
			modelAndView.addObject("mavenConversationFormView", result);
			return modelAndView;
		}
		result.setRawInputLines(mavenConversationFormView.getRawInputLines());

		MavenFileReader mavenFileReader = new MavenFileReader();
		MavenProject mavenProject = mavenFileReader.getProject(FileService.getFileAsBytes(mavenConversationFormView.getRawInputLines()));
		GradleProject gradleProject = MavenProjectTransformer.transform(mavenProject);

		result.setRawConversationResult(StringUtils.convertListToString(GradleProjectWriter.writeProject(gradleProject)));
		modelAndView.addObject("mavenConversationFormView", result);
		return modelAndView;
	}
	@RequestMapping(value = "/downloadMaven", method = RequestMethod.GET)
	public ResponseEntity<InputStreamResource> downloadMaven(@ModelAttribute("mavenConversationFormView") ConverterFormView mavenConversationFormView) throws IOException {
		MavenFileReader mavenFileReader = new MavenFileReader();
		MavenProject mavenProject = mavenFileReader.getProject(FileService.getFileAsBytes(mavenConversationFormView.getRawInputLines()));
		GradleProject gradleProject = MavenProjectTransformer.transform(mavenProject);
		List<String> gradleProjectLines = GradleProjectWriter.writeProject(gradleProject);
		Optional<InputStream> optionalInputStream = FileService.getFileAsBytes(gradleProjectLines);
		InputStreamResource inputStreamResource = new InputStreamResource(optionalInputStream.get());
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION,
						"attachment;filename=output.gradle")
				.contentType(MediaType.APPLICATION_PDF).contentLength(inputStreamResource.getFile().length())
				.body(inputStreamResource);
	}
	
}
