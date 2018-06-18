package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

import java.util.List;

public class MavenDeveloper {
    private String id;
    private String name;
    private String email;
    private String url;
    private String organization;
    private String organizationUrl;
    private List<String> roles;
    private String timezone;
    private List<MavenProperty> mavenPropertyList;

    public MavenDeveloper() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getOrganizationUrl() {
        return organizationUrl;
    }

    public void setOrganizationUrl(String organizationUrl) {
        this.organizationUrl = organizationUrl;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public List<MavenProperty> getMavenPropertyList() {
        return mavenPropertyList;
    }

    public void setMavenPropertyList(List<MavenProperty> mavenPropertyList) {
        this.mavenPropertyList = mavenPropertyList;
    }
}
