package edu.elte.dependencyconverter.backend.controller;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleProject;
import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenProject;
import edu.elte.dependecy_converter.dependecy_converter.reader.gradle.GradleFileReader;
import edu.elte.dependecy_converter.dependecy_converter.transformer.gradle.GradleProjectTransformer;
import edu.elte.dependecy_converter.dependecy_converter.utils.StringUtils;
import edu.elte.dependecy_converter.dependecy_converter.writer.FileService;
import edu.elte.dependecy_converter.dependecy_converter.writer.maven.MavenProjectWriter;
import edu.elte.dependencyconverter.backend.form.view.ConverterFormView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GradleController {

    @RequestMapping(value = "/uploadGradle", method = RequestMethod.POST)
    public ModelAndView uploadGradle(@ModelAttribute("gradleConversationFormView") ConverterFormView  gradleConversationFormView) {
        ModelAndView modelAndView = new ModelAndView("gradle");
        ConverterFormView result = new ConverterFormView();
        result.setRawInputLines(gradleConversationFormView.getRawInputLines());


        GradleProject gradleProject = new GradleFileReader().getProject(FileService.getFileAsBytes(gradleConversationFormView.getRawInputLines()));
        MavenProject mavenProject = GradleProjectTransformer.transform(gradleProject);
        List<String> mavenProjectOutput = MavenProjectWriter.writeProject(mavenProject);

        result.setRawConversationResult(StringUtils.convertListToString(mavenProjectOutput));
        modelAndView.addObject("gradleConversationFormView", result);
        return modelAndView;
    }

}
