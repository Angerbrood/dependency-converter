package edu.elte.dependecy_converter.dependecy_converter.transformer.gradle;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleDependency;
import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenDependency;

public final class GradleDependencyTransformer {
	private GradleDependencyTransformer() {}
	
	
	public static final MavenDependency transform(GradleDependency gradleDependency) {
		MavenDependency result = new MavenDependency();
		result.setGroupId(gradleDependency.getGroup());
		result.setArtifactId(gradleDependency.getArtifact());
		result.setVersion(gradleDependency.getVersion());
		return result;
	}
}
