
package com.aarpcare.aarpcare.services.usbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Balances {

    @SerializedName("AccessibleBalanceAmount")
    @Expose
    private String accessibleBalanceAmount;
    @SerializedName("InvestmentBalanceAmount")
    @Expose
    private String investmentBalanceAmount;
    @SerializedName("CreditAvailableBalanceAmount")
    @Expose
    private String creditAvailableBalanceAmount;
    @SerializedName("PayoffBalanceAmount")
    @Expose
    private String payoffBalanceAmount;
    @SerializedName("AvailableBalanceAmount")
    @Expose
    private String availableBalanceAmount;
    @SerializedName("CurrentBalanceAmount")
    @Expose
    private String currentBalanceAmount;

    public String getAccessibleBalanceAmount() {
        return accessibleBalanceAmount;
    }

    public void setAccessibleBalanceAmount(String accessibleBalanceAmount) {
        this.accessibleBalanceAmount = accessibleBalanceAmount;
    }

    public Balances withAccessibleBalanceAmount(String accessibleBalanceAmount) {
        this.accessibleBalanceAmount = accessibleBalanceAmount;
        return this;
    }

    public String getInvestmentBalanceAmount() {
        return investmentBalanceAmount;
    }

    public void setInvestmentBalanceAmount(String investmentBalanceAmount) {
        this.investmentBalanceAmount = investmentBalanceAmount;
    }

    public Balances withInvestmentBalanceAmount(String investmentBalanceAmount) {
        this.investmentBalanceAmount = investmentBalanceAmount;
        return this;
    }

    public String getCreditAvailableBalanceAmount() {
        return creditAvailableBalanceAmount;
    }

    public void setCreditAvailableBalanceAmount(String creditAvailableBalanceAmount) {
        this.creditAvailableBalanceAmount = creditAvailableBalanceAmount;
    }

    public Balances withCreditAvailableBalanceAmount(String creditAvailableBalanceAmount) {
        this.creditAvailableBalanceAmount = creditAvailableBalanceAmount;
        return this;
    }

    public String getPayoffBalanceAmount() {
        return payoffBalanceAmount;
    }

    public void setPayoffBalanceAmount(String payoffBalanceAmount) {
        this.payoffBalanceAmount = payoffBalanceAmount;
    }

    public Balances withPayoffBalanceAmount(String payoffBalanceAmount) {
        this.payoffBalanceAmount = payoffBalanceAmount;
        return this;
    }

    public String getAvailableBalanceAmount() {
        return availableBalanceAmount;
    }

    public void setAvailableBalanceAmount(String availableBalanceAmount) {
        this.availableBalanceAmount = availableBalanceAmount;
    }

    public Balances withAvailableBalanceAmount(String availableBalanceAmount) {
        this.availableBalanceAmount = availableBalanceAmount;
        return this;
    }

    public String getCurrentBalanceAmount() {
        return currentBalanceAmount;
    }

    public void setCurrentBalanceAmount(String currentBalanceAmount) {
        this.currentBalanceAmount = currentBalanceAmount;
    }

    public Balances withCurrentBalanceAmount(String currentBalanceAmount) {
        this.currentBalanceAmount = currentBalanceAmount;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("accessibleBalanceAmount", accessibleBalanceAmount).append("investmentBalanceAmount", investmentBalanceAmount).append("creditAvailableBalanceAmount", creditAvailableBalanceAmount).append("payoffBalanceAmount", payoffBalanceAmount).append("availableBalanceAmount", availableBalanceAmount).append("currentBalanceAmount", currentBalanceAmount).toString();
    }

}
