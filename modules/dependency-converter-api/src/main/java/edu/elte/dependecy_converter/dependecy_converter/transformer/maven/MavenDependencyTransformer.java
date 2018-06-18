package edu.elte.dependecy_converter.dependecy_converter.transformer.maven;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleDependency;
import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenDependency;

public final class MavenDependencyTransformer {
	private MavenDependencyTransformer() {}
	
	public static final GradleDependency transform(MavenDependency mavenDependency) {
		GradleDependency result = new GradleDependency();
		result.setGroup(mavenDependency.getGroupId());
		result.setArtifact(mavenDependency.getArtifactId());
		result.setVersion(mavenDependency.getVersion());
		return result;
	}
}
