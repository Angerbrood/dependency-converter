package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

import java.util.List;

public class MavenProfile {
    private String id;
    private MavenActivation activation;
    private MavenBuild build;
    private List<String> modules;
    private MavenDistributionManagment distributionManagment;
    private List<MavenProperty> properties;
    private List<MavenDependency> dependecyList;
    private List<MavenRepository> repositoryList;
    private List<MavenPluginRepository> pluginRepositories;
    private MavenReport report;

    public MavenProfile() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MavenActivation getActivation() {
        return activation;
    }

    public void setActivation(MavenActivation activation) {
        this.activation = activation;
    }

    public MavenBuild getBuild() {
        return build;
    }

    public void setBuild(MavenBuild build) {
        this.build = build;
    }

    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }

    public MavenDistributionManagment getDistributionManagment() {
        return distributionManagment;
    }

    public void setDistributionManagment(MavenDistributionManagment distributionManagment) {
        this.distributionManagment = distributionManagment;
    }

    public List<MavenProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<MavenProperty> properties) {
        this.properties = properties;
    }

    public List<MavenDependency> getDependecyList() {
        return dependecyList;
    }

    public void setDependecyList(List<MavenDependency> dependecyList) {
        this.dependecyList = dependecyList;
    }

    public List<MavenRepository> getRepositoryList() {
        return repositoryList;
    }

    public void setRepositoryList(List<MavenRepository> repositoryList) {
        this.repositoryList = repositoryList;
    }

    public List<MavenPluginRepository> getPluginRepositories() {
        return pluginRepositories;
    }

    public void setPluginRepositories(List<MavenPluginRepository> pluginRepositories) {
        this.pluginRepositories = pluginRepositories;
    }

    public MavenReport getReport() {
        return report;
    }

    public void setReport(MavenReport report) {
        this.report = report;
    }
}
