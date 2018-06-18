package edu.elte.dependecy_converter.dependecy_converter.reader.gradle;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import edu.elte.dependecy_converter.dependecy_converter.domain.gradle.GradleProject;
import edu.elte.dependecy_converter.dependecy_converter.utils.ValidatorUtils;

public class GradleFileReader {
	private final BufferedReader bufferedReader;
	private final List<String> lines;
	public GradleFileReader(String filePath) throws Exception {
		Objects.requireNonNull(filePath);
		ValidatorUtils.isFileExists(filePath);
		bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
		lines = new LinkedList<>();
		readFile();
	}
	
	public GradleProject getProject() {
		GradleProject gradleProject = GradleProjectReader.readProject(lines);
		gradleProject.setDependecyList(GradleDependencyReader.readDependencies(readBlock("dependencies")));
		gradleProject.setRepositoryList(GradleRepositoryReader.readRepositories(readBlock("repositories")));
		return gradleProject;	
	}
	
	private List<String> readBlock(String blockName) {
		Objects.requireNonNull(blockName);
		
		List<String> result = new LinkedList<>();
		String toFind = blockName + " {";
		boolean endBlock = false;
		int startIndex = findBlockStart(toFind);
		if(startIndex != -1) {
			for(int i = startIndex + 1; i < lines.size() && !endBlock; ++i) {
				String currentLine = lines.get(i);
				String temp = currentLine.trim();
				if(temp.startsWith("//") || temp.isEmpty()) {
					
				} else {
					result.add(temp);
				}
				endBlock = currentLine.trim().equals("}");
			}
			result.remove(result.size() - 1); //remove last
			return result;
		} else {
			return new LinkedList<>();
		}
	}
	private int findBlockStart(String toFind) {
		Objects.requireNonNull(toFind);
		int index = -1;
		for(int i = 0; i < lines.size() && index == -1; ++i) {
			String currentLine = lines.get(i);
			if(currentLine.contains(toFind)) {
				index = i;
			}
		}
		return index;
	}
	private void readFile() throws Exception {
		String line = bufferedReader.readLine();
		while(line != null) {
			lines.add(line);
			line = bufferedReader.readLine();
		}

	}
}
