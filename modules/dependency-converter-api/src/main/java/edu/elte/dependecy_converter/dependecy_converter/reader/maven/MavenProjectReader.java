package edu.elte.dependecy_converter.dependecy_converter.reader.maven;

import java.util.List;
import java.util.Objects;

import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenProject;
import edu.elte.dependecy_converter.dependecy_converter.utils.StringUtils;

public final class MavenProjectReader {
	private static final String MODEL_VERSION = "modelVersion";
	private static final String GROUP_ID = "groupId";
	private static final String ARTIFACT_ID = "artifactId";
	private static String PACKAGING = "packaging";
	private static String VERSION = "version";
	public static final MavenProject readProject(List<String> inputList) {
		Objects.requireNonNull(inputList);
		MavenProject mavenProject = new MavenProject();
		for(int i = 0 ; i < inputList.size() && !mavenProject.isReadingFinished(); ++i) {
			String currentItem = inputList.get(i);
			if(currentItem.contains(MODEL_VERSION) && !currentItem.contains("End")) {
				mavenProject.setModelVersion(StringUtils.getInputValue(currentItem));
			} else if(currentItem.contains(GROUP_ID) && !currentItem.contains("End")) {
				mavenProject.setGroupId(StringUtils.getInputValue(currentItem));
			} else if(currentItem.contains(ARTIFACT_ID) && !currentItem.contains("End")) {
				mavenProject.setArtifactId(StringUtils.getInputValue(currentItem));
			} else if(currentItem.contains(PACKAGING) && !currentItem.contains("End")) {
				mavenProject.setPackaging(StringUtils.getInputValue(currentItem));
			} else if(currentItem.contains(VERSION) && !currentItem.contains("End")) {
				mavenProject.setVersion(StringUtils.getInputValue(currentItem));
			}
		}
		return mavenProject;
	}
}
