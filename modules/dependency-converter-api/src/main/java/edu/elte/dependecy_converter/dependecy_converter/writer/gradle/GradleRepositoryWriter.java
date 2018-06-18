package edu.elte.dependecy_converter.dependecy_converter.writer.gradle;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleRepository;

public final class GradleRepositoryWriter {
	private GradleRepositoryWriter() {

	}
	
	public static final List<String> writeRepositories(List<GradleRepository> repositories) {
		Objects.requireNonNull(repositories);
		List<String> result = new LinkedList<>();
		result.add("repositories {");
		for(GradleRepository currentItem : repositories) {
			result.add("\t" + currentItem.prettyPrint());
		}
		result.add("}");
		return result;
	}
	public static final List<String> writeRepositories() {
		List<String> result = new LinkedList<>();
		result.add("\n");
		result.add("repositories {");
		result.add("\n");
		result.add("\t mavenCentral()");
		result.add("\n");
		result.add("}");
		result.add("\n");
		return result;
	}
}
