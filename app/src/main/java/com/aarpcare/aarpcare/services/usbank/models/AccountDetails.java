
package com.aarpcare.aarpcare.services.usbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

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

    public AccountDetails withId(String id) {
        this.id = id;
        return this;
    }

    public String getOperatingCompanyIdentifier() {
        return operatingCompanyIdentifier;
    }

    public void setOperatingCompanyIdentifier(String operatingCompanyIdentifier) {
        this.operatingCompanyIdentifier = operatingCompanyIdentifier;
    }

    public AccountDetails withOperatingCompanyIdentifier(String operatingCompanyIdentifier) {
        this.operatingCompanyIdentifier = operatingCompanyIdentifier;
        return this;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public AccountDetails withProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    public String getPrimaryIdentifier() {
        return primaryIdentifier;
    }

    public void setPrimaryIdentifier(String primaryIdentifier) {
        this.primaryIdentifier = primaryIdentifier;
    }

    public AccountDetails withPrimaryIdentifier(String primaryIdentifier) {
        this.primaryIdentifier = primaryIdentifier;
        return this;
    }

    public String getLegalParticipantIdentifier() {
        return legalParticipantIdentifier;
    }

    public void setLegalParticipantIdentifier(String legalParticipantIdentifier) {
        this.legalParticipantIdentifier = legalParticipantIdentifier;
    }

    public AccountDetails withLegalParticipantIdentifier(String legalParticipantIdentifier) {
        this.legalParticipantIdentifier = legalParticipantIdentifier;
        return this;
    }

    public BasicAccountDetail getBasicAccountDetail() {
        return basicAccountDetail;
    }

    public void setBasicAccountDetail(BasicAccountDetail basicAccountDetail) {
        this.basicAccountDetail = basicAccountDetail;
    }

    public AccountDetails withBasicAccountDetail(BasicAccountDetail basicAccountDetail) {
        this.basicAccountDetail = basicAccountDetail;
        return this;
    }

    public AccountDetail getAccountDetail() {
        return accountDetail;
    }

    public void setAccountDetail(AccountDetail accountDetail) {
        this.accountDetail = accountDetail;
    }

    public AccountDetails withAccountDetail(AccountDetail accountDetail) {
        this.accountDetail = accountDetail;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public AccountDetails withStatus(Status status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("operatingCompanyIdentifier", operatingCompanyIdentifier).append("productCode", productCode).append("primaryIdentifier", primaryIdentifier).append("legalParticipantIdentifier", legalParticipantIdentifier).append("basicAccountDetail", basicAccountDetail).append("accountDetail", accountDetail).append("status", status).toString();
    }

}
