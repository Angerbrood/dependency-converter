package edu.elte.dependecy_converter.dependecy_converter.domain.maven;

import java.util.List;

public class MavenNotifier {
    private String type;
    private boolean sendOnError;
    private boolean sendonFailure;
    private boolean sendOnSuccess;
    private boolean sendOnWarning;
    private String address;
    private List<MavenProperty> propertyList;

    public MavenNotifier() {}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSendOnError() {
        return sendOnError;
    }

    public void setSendOnError(boolean sendOnError) {
        this.sendOnError = sendOnError;
    }

    public boolean isSendonFailure() {
        return sendonFailure;
    }

    public void setSendonFailure(boolean sendonFailure) {
        this.sendonFailure = sendonFailure;
    }

    public boolean isSendOnSuccess() {
        return sendOnSuccess;
    }

    public void setSendOnSuccess(boolean sendOnSuccess) {
        this.sendOnSuccess = sendOnSuccess;
    }

    public boolean isSendOnWarning() {
        return sendOnWarning;
    }

    public void setSendOnWarning(boolean sendOnWarning) {
        this.sendOnWarning = sendOnWarning;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<MavenProperty> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<MavenProperty> propertyList) {
        this.propertyList = propertyList;
    }
}
