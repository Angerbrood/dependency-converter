package edu.elte.dependecy_converter.dependecy_converter.domain.gradle;

public class GradleCredentials {
    private String username;
    private String password;

    public GradleCredentials() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
