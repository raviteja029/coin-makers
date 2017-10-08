
package com.aarpcare.aarpcare.services.usbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Status {

    @SerializedName("StatusCode")
    @Expose
    private String statusCode;
    @SerializedName("Severity")
    @Expose
    private String severity;
    @SerializedName("StatusDescription")
    @Expose
    private String statusDescription;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Status withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Status withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public Status withStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("statusCode", statusCode).append("severity", severity).append("statusDescription", statusDescription).toString();
    }

}
