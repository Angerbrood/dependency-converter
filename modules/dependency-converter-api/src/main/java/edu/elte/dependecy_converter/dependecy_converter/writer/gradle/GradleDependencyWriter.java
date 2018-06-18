package edu.elte.dependecy_converter.dependecy_converter.writer.gradle;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleDependency;

public final class GradleDependencyWriter {
	private GradleDependencyWriter() {}
	
	public static final List<String> writeDependencies(List<GradleDependency> dependencies) {
		Objects.requireNonNull(dependencies);
		List<String> result = new LinkedList<>();
		result.add("\n");
		result.add("dependencies {");
		result.add("\n");
		for(GradleDependency currentItem : dependencies) {
			result.add("\t" + currentItem.prettyPrint());
			result.add("\n");
		}
		result.add("}");
		result.add("\n");
		return result;
		
	}
}
