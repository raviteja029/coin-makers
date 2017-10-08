
package com.aarpcare.aarpcare.services.usbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    public Codes getCodes() {
        return codes;
    }

    public void setCodes(Codes codes) {
        this.codes = codes;
    }

    public String getRedactedAccountNumber() {
        return redactedAccountNumber;
    }

    public void setRedactedAccountNumber(String redactedAccountNumber) {
        this.redactedAccountNumber = redactedAccountNumber;
    }

    public String getBranchIdentifier() {
        return branchIdentifier;
    }

    public void setBranchIdentifier(String branchIdentifier) {
        this.branchIdentifier = branchIdentifier;
    }

}
