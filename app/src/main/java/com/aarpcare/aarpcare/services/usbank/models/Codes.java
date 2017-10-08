
package com.aarpcare.aarpcare.services.usbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Codes {

    @SerializedName("StatusDescription")
    @Expose
    private String statusDescription;
    @SerializedName("AccountStatusCode")
    @Expose
    private String accountStatusCode;
    @SerializedName("SubProductCode")
    @Expose
    private String subProductCode;
    @SerializedName("RelationshipCode")
    @Expose
    private String relationshipCode;
    @SerializedName("CategoryDescription")
    @Expose
    private String categoryDescription;
    @SerializedName("CategoryCode")
    @Expose
    private String categoryCode;

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public Codes withStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
        return this;
    }

    public String getAccountStatusCode() {
        return accountStatusCode;
    }

    public void setAccountStatusCode(String accountStatusCode) {
        this.accountStatusCode = accountStatusCode;
    }

    public Codes withAccountStatusCode(String accountStatusCode) {
        this.accountStatusCode = accountStatusCode;
        return this;
    }

    public String getSubProductCode() {
        return subProductCode;
    }

    public void setSubProductCode(String subProductCode) {
        this.subProductCode = subProductCode;
    }

    public Codes withSubProductCode(String subProductCode) {
        this.subProductCode = subProductCode;
        return this;
    }

    public String getRelationshipCode() {
        return relationshipCode;
    }

    public void setRelationshipCode(String relationshipCode) {
        this.relationshipCode = relationshipCode;
    }

    public Codes withRelationshipCode(String relationshipCode) {
        this.relationshipCode = relationshipCode;
        return this;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public Codes withCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
        return this;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public Codes withCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("statusDescription", statusDescription).append("accountStatusCode", accountStatusCode).append("subProductCode", subProductCode).append("relationshipCode", relationshipCode).append("categoryDescription", categoryDescription).append("categoryCode", categoryCode).toString();
    }

}
