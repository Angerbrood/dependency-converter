package edu.elte.dependecy_converter.dependecy_converter.writer.gradle;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleProject;

public final class  GradleProjectWriter {
	private GradleProjectWriter() {}
	
	
	public static final List<String> writeProject(GradleProject gradleProject) {
		Objects.requireNonNull(gradleProject);
		List<String> result = new LinkedList<>();
		result.add("apply plugin : java");
		result.add(gradleProject.prettyPrint());
		result.addAll(GradleRepositoryWriter.writeRepositories());
		result.addAll(GradleDependencyWriter.writeDependencies(gradleProject.getDependecyList()));
		return result;
	}
}
