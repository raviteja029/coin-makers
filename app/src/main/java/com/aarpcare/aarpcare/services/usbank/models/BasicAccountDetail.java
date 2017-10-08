
package com.aarpcare.aarpcare.services.usbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class BasicAccountDetail {

    @SerializedName("Balances")
    @Expose
    private Balances balances;
    @SerializedName("Codes")
    @Expose
    private Codes codes;
    @SerializedName("RedactedAccountNumber")
    @Expose
    private String redactedAccountNumber;
    @SerializedName("BranchIdentifier")
    @Expose
    private String branchIdentifier;

    public Balances getBalances() {
        return balances;
    }

    public void setBalances(Balances balances) {
        this.balances = balances;
    }

    public BasicAccountDetail withBalances(Balances balances) {
        this.balances = balances;
        return this;
    }

    public Codes getCodes() {
        return codes;
    }

    public void setCodes(Codes codes) {
        this.codes = codes;
    }

    public BasicAccountDetail withCodes(Codes codes) {
        this.codes = codes;
        return this;
    }

    public String getRedactedAccountNumber() {
        return redactedAccountNumber;
    }

    public void setRedactedAccountNumber(String redactedAccountNumber) {
        this.redactedAccountNumber = redactedAccountNumber;
    }

    public BasicAccountDetail withRedactedAccountNumber(String redactedAccountNumber) {
        this.redactedAccountNumber = redactedAccountNumber;
        return this;
    }

    public String getBranchIdentifier() {
        return branchIdentifier;
    }

    public void setBranchIdentifier(String branchIdentifier) {
        this.branchIdentifier = branchIdentifier;
    }

    public BasicAccountDetail withBranchIdentifier(String branchIdentifier) {
        this.branchIdentifier = branchIdentifier;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("balances", balances).append("codes", codes).append("redactedAccountNumber", redactedAccountNumber).append("branchIdentifier", branchIdentifier).toString();
    }

}
