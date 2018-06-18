package edu.elte.dependecy_converter.dependecy_converter.domain.gradle;

public class GradleRepository {
    private String url;

    public String prettyPrint() {
    	return url;
    }
    
    public GradleRepository() {

    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
