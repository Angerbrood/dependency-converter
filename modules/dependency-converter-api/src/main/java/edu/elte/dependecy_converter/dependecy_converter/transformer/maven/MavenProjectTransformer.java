package edu.elte.dependecy_converter.dependecy_converter.transformer.maven;

import java.util.stream.Collectors;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleProject;
import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenProject;

public final class MavenProjectTransformer {
	private MavenProjectTransformer() {}
	
	public static final GradleProject transform(MavenProject mavenProject) {
		GradleProject result = new GradleProject();
		result.setGroup(mavenProject.getGroupId());
		result.setArtifact(mavenProject.getArtifactId());
		result.setVersion(mavenProject.getVersion());
		result.setDependecyList(mavenProject.getDependencies().stream().map(current -> MavenDependencyTransformer.transform(current)).collect(Collectors.toList()));
		result.setSourceCompatibility("1.8");
		result.setTargetCompatbility("1.8");
		return result;
	}
}
