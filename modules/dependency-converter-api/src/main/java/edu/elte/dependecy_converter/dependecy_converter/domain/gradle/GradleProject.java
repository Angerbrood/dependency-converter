package edu.elte.dependecy_converter.dependecy_converter.domain.gradle;

import java.util.List;

public class GradleProject {
    private String group;
    private String artifact;
    private String version;
    private String sourceCompatibility;
    private String targetCompatbility;
    private GradleSourceSet sourceSet;
    private List<GradleRepository> repositoryList;
    private List<GradleDependency> dependecyList;
    private List<GradlePlugin> pluginList;
    private List<GradleProperty> propertyList;
    private List<GradleProject> subProjcts;
    private List<GradleTask> taskList;
    private List<GradleUploadArchives> uploadArchivesList;

    public String prettyPrint() {
    	return 
    	"group = '" + group + "'\n" +
    	"artifact = '" + artifact + "' \n" +
    	"version = '" + version + "'\n" + 
    	"sourceCompatibility = " + sourceCompatibility + "\n" +
    	"targetCompatbility = " + targetCompatbility + "\n";
    }

    public boolean isReadingFinised() {
        return group != null && artifact != null && version != null;
    }

    public GradleProject() {

    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getArtifact() {
        return artifact;
    }

    public void setArtifact(String artifact) {
        this.artifact = artifact;
    }

    public String getSourceCompatibility() {
        return sourceCompatibility;
    }

    public void setSourceCompatibility(String sourceCompatibility) {
        this.sourceCompatibility = sourceCompatibility;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public GradleSourceSet getSourceSet() {
        return sourceSet;
    }

    public void setSourceSet(GradleSourceSet sourceSet) {
        this.sourceSet = sourceSet;
    }

    public List<GradleRepository> getRepositoryList() {
        return repositoryList;
    }

    public void setRepositoryList(List<GradleRepository> repositoryList) {
        this.repositoryList = repositoryList;
    }

    public List<GradleDependency> getDependecyList() {
        return dependecyList;
    }

    public void setDependecyList(List<GradleDependency> dependecyList) {
        this.dependecyList = dependecyList;
    }

    public List<GradlePlugin> getPluginList() {
        return pluginList;
    }

    public void setPluginList(List<GradlePlugin> pluginList) {
        this.pluginList = pluginList;
    }

    public List<GradleProperty> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<GradleProperty> propertyList) {
        this.propertyList = propertyList;
    }

    public List<GradleProject> getSubProjcts() {
        return subProjcts;
    }

    public void setSubProjcts(List<GradleProject> subProjcts) {
        this.subProjcts = subProjcts;
    }

    public List<GradleTask> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<GradleTask> taskList) {
        this.taskList = taskList;
    }

    public List<GradleUploadArchives> getUploadArchivesList() {
        return uploadArchivesList;
    }

    public void setUploadArchivesList(List<GradleUploadArchives> uploadArchivesList) {
        this.uploadArchivesList = uploadArchivesList;
    }

    public String getTargetCompatbility() {
        return targetCompatbility;
    }

    public void setTargetCompatbility(String targetCompatbility) {
        this.targetCompatbility = targetCompatbility;
    }
}
