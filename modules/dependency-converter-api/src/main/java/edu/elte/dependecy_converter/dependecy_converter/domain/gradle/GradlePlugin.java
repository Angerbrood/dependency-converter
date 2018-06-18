package edu.elte.dependecy_converter.dependecy_converter.domain.gradle;

public class GradlePlugin {
    private String name;
    private String version;


    public GradlePlugin() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        String result = "id '" + this.name + "' version '" + this.version + "'";
        return result;
    }
}
