
package com.aarpcare.aarpcare.services.usbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

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

    public OfficerAndProcessData withLastDepositDate(String lastDepositDate) {
        this.lastDepositDate = lastDepositDate;
        return this;
    }

    public String getLastDebitorCreditTransactionDate() {
        return lastDebitorCreditTransactionDate;
    }

    public void setLastDebitorCreditTransactionDate(String lastDebitorCreditTransactionDate) {
        this.lastDebitorCreditTransactionDate = lastDebitorCreditTransactionDate;
    }

    public OfficerAndProcessData withLastDebitorCreditTransactionDate(String lastDebitorCreditTransactionDate) {
        this.lastDebitorCreditTransactionDate = lastDebitorCreditTransactionDate;
        return this;
    }

    public String getElectronicStatementAlertRequiredCode() {
        return electronicStatementAlertRequiredCode;
    }

    public void setElectronicStatementAlertRequiredCode(String electronicStatementAlertRequiredCode) {
        this.electronicStatementAlertRequiredCode = electronicStatementAlertRequiredCode;
    }

    public OfficerAndProcessData withElectronicStatementAlertRequiredCode(String electronicStatementAlertRequiredCode) {
        this.electronicStatementAlertRequiredCode = electronicStatementAlertRequiredCode;
        return this;
    }

    public String getElectronicStatementEligibleCode() {
        return electronicStatementEligibleCode;
    }

    public void setElectronicStatementEligibleCode(String electronicStatementEligibleCode) {
        this.electronicStatementEligibleCode = electronicStatementEligibleCode;
    }

    public OfficerAndProcessData withElectronicStatementEligibleCode(String electronicStatementEligibleCode) {
        this.electronicStatementEligibleCode = electronicStatementEligibleCode;
        return this;
    }

    public String getElectronicStatementAvailableToViewCode() {
        return electronicStatementAvailableToViewCode;
    }

    public void setElectronicStatementAvailableToViewCode(String electronicStatementAvailableToViewCode) {
        this.electronicStatementAvailableToViewCode = electronicStatementAvailableToViewCode;
    }

    public OfficerAndProcessData withElectronicStatementAvailableToViewCode(String electronicStatementAvailableToViewCode) {
        this.electronicStatementAvailableToViewCode = electronicStatementAvailableToViewCode;
        return this;
    }

    public String getHealthSavingsAccountPriorYearContributionAmount() {
        return healthSavingsAccountPriorYearContributionAmount;
    }

    public void setHealthSavingsAccountPriorYearContributionAmount(String healthSavingsAccountPriorYearContributionAmount) {
        this.healthSavingsAccountPriorYearContributionAmount = healthSavingsAccountPriorYearContributionAmount;
    }

    public OfficerAndProcessData withHealthSavingsAccountPriorYearContributionAmount(String healthSavingsAccountPriorYearContributionAmount) {
        this.healthSavingsAccountPriorYearContributionAmount = healthSavingsAccountPriorYearContributionAmount;
        return this;
    }

    public String getHealthSavingsAccountYearToDateContributionAmount() {
        return healthSavingsAccountYearToDateContributionAmount;
    }

    public void setHealthSavingsAccountYearToDateContributionAmount(String healthSavingsAccountYearToDateContributionAmount) {
        this.healthSavingsAccountYearToDateContributionAmount = healthSavingsAccountYearToDateContributionAmount;
    }

    public OfficerAndProcessData withHealthSavingsAccountYearToDateContributionAmount(String healthSavingsAccountYearToDateContributionAmount) {
        this.healthSavingsAccountYearToDateContributionAmount = healthSavingsAccountYearToDateContributionAmount;
        return this;
    }

    public String getOverdraftProtectionEligibilityCode() {
        return overdraftProtectionEligibilityCode;
    }

    public void setOverdraftProtectionEligibilityCode(String overdraftProtectionEligibilityCode) {
        this.overdraftProtectionEligibilityCode = overdraftProtectionEligibilityCode;
    }

    public OfficerAndProcessData withOverdraftProtectionEligibilityCode(String overdraftProtectionEligibilityCode) {
        this.overdraftProtectionEligibilityCode = overdraftProtectionEligibilityCode;
        return this;
    }

    public String getLineOfCreditPresentCode() {
        return lineOfCreditPresentCode;
    }

    public void setLineOfCreditPresentCode(String lineOfCreditPresentCode) {
        this.lineOfCreditPresentCode = lineOfCreditPresentCode;
    }

    public OfficerAndProcessData withLineOfCreditPresentCode(String lineOfCreditPresentCode) {
        this.lineOfCreditPresentCode = lineOfCreditPresentCode;
        return this;
    }

    public String getRouterIdentifier() {
        return routerIdentifier;
    }

    public void setRouterIdentifier(String routerIdentifier) {
        this.routerIdentifier = routerIdentifier;
    }

    public OfficerAndProcessData withRouterIdentifier(String routerIdentifier) {
        this.routerIdentifier = routerIdentifier;
        return this;
    }

    public String getBankTransitNumber() {
        return bankTransitNumber;
    }

    public void setBankTransitNumber(String bankTransitNumber) {
        this.bankTransitNumber = bankTransitNumber;
    }

    public OfficerAndProcessData withBankTransitNumber(String bankTransitNumber) {
        this.bankTransitNumber = bankTransitNumber;
        return this;
    }

    public String getCheckOrderProfileNumber() {
        return checkOrderProfileNumber;
    }

    public void setCheckOrderProfileNumber(String checkOrderProfileNumber) {
        this.checkOrderProfileNumber = checkOrderProfileNumber;
    }

    public OfficerAndProcessData withCheckOrderProfileNumber(String checkOrderProfileNumber) {
        this.checkOrderProfileNumber = checkOrderProfileNumber;
        return this;
    }

    public String getCheckVendorCode() {
        return checkVendorCode;
    }

    public void setCheckVendorCode(String checkVendorCode) {
        this.checkVendorCode = checkVendorCode;
    }

    public OfficerAndProcessData withCheckVendorCode(String checkVendorCode) {
        this.checkVendorCode = checkVendorCode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("lastDepositDate", lastDepositDate).append("lastDebitorCreditTransactionDate", lastDebitorCreditTransactionDate).append("electronicStatementAlertRequiredCode", electronicStatementAlertRequiredCode).append("electronicStatementEligibleCode", electronicStatementEligibleCode).append("electronicStatementAvailableToViewCode", electronicStatementAvailableToViewCode).append("healthSavingsAccountPriorYearContributionAmount", healthSavingsAccountPriorYearContributionAmount).append("healthSavingsAccountYearToDateContributionAmount", healthSavingsAccountYearToDateContributionAmount).append("overdraftProtectionEligibilityCode", overdraftProtectionEligibilityCode).append("lineOfCreditPresentCode", lineOfCreditPresentCode).append("routerIdentifier", routerIdentifier).append("bankTransitNumber", bankTransitNumber).append("checkOrderProfileNumber", checkOrderProfileNumber).append("checkVendorCode", checkVendorCode).toString();
    }

}
