
package com.aarpcare.aarpcare.services.usbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OfficerAndProcessData {

    @SerializedName("LastDepositDate")
    @Expose
    private String lastDepositDate;
    @SerializedName("LastDebitorCreditTransactionDate")
    @Expose
    private String lastDebitorCreditTransactionDate;
    @SerializedName("ElectronicStatementAlertRequiredCode")
    @Expose
    private String electronicStatementAlertRequiredCode;
    @SerializedName("ElectronicStatementEligibleCode")
    @Expose
    private String electronicStatementEligibleCode;
    @SerializedName("ElectronicStatementAvailableToViewCode")
    @Expose
    private String electronicStatementAvailableToViewCode;
    @SerializedName("HealthSavingsAccountPriorYearContributionAmount")
    @Expose
    private String healthSavingsAccountPriorYearContributionAmount;
    @SerializedName("HealthSavingsAccountYearToDateContributionAmount")
    @Expose
    private String healthSavingsAccountYearToDateContributionAmount;
    @SerializedName("OverdraftProtectionEligibilityCode")
    @Expose
    private String overdraftProtectionEligibilityCode;
    @SerializedName("LineOfCreditPresentCode")
    @Expose
    private String lineOfCreditPresentCode;
    @SerializedName("RouterIdentifier")
    @Expose
    private String routerIdentifier;
    @SerializedName("BankTransitNumber")
    @Expose
    private String bankTransitNumber;
    @SerializedName("CheckOrderProfileNumber")
    @Expose
    private String checkOrderProfileNumber;
    @SerializedName("CheckVendorCode")
    @Expose
    private String checkVendorCode;

    public String getLastDepositDate() {
        return lastDepositDate;
    }

    public void setLastDepositDate(String lastDepositDate) {
        this.lastDepositDate = lastDepositDate;
    }

    public String getLastDebitorCreditTransactionDate() {
        return lastDebitorCreditTransactionDate;
    }

    public void setLastDebitorCreditTransactionDate(String lastDebitorCreditTransactionDate) {
        this.lastDebitorCreditTransactionDate = lastDebitorCreditTransactionDate;
    }

    public String getElectronicStatementAlertRequiredCode() {
        return electronicStatementAlertRequiredCode;
    }

    public void setElectronicStatementAlertRequiredCode(String electronicStatementAlertRequiredCode) {
        this.electronicStatementAlertRequiredCode = electronicStatementAlertRequiredCode;
    }

    public String getElectronicStatementEligibleCode() {
        return electronicStatementEligibleCode;
    }

    public void setElectronicStatementEligibleCode(String electronicStatementEligibleCode) {
        this.electronicStatementEligibleCode = electronicStatementEligibleCode;
    }

    public String getElectronicStatementAvailableToViewCode() {
        return electronicStatementAvailableToViewCode;
    }

    public void setElectronicStatementAvailableToViewCode(String electronicStatementAvailableToViewCode) {
        this.electronicStatementAvailableToViewCode = electronicStatementAvailableToViewCode;
    }

    public String getHealthSavingsAccountPriorYearContributionAmount() {
        return healthSavingsAccountPriorYearContributionAmount;
    }

    public void setHealthSavingsAccountPriorYearContributionAmount(String healthSavingsAccountPriorYearContributionAmount) {
        this.healthSavingsAccountPriorYearContributionAmount = healthSavingsAccountPriorYearContributionAmount;
    }

    public String getHealthSavingsAccountYearToDateContributionAmount() {
        return healthSavingsAccountYearToDateContributionAmount;
    }

    public void setHealthSavingsAccountYearToDateContributionAmount(String healthSavingsAccountYearToDateContributionAmount) {
        this.healthSavingsAccountYearToDateContributionAmount = healthSavingsAccountYearToDateContributionAmount;
    }

    public String getOverdraftProtectionEligibilityCode() {
        return overdraftProtectionEligibilityCode;
    }

    public void setOverdraftProtectionEligibilityCode(String overdraftProtectionEligibilityCode) {
        this.overdraftProtectionEligibilityCode = overdraftProtectionEligibilityCode;
    }

    public String getLineOfCreditPresentCode() {
        return lineOfCreditPresentCode;
    }

    public void setLineOfCreditPresentCode(String lineOfCreditPresentCode) {
        this.lineOfCreditPresentCode = lineOfCreditPresentCode;
    }

    public String getRouterIdentifier() {
        return routerIdentifier;
    }

    public void setRouterIdentifier(String routerIdentifier) {
        this.routerIdentifier = routerIdentifier;
    }

    public String getBankTransitNumber() {
        return bankTransitNumber;
    }

    public void setBankTransitNumber(String bankTransitNumber) {
        this.bankTransitNumber = bankTransitNumber;
    }

    public String getCheckOrderProfileNumber() {
        return checkOrderProfileNumber;
    }

    public void setCheckOrderProfileNumber(String checkOrderProfileNumber) {
        this.checkOrderProfileNumber = checkOrderProfileNumber;
    }

    public String getCheckVendorCode() {
        return checkVendorCode;
    }

    public void setCheckVendorCode(String checkVendorCode) {
        this.checkVendorCode = checkVendorCode;
    }

}
