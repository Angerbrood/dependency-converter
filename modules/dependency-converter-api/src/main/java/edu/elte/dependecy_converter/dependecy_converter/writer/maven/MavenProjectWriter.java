package edu.elte.dependecy_converter.dependecy_converter.writer.maven;

import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenProject;

import java.util.LinkedList;
import java.util.List;

public final class MavenProjectWriter {
    private MavenProjectWriter() {}

    public static List<String> writeProject(MavenProject mavenProject) {
        List<String> result = new LinkedList<>();
        result.add("<project xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\"\n" +
                "\txmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n");
        mavenProject.setModelVersion("4.0.0");
        result.add(mavenProject.prettyPrint());
        result.addAll(MavenDependencyWriter.writeDependencies(mavenProject.getDependencies()));
        result.add("</project>");
        return result;
    }
}
