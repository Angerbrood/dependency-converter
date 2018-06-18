package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

import java.util.List;

public class MavenReport {
    private String excludeDefaults;
    private String outputDirectory;
    private List<MavenPlugin> pluginList;

    public MavenReport() {}

    public String getExcludeDefaults() {
        return excludeDefaults;
    }

    public void setExcludeDefaults(String excludeDefaults) {
        this.excludeDefaults = excludeDefaults;
    }

    public String getOutputDirectory() {
        return outputDirectory;
    }

    public void setOutputDirectory(String outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    public List<MavenPlugin> getPluginList() {
        return pluginList;
    }

    public void setPluginList(List<MavenPlugin> pluginList) {
        this.pluginList = pluginList;
    }
}
