package edu.elte.dependecy_converter.dependecy_converter.reader.gradle;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleRepository;
import edu.elte.dependecy_converter.dependecy_converter.utils.StringUtils;

public class GradleRepositoryReader {
	public static final List<GradleRepository> readRepositories(List<String> inputLines) {
		Objects.requireNonNull(inputLines);
		List<GradleRepository> result = new LinkedList<>();
		for(String currentLine : inputLines) {
			GradleRepository repository = new GradleRepository();
			repository.setUrl(currentLine);
			result.add(repository);
			
		}
		return result;
	}
}
