package edu.elte.dependencyconverter.frontend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DispatcherConfig.class, ServiceConfig.class})
public class AppConfig {

}
