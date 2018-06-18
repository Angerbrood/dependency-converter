package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

public class MavenResource {
    private String targetPath;
    private String filtering;
    private String directory;
    private String includes;
    private String excludes;

    public MavenResource() {}

    public String getTargetPath() {
        return targetPath;
    }

    public void setTargetPath(String targetPath) {
        this.targetPath = targetPath;
    }

    public String getFiltering() {
        return filtering;
    }

    public void setFiltering(String filtering) {
        this.filtering = filtering;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getIncludes() {
        return includes;
    }

    public void setIncludes(String includes) {
        this.includes = includes;
    }

    public String getExcludes() {
        return excludes;
    }

    public void setExcludes(String excludes) {
        this.excludes = excludes;
    }
}
