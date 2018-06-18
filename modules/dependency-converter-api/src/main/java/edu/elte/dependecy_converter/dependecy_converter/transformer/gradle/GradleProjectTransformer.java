package edu.elte.dependecy_converter.dependecy_converter.transformer.gradle;

import java.util.stream.Collectors;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleProject;
import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenProject;

public final class GradleProjectTransformer {
	public static final MavenProject transform(GradleProject gradleProject) {
		MavenProject result = new MavenProject();
		result.setGroupId(gradleProject.getGroup());
		result.setArtifactId(gradleProject.getArtifact());
		result.setVersion(gradleProject.getVersion());
		result.setDependencies(gradleProject.getDependecyList().stream().map(current -> GradleDependencyTransformer.transform(current)).collect(Collectors.toList()));
		return result;
	}
}
