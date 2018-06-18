package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

import java.util.List;


public class MavenProject implements ModelInterface {
    private String groupId;
    private String artifactId;
    private String version;
    private String packaging;
    private String name;
    private String description;
    private String modelVersion;
    private List<MavenDependency> dependencies;
    private List<MavenProperty> propertyList;

    public MavenProject() {

    }

    public boolean isReadingFinished() {
    	return groupId != null && artifactId != null && version != null && packaging != null && modelVersion != null;  
    }
    
	public String getGroupId() {
		return groupId;
	}
	
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getArtifactId() {
		return artifactId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getPackaging() {
		return packaging;
	}

	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<MavenDependency> getDependencies() {
		return dependencies;
	}

	public void setDependencies(List<MavenDependency> dependencies) {
		this.dependencies = dependencies;
	}

	public List<MavenProperty> getPropertyList() {
		return propertyList;
	}

	public void setPropertyList(List<MavenProperty> propertyList) {
		this.propertyList = propertyList;
	}

	public String getModelVersion() {
		return modelVersion;
	}

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
	}
}
