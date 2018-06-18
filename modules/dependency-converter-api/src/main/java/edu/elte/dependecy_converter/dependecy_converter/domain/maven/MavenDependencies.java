package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

import java.util.LinkedList;
import java.util.List;

public class MavenDependencies {
    private List<MavenDependency> dependency;

    public MavenDependencies() {
        this.dependency = new LinkedList<>();
    }

    public List<MavenDependency> getDependency() {
        return dependency;
    }

    public void setDependency(List<MavenDependency> dependency) {
        this.dependency = dependency;
    }
}
