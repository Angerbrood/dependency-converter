package edu.elte.dependecy_converter.dependecy_converter.reader.gradle;

import java.util.List;
import java.util.Objects;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleProject;

public final class GradleProjectReader {
	private static final String group = "group";
	private static final String artifact = "artifact";
	private static final String version = "version";
	private GradleProjectReader() {}
	
	public static final GradleProject readProject(List<String> inputLines) {
		Objects.requireNonNull(inputLines);
		GradleProject result = new GradleProject();
		for(String currentLine : inputLines) {
			String[] splitted = currentLine.split("=");
			if(splitted[0].contains(group)) {
				result.setGroup(removeUnusedCharacters(splitted[1]));
			} else if(splitted[0].contains(artifact)) {
				result.setArtifact(removeUnusedCharacters(splitted[1]));
			} else if(splitted[0].contains(version)) {
				result.setVersion(removeUnusedCharacters(splitted[1]));
			}
			
		}
		return result;
	}

	private static String removeUnusedCharacters(String line) {
		Objects.requireNonNull(line);
		return line.replace("'", "").replace("\"", "");
	}
}
