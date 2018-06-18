package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

import java.util.List;

public class MavenPlugin {
    private String groupId;
    private String artifactId;
    private String version;
    private String extensions;
    private String goals;
    private String inherited;
    private List<MavenProperty> configuration;
    private List<MavenExecution> executionList;
    private List<MavenDependency> dependencyList;

    public MavenPlugin() {}

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

    public String getExtensions() {
        return extensions;
    }

    public void setExtensions(String extensions) {
        this.extensions = extensions;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public String getInherited() {
        return inherited;
    }

    public void setInherited(String inherited) {
        this.inherited = inherited;
    }

    public List<MavenProperty> getConfiguration() {
        return configuration;
    }

    public void setConfiguration(List<MavenProperty> configuration) {
        this.configuration = configuration;
    }

    public List<MavenExecution> getExecutionList() {
        return executionList;
    }

    public void setExecutionList(List<MavenExecution> executionList) {
        this.executionList = executionList;
    }

    public List<MavenDependency> getDependencyList() {
        return dependencyList;
    }

    public void setDependencyList(List<MavenDependency> dependencyList) {
        this.dependencyList = dependencyList;
    }
}
