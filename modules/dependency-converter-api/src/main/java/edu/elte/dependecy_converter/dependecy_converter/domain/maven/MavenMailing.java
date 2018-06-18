package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

import java.util.List;

public class MavenMailing {
    private String name;
    private String subscribe;
    private String unsubscribe;
    private String post;
    private String archive;
    private List<String> otherArchives;

    public MavenMailing() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(String subscribe) {
        this.subscribe = subscribe;
    }

    public String getUnsubscribe() {
        return unsubscribe;
    }

    public void setUnsubscribe(String unsubscribe) {
        this.unsubscribe = unsubscribe;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getArchive() {
        return archive;
    }

    public void setArchive(String archive) {
        this.archive = archive;
    }

    public List<String> getOtherArchives() {
        return otherArchives;
    }

    public void setOtherArchives(List<String> otherArchives) {
        this.otherArchives = otherArchives;
    }
}
