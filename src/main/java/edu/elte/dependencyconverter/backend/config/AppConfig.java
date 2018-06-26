package edu.elte.dependencyconverter.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import edu.elte.dependecy_converter.dependecy_converter.reader.gradle.GradleFileReader;
import edu.elte.dependecy_converter.dependecy_converter.reader.maven.MavenFileReader;

@Configuration
@Import({DispatcherConfig.class, ServiceConfig.class})
public class AppConfig {

}
