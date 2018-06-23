package edu.elte.dependecy_converter.dependecy_converter.writer.maven;

import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenDependency;

import java.util.LinkedList;
import java.util.List;

public final class MavenDependencyWriter {
    private MavenDependencyWriter() {}
    public static List<String> writeDependencies(List<MavenDependency> dependencies) {
        List<String> result = new LinkedList<>();
        result.add("\t<dependencies>\n");
        dependencies.forEach(currentDependency -> result.add(currentDependency.prettyPrint()));
        result.add("\t</dependencies>\n");
        return result;
    }
}
