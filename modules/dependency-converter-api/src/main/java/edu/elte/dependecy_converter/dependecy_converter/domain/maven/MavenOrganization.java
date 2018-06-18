package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

public class MavenOrganization {
    private String name;
    private String url;

    public MavenOrganization() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
