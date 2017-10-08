
package com.aarpcare.aarpcare.services.usbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class USTaxIdentification {

    @SerializedName("USTaxIdentifier")
    @Expose
    private String uSTaxIdentifier;
    @SerializedName("USTaxIdentifierTypeCode")
    @Expose
    private String uSTaxIdentifierTypeCode;

    public String getUSTaxIdentifier() {
        return uSTaxIdentifier;
    }

    public void setUSTaxIdentifier(String uSTaxIdentifier) {
        this.uSTaxIdentifier = uSTaxIdentifier;
    }

    public USTaxIdentification withUSTaxIdentifier(String uSTaxIdentifier) {
        this.uSTaxIdentifier = uSTaxIdentifier;
        return this;
    }

    public String getUSTaxIdentifierTypeCode() {
        return uSTaxIdentifierTypeCode;
    }

    public void setUSTaxIdentifierTypeCode(String uSTaxIdentifierTypeCode) {
        this.uSTaxIdentifierTypeCode = uSTaxIdentifierTypeCode;
    }

    public USTaxIdentification withUSTaxIdentifierTypeCode(String uSTaxIdentifierTypeCode) {
        this.uSTaxIdentifierTypeCode = uSTaxIdentifierTypeCode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("uSTaxIdentifier", uSTaxIdentifier).append("uSTaxIdentifierTypeCode", uSTaxIdentifierTypeCode).toString();
    }

}
