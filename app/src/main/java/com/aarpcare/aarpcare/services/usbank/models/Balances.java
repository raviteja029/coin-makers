
package com.aarpcare.aarpcare.services.usbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    public String getInvestmentBalanceAmount() {
        return investmentBalanceAmount;
    }

    public void setInvestmentBalanceAmount(String investmentBalanceAmount) {
        this.investmentBalanceAmount = investmentBalanceAmount;
    }

    public String getCreditAvailableBalanceAmount() {
        return creditAvailableBalanceAmount;
    }

    public void setCreditAvailableBalanceAmount(String creditAvailableBalanceAmount) {
        this.creditAvailableBalanceAmount = creditAvailableBalanceAmount;
    }

    public String getPayoffBalanceAmount() {
        return payoffBalanceAmount;
    }

    public void setPayoffBalanceAmount(String payoffBalanceAmount) {
        this.payoffBalanceAmount = payoffBalanceAmount;
    }

    public String getAvailableBalanceAmount() {
        return availableBalanceAmount;
    }

    public void setAvailableBalanceAmount(String availableBalanceAmount) {
        this.availableBalanceAmount = availableBalanceAmount;
    }

    public String getCurrentBalanceAmount() {
        return currentBalanceAmount;
    }

    public void setCurrentBalanceAmount(String currentBalanceAmount) {
        this.currentBalanceAmount = currentBalanceAmount;
    }

}
