package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

public class MavenSCM {
    private String connection;
    private String developerConnection;
    private String tag;
    private String url;

    public MavenSCM() {}

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getDeveloperConnection() {
        return developerConnection;
    }

    public void setDeveloperConnection(String developerConnection) {
        this.developerConnection = developerConnection;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
