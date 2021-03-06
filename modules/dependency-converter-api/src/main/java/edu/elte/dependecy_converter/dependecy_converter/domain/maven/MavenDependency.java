package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

public class MavenDependency implements ModelInterface {
    private String groupId;
    private String artifactId;
    private String version;

    public MavenDependency() {}

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

    public String prettyPrint() {
        return
        "\t\t<dependency>\n" +
        "\t\t\t<groupId>" + groupId + "</groupId>\n" +
		"\t\t\t<artifactId>" + artifactId + "</artifactId>\n" +
		"\t\t\t<version>" + version + "</version>\n" +
        "\t\t</dependency>\n";
    }
}
