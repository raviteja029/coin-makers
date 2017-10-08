
package com.aarpcare.aarpcare.services.usbank.api_request_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class GetAccountDetailsRequest {

    @SerializedName("OperatingCompanyIdentifier")
    @Expose
    private String operatingCompanyIdentifier;
    @SerializedName("ProductCode")
    @Expose
    private String productCode;
    @SerializedName("PrimaryIdentifier")
    @Expose
    private String primaryIdentifier;

    public String getOperatingCompanyIdentifier() {
        return operatingCompanyIdentifier;
    }

    public void setOperatingCompanyIdentifier(String operatingCompanyIdentifier) {
        this.operatingCompanyIdentifier = operatingCompanyIdentifier;
    }

    public GetAccountDetailsRequest withOperatingCompanyIdentifier(String operatingCompanyIdentifier) {
        this.operatingCompanyIdentifier = operatingCompanyIdentifier;
        return this;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public GetAccountDetailsRequest withProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    public String getPrimaryIdentifier() {
        return primaryIdentifier;
    }

    public void setPrimaryIdentifier(String primaryIdentifier) {
        this.primaryIdentifier = primaryIdentifier;
    }

    public GetAccountDetailsRequest withPrimaryIdentifier(String primaryIdentifier) {
        this.primaryIdentifier = primaryIdentifier;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("operatingCompanyIdentifier", operatingCompanyIdentifier).append("productCode", productCode).append("primaryIdentifier", primaryIdentifier).toString();
    }

}
