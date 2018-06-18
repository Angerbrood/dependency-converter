package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

public class MavenExtesion {
    private String groupId;
    private String artifactId;
    private String version;

    public MavenExtesion() {}

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
}
