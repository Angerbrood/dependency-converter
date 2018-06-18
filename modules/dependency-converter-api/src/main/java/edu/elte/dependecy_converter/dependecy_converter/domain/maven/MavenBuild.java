package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

import java.util.List;

public class MavenBuild {
    private String sourceDirectory;
    private String scriptSourceDirectory;
    private String testSourceDirectory;
    private String outputDirectory;
    private String testOutputDirectory;
    private String defaultGoal;
    private String directory;
    private String finalName;
    private List<String> filters;
    private List<MavenExtesion> extesionList;
    private List<MavenResource> resourceList;
    private List<MavenResource> testResourceList;
    private List<MavenPlugin> pluginList;

    public MavenBuild() {}

    public String getSourceDirectory() {
        return sourceDirectory;
    }

    public void setSourceDirectory(String sourceDirectory) {
        this.sourceDirectory = sourceDirectory;
    }

    public String getScriptSourceDirectory() {
        return scriptSourceDirectory;
    }

    public void setScriptSourceDirectory(String scriptSourceDirectory) {
        this.scriptSourceDirectory = scriptSourceDirectory;
    }

    public String getTestSourceDirectory() {
        return testSourceDirectory;
    }

    public void setTestSourceDirectory(String testSourceDirectory) {
        this.testSourceDirectory = testSourceDirectory;
    }

    public String getOutputDirectory() {
        return outputDirectory;
    }

    public void setOutputDirectory(String outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    public String getTestOutputDirectory() {
        return testOutputDirectory;
    }

    public void setTestOutputDirectory(String testOutputDirectory) {
        this.testOutputDirectory = testOutputDirectory;
    }

    public String getDefaultGoal() {
        return defaultGoal;
    }

    public void setDefaultGoal(String defaultGoal) {
        this.defaultGoal = defaultGoal;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getFinalName() {
        return finalName;
    }

    public void setFinalName(String finalName) {
        this.finalName = finalName;
    }

    public List<String> getFilters() {
        return filters;
    }

    public void setFilters(List<String> filters) {
        this.filters = filters;
    }

    public List<MavenExtesion> getExtesionList() {
        return extesionList;
    }

    public void setExtesionList(List<MavenExtesion> extesionList) {
        this.extesionList = extesionList;
    }

    public List<MavenResource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<MavenResource> resourceList) {
        this.resourceList = resourceList;
    }

    public List<MavenResource> getTestResourceList() {
        return testResourceList;
    }

    public void setTestResourceList(List<MavenResource> testResourceList) {
        this.testResourceList = testResourceList;
    }

    public List<MavenPlugin> getPluginList() {
        return pluginList;
    }

    public void setPluginList(List<MavenPlugin> pluginList) {
        this.pluginList = pluginList;
    }
}
