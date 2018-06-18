package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

import java.util.List;

public class MavenContributor {
    private String name;
    private String email;
    private String url;
    private String organizaton;
    private String organizationUrl;
    private String timezone;
    private List<String> roles;
    private List<MavenProperty> propertyList;

    public MavenContributor() {}

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

    public String getOrganizaton() {
        return organizaton;
    }

    public void setOrganizaton(String organizaton) {
        this.organizaton = organizaton;
    }

    public String getOrganizationUrl() {
        return organizationUrl;
    }

    public void setOrganizationUrl(String organizationUrl) {
        this.organizationUrl = organizationUrl;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public List<MavenProperty> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<MavenProperty> propertyList) {
        this.propertyList = propertyList;
    }
}
