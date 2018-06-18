package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

public class MavenActivation {
    private String jdk;
    private boolean activeByDefault;
    private MavenOS os;
    private MavenProperty property;
    private MavenFile file;

    public MavenActivation() {}

    public String getJdk() {
        return jdk;
    }

    public void setJdk(String jdk) {
        this.jdk = jdk;
    }

    public boolean isActiveByDefault() {
        return activeByDefault;
    }

    public void setActiveByDefault(boolean activeByDefault) {
        this.activeByDefault = activeByDefault;
    }

    public MavenOS getOs() {
        return os;
    }

    public void setOs(MavenOS os) {
        this.os = os;
    }

    public MavenProperty getProperty() {
        return property;
    }

    public void setProperty(MavenProperty property) {
        this.property = property;
    }

    public MavenFile getFile() {
        return file;
    }

    public void setFile(MavenFile file) {
        this.file = file;
    }
}
