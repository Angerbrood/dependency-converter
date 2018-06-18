package edu.elte.dependecy_converter.dependecy_converter.reader.gradle;

import java.util.LinkedList;
import java.util.List;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleDependency;

public final class GradleDependencyReader {
	private GradleDependencyReader() {}
	
	public static final List<GradleDependency> readDependencies(List<String> inputLines) {
		List<GradleDependency> result = new LinkedList<>();
		for(String currentLine : inputLines) {
			String prefixFreeLine = removePrefixes(currentLine);
			String rawLine = removeUnusedCharacters(prefixFreeLine);
			result.add(readDependencyFromString(rawLine));
		}
		
		return result;
	}
	private static GradleDependency readDependencyFromString(String line) {
		GradleDependency result = new GradleDependency();
		String[] splitted = line.split(":");
		result.setGroup(splitted[0]);
		result.setArtifact(splitted[1]);
		result.setVersion(splitted[2]);
		return result;
	}
	private static String removePrefixes(String line) {
		String[] splitted = line.split(" ");
		return splitted[1];
	}
	private static String removeUnusedCharacters(String line) {
		return line.replace("'", "").replace("\"", "");
	}

}
