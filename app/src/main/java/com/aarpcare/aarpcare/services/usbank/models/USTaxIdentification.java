
package com.aarpcare.aarpcare.services.usbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    public String getUSTaxIdentifierTypeCode() {
        return uSTaxIdentifierTypeCode;
    }

    public void setUSTaxIdentifierTypeCode(String uSTaxIdentifierTypeCode) {
        this.uSTaxIdentifierTypeCode = uSTaxIdentifierTypeCode;
    }

}
