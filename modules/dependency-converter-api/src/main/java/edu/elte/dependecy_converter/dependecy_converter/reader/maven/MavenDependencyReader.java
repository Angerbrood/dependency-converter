package edu.elte.dependecy_converter.dependecy_converter.reader.maven;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import edu.elte.dependecy_converter.dependecy_converter.domain.maven.MavenDependency;
import edu.elte.dependecy_converter.dependecy_converter.utils.StringUtils;

public final class MavenDependencyReader {
	private MavenDependencyReader() {}
	private final static String DEPENDENCY = "dependency";
	
	
	public static final List<MavenDependency> readDependecies(List<String> inputList) {
		Objects.requireNonNull(inputList);
		List<MavenDependency> result = new LinkedList<>();
	   	for(int i = 0; i < inputList.size(); ++i) {
			 String currentItem = inputList.get(i);
			 if(currentItem.contains(DEPENDENCY) && !currentItem.contains("End")) {
				MavenDependency dependency = new MavenDependency();
				int counter = i + 1;
				String groupId = StringUtils.getInputValue(inputList.get(counter));
				String artifactId = StringUtils.getInputValue(inputList.get(counter + 2));
				String version = StringUtils.getInputValue(inputList.get(counter + 4));
				String versionPropertyKey = StringUtils.getPropertyKey(version);
				String newVersion = MavenPropertyReader.getProperty(versionPropertyKey);
				if(newVersion != null) {
					version = newVersion;
				}
				dependency.setGroupId(groupId);
				dependency.setArtifactId(artifactId);
				dependency.setVersion(version);
				result.add(dependency);
			 }
		}
	   	return result;
	}

}
