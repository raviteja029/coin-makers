
package com.aarpcare.aarpcare.services.usbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccountDetails {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("OperatingCompanyIdentifier")
    @Expose
    private String operatingCompanyIdentifier;
    @SerializedName("ProductCode")
    @Expose
    private String productCode;
    @SerializedName("PrimaryIdentifier")
    @Expose
    private String primaryIdentifier;
    @SerializedName("LegalParticipantIdentifier")
    @Expose
    private String legalParticipantIdentifier;
    @SerializedName("BasicAccountDetail")
    @Expose
    private BasicAccountDetail basicAccountDetail;
    @SerializedName("AccountDetail")
    @Expose
    private AccountDetail accountDetail;
    @SerializedName("Status")
    @Expose
    private Status status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOperatingCompanyIdentifier() {
        return operatingCompanyIdentifier;
    }

    public void setOperatingCompanyIdentifier(String operatingCompanyIdentifier) {
        this.operatingCompanyIdentifier = operatingCompanyIdentifier;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getPrimaryIdentifier() {
        return primaryIdentifier;
    }

    public void setPrimaryIdentifier(String primaryIdentifier) {
        this.primaryIdentifier = primaryIdentifier;
    }

    public String getLegalParticipantIdentifier() {
        return legalParticipantIdentifier;
    }

    public void setLegalParticipantIdentifier(String legalParticipantIdentifier) {
        this.legalParticipantIdentifier = legalParticipantIdentifier;
    }

    public BasicAccountDetail getBasicAccountDetail() {
        return basicAccountDetail;
    }

    public void setBasicAccountDetail(BasicAccountDetail basicAccountDetail) {
        this.basicAccountDetail = basicAccountDetail;
    }

    public AccountDetail getAccountDetail() {
        return accountDetail;
    }

    public void setAccountDetail(AccountDetail accountDetail) {
        this.accountDetail = accountDetail;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
