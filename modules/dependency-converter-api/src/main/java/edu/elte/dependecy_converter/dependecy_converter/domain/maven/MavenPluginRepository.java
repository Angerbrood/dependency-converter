package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

public class MavenPluginRepository {
    private String id;
    private String name;
    private String url;
    private String layout;
    private MavenRepositoryPolicy releases;
    private MavenRepository snapshots;

    public MavenPluginRepository() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public MavenRepositoryPolicy getReleases() {
        return releases;
    }

    public void setReleases(MavenRepositoryPolicy releases) {
        this.releases = releases;
    }

    public MavenRepository getSnapshots() {
        return snapshots;
    }

    public void setSnapshots(MavenRepository snapshots) {
        this.snapshots = snapshots;
    }
}
