package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

public class MavenFile {
    private String missing;
    private String exists;

    public MavenFile() {}

    public String getMissing() {
        return missing;
    }

    public void setMissing(String missing) {
        this.missing = missing;
    }

    public String getExists() {
        return exists;
    }

    public void setExists(String exists) {
        this.exists = exists;
    }
}
