package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

public class MavenProperty implements ModelInterface {
    private String key;
    private String value;

    public MavenProperty() {}

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    public String getValue(String key) {
    	if(key.equals(this.key)) {
    		return value;
    	} else {
    		return "";
    	}
    }
}
