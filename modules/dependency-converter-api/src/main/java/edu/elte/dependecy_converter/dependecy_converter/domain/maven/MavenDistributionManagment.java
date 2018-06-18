package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

public class MavenDistributionManagment {
    private String id;
    private String name;
    private String url;
    private String layout;
    private boolean uniqueVersion;
    private MavenRepositoryPolicy releases;
    private MavenRepositoryPolicy snapshots;

    public MavenDistributionManagment() {}

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

    public boolean isUniqueVersion() {
        return uniqueVersion;
    }

    public void setUniqueVersion(boolean uniqueVersion) {
        this.uniqueVersion = uniqueVersion;
    }

    public MavenRepositoryPolicy getReleases() {
        return releases;
    }

    public void setReleases(MavenRepositoryPolicy releases) {
        this.releases = releases;
    }

    public MavenRepositoryPolicy getSnapshots() {
        return snapshots;
    }

    public void setSnapshots(MavenRepositoryPolicy snapshots) {
        this.snapshots = snapshots;
    }
}
