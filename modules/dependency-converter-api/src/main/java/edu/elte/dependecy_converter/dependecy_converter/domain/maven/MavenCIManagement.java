package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

import java.util.List;

public class MavenCIManagement {
    private String system;
    private String url;
    private List<MavenNotifier> notifierList;

    public MavenCIManagement() {}

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<MavenNotifier> getNotifierList() {
        return notifierList;
    }

    public void setNotifierList(List<MavenNotifier> notifierList) {
        this.notifierList = notifierList;
    }
}
