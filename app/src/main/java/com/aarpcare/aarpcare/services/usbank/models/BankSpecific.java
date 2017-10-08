
package com.aarpcare.aarpcare.services.usbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class BankSpecific {

    @SerializedName("RegulationDNumberOfCycleToDateFeesCharged")
    @Expose
    private String regulationDNumberOfCycleToDateFeesCharged;
    @SerializedName("RegulationDNumberOfWithdrawalsRemaining")
    @Expose
    private String regulationDNumberOfWithdrawalsRemaining;
    @SerializedName("CustomerSegmentIndicatorBenefitsCode")
    @Expose
    private String customerSegmentIndicatorBenefitsCode;
    @SerializedName("OverdraftProtectionInOutDate")
    @Expose
    private String overdraftProtectionInOutDate;
    @SerializedName("OverdraftProtectionInOutCode")
    @Expose
    private String overdraftProtectionInOutCode;
    @SerializedName("OverdraftRegEEligibilityCode")
    @Expose
    private String overdraftRegEEligibilityCode;
    @SerializedName("SegmentCompanyName")
    @Expose
    private String segmentCompanyName;
    @SerializedName("PackageAccount2Number")
    @Expose
    private String packageAccount2Number;
    @SerializedName("CreditHoldoverAmount")
    @Expose
    private String creditHoldoverAmount;
    @SerializedName("StatementFormMediaCode")
    @Expose
    private String statementFormMediaCode;
    @SerializedName("StatementFormNumberCode")
    @Expose
    private String statementFormNumberCode;
    @SerializedName("FundsAvailabilityPolicyCode")
    @Expose
    private String fundsAvailabilityPolicyCode;
    @SerializedName("DeferredAvailabilityRegCCCustomerTypeCode")
    @Expose
    private String deferredAvailabilityRegCCCustomerTypeCode;
    @SerializedName("DeferredAvailabilityRegCCDate")
    @Expose
    private String deferredAvailabilityRegCCDate;
    @SerializedName("DDASegmentCode")
    @Expose
    private String dDASegmentCode;
    @SerializedName("CardRewardsCode")
    @Expose
    private String cardRewardsCode;

    public String getRegulationDNumberOfCycleToDateFeesCharged() {
        return regulationDNumberOfCycleToDateFeesCharged;
    }

    public void setRegulationDNumberOfCycleToDateFeesCharged(String regulationDNumberOfCycleToDateFeesCharged) {
        this.regulationDNumberOfCycleToDateFeesCharged = regulationDNumberOfCycleToDateFeesCharged;
    }

    public BankSpecific withRegulationDNumberOfCycleToDateFeesCharged(String regulationDNumberOfCycleToDateFeesCharged) {
        this.regulationDNumberOfCycleToDateFeesCharged = regulationDNumberOfCycleToDateFeesCharged;
        return this;
    }

    public String getRegulationDNumberOfWithdrawalsRemaining() {
        return regulationDNumberOfWithdrawalsRemaining;
    }

    public void setRegulationDNumberOfWithdrawalsRemaining(String regulationDNumberOfWithdrawalsRemaining) {
        this.regulationDNumberOfWithdrawalsRemaining = regulationDNumberOfWithdrawalsRemaining;
    }

    public BankSpecific withRegulationDNumberOfWithdrawalsRemaining(String regulationDNumberOfWithdrawalsRemaining) {
        this.regulationDNumberOfWithdrawalsRemaining = regulationDNumberOfWithdrawalsRemaining;
        return this;
    }

    public String getCustomerSegmentIndicatorBenefitsCode() {
        return customerSegmentIndicatorBenefitsCode;
    }

    public void setCustomerSegmentIndicatorBenefitsCode(String customerSegmentIndicatorBenefitsCode) {
        this.customerSegmentIndicatorBenefitsCode = customerSegmentIndicatorBenefitsCode;
    }

    public BankSpecific withCustomerSegmentIndicatorBenefitsCode(String customerSegmentIndicatorBenefitsCode) {
        this.customerSegmentIndicatorBenefitsCode = customerSegmentIndicatorBenefitsCode;
        return this;
    }

    public String getOverdraftProtectionInOutDate() {
        return overdraftProtectionInOutDate;
    }

    public void setOverdraftProtectionInOutDate(String overdraftProtectionInOutDate) {
        this.overdraftProtectionInOutDate = overdraftProtectionInOutDate;
    }

    public BankSpecific withOverdraftProtectionInOutDate(String overdraftProtectionInOutDate) {
        this.overdraftProtectionInOutDate = overdraftProtectionInOutDate;
        return this;
    }

    public String getOverdraftProtectionInOutCode() {
        return overdraftProtectionInOutCode;
    }

    public void setOverdraftProtectionInOutCode(String overdraftProtectionInOutCode) {
        this.overdraftProtectionInOutCode = overdraftProtectionInOutCode;
    }

    public BankSpecific withOverdraftProtectionInOutCode(String overdraftProtectionInOutCode) {
        this.overdraftProtectionInOutCode = overdraftProtectionInOutCode;
        return this;
    }

    public String getOverdraftRegEEligibilityCode() {
        return overdraftRegEEligibilityCode;
    }

    public void setOverdraftRegEEligibilityCode(String overdraftRegEEligibilityCode) {
        this.overdraftRegEEligibilityCode = overdraftRegEEligibilityCode;
    }

    public BankSpecific withOverdraftRegEEligibilityCode(String overdraftRegEEligibilityCode) {
        this.overdraftRegEEligibilityCode = overdraftRegEEligibilityCode;
        return this;
    }

    public String getSegmentCompanyName() {
        return segmentCompanyName;
    }

    public void setSegmentCompanyName(String segmentCompanyName) {
        this.segmentCompanyName = segmentCompanyName;
    }

    public BankSpecific withSegmentCompanyName(String segmentCompanyName) {
        this.segmentCompanyName = segmentCompanyName;
        return this;
    }

    public String getPackageAccount2Number() {
        return packageAccount2Number;
    }

    public void setPackageAccount2Number(String packageAccount2Number) {
        this.packageAccount2Number = packageAccount2Number;
    }

    public BankSpecific withPackageAccount2Number(String packageAccount2Number) {
        this.packageAccount2Number = packageAccount2Number;
        return this;
    }

    public String getCreditHoldoverAmount() {
        return creditHoldoverAmount;
    }

    public void setCreditHoldoverAmount(String creditHoldoverAmount) {
        this.creditHoldoverAmount = creditHoldoverAmount;
    }

    public BankSpecific withCreditHoldoverAmount(String creditHoldoverAmount) {
        this.creditHoldoverAmount = creditHoldoverAmount;
        return this;
    }

    public String getStatementFormMediaCode() {
        return statementFormMediaCode;
    }

    public void setStatementFormMediaCode(String statementFormMediaCode) {
        this.statementFormMediaCode = statementFormMediaCode;
    }

    public BankSpecific withStatementFormMediaCode(String statementFormMediaCode) {
        this.statementFormMediaCode = statementFormMediaCode;
        return this;
    }

    public String getStatementFormNumberCode() {
        return statementFormNumberCode;
    }

    public void setStatementFormNumberCode(String statementFormNumberCode) {
        this.statementFormNumberCode = statementFormNumberCode;
    }

    public BankSpecific withStatementFormNumberCode(String statementFormNumberCode) {
        this.statementFormNumberCode = statementFormNumberCode;
        return this;
    }

    public String getFundsAvailabilityPolicyCode() {
        return fundsAvailabilityPolicyCode;
    }

    public void setFundsAvailabilityPolicyCode(String fundsAvailabilityPolicyCode) {
        this.fundsAvailabilityPolicyCode = fundsAvailabilityPolicyCode;
    }

    public BankSpecific withFundsAvailabilityPolicyCode(String fundsAvailabilityPolicyCode) {
        this.fundsAvailabilityPolicyCode = fundsAvailabilityPolicyCode;
        return this;
    }

    public String getDeferredAvailabilityRegCCCustomerTypeCode() {
        return deferredAvailabilityRegCCCustomerTypeCode;
    }

    public void setDeferredAvailabilityRegCCCustomerTypeCode(String deferredAvailabilityRegCCCustomerTypeCode) {
        this.deferredAvailabilityRegCCCustomerTypeCode = deferredAvailabilityRegCCCustomerTypeCode;
    }

    public BankSpecific withDeferredAvailabilityRegCCCustomerTypeCode(String deferredAvailabilityRegCCCustomerTypeCode) {
        this.deferredAvailabilityRegCCCustomerTypeCode = deferredAvailabilityRegCCCustomerTypeCode;
        return this;
    }

    public String getDeferredAvailabilityRegCCDate() {
        return deferredAvailabilityRegCCDate;
    }

    public void setDeferredAvailabilityRegCCDate(String deferredAvailabilityRegCCDate) {
        this.deferredAvailabilityRegCCDate = deferredAvailabilityRegCCDate;
    }

    public BankSpecific withDeferredAvailabilityRegCCDate(String deferredAvailabilityRegCCDate) {
        this.deferredAvailabilityRegCCDate = deferredAvailabilityRegCCDate;
        return this;
    }

    public String getDDASegmentCode() {
        return dDASegmentCode;
    }

    public void setDDASegmentCode(String dDASegmentCode) {
        this.dDASegmentCode = dDASegmentCode;
    }

    public BankSpecific withDDASegmentCode(String dDASegmentCode) {
        this.dDASegmentCode = dDASegmentCode;
        return this;
    }

    public String getCardRewardsCode() {
        return cardRewardsCode;
    }

    public void setCardRewardsCode(String cardRewardsCode) {
        this.cardRewardsCode = cardRewardsCode;
    }

    public BankSpecific withCardRewardsCode(String cardRewardsCode) {
        this.cardRewardsCode = cardRewardsCode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("regulationDNumberOfCycleToDateFeesCharged", regulationDNumberOfCycleToDateFeesCharged).append("regulationDNumberOfWithdrawalsRemaining", regulationDNumberOfWithdrawalsRemaining).append("customerSegmentIndicatorBenefitsCode", customerSegmentIndicatorBenefitsCode).append("overdraftProtectionInOutDate", overdraftProtectionInOutDate).append("overdraftProtectionInOutCode", overdraftProtectionInOutCode).append("overdraftRegEEligibilityCode", overdraftRegEEligibilityCode).append("segmentCompanyName", segmentCompanyName).append("packageAccount2Number", packageAccount2Number).append("creditHoldoverAmount", creditHoldoverAmount).append("statementFormMediaCode", statementFormMediaCode).append("statementFormNumberCode", statementFormNumberCode).append("fundsAvailabilityPolicyCode", fundsAvailabilityPolicyCode).append("deferredAvailabilityRegCCCustomerTypeCode", deferredAvailabilityRegCCCustomerTypeCode).append("deferredAvailabilityRegCCDate", deferredAvailabilityRegCCDate).append("dDASegmentCode", dDASegmentCode).append("cardRewardsCode", cardRewardsCode).toString();
    }

}
