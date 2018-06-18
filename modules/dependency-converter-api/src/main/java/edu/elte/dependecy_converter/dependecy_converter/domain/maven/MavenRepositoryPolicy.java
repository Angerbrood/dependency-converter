package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

public class MavenRepositoryPolicy {
    private String enabled;
    private String updatePolicy;
    private String checksumPolicy;

    public MavenRepositoryPolicy() {}

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getUpdatePolicy() {
        return updatePolicy;
    }

    public void setUpdatePolicy(String updatePolicy) {
        this.updatePolicy = updatePolicy;
    }

    public String getChecksumPolicy() {
        return checksumPolicy;
    }

    public void setChecksumPolicy(String checksumPolicy) {
        this.checksumPolicy = checksumPolicy;
    }
}
