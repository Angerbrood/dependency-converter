package edu.elte.dependecy_converter.dependecy_converter.domain.gradle;

public class GradleDependency {
    private String group;
    private String artifact;
    private String version;

    public String prettyPrint() {
    	String compile = "compile ";
    	return compile + "'" + group + ":" + artifact + ":" + version + "'";
    }
    
    public GradleDependency() {}

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getArtifact() {
		return artifact;
	}

	public void setArtifact(String artifact) {
		this.artifact = artifact;
	}

	public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        String result = "compile group: '" + this.group + "', name: '" + this.artifact + "', version: '" + this.version + "'";
        return result;
    }
}
