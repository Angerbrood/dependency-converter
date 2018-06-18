package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

public class MavenExclusion {
    private String groupId;
    private String artifactId;

    public MavenExclusion() {}

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
}
