package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

import java.util.List;

public class MavenExecution {
    private String id;
    private String phase;
    private List<String> goals;
    private String inherited;
    private String configuration;

    public MavenExecution() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public List<String> getGoals() {
        return goals;
    }

    public void setGoals(List<String> goals) {
        this.goals = goals;
    }

    public String getInherited() {
        return inherited;
    }

    public void setInherited(String inherited) {
        this.inherited = inherited;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
}
