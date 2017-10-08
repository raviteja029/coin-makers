
package com.aarpcare.aarpcare.services.usbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    public String getRegulationDNumberOfWithdrawalsRemaining() {
        return regulationDNumberOfWithdrawalsRemaining;
    }

    public void setRegulationDNumberOfWithdrawalsRemaining(String regulationDNumberOfWithdrawalsRemaining) {
        this.regulationDNumberOfWithdrawalsRemaining = regulationDNumberOfWithdrawalsRemaining;
    }

    public String getCustomerSegmentIndicatorBenefitsCode() {
        return customerSegmentIndicatorBenefitsCode;
    }

    public void setCustomerSegmentIndicatorBenefitsCode(String customerSegmentIndicatorBenefitsCode) {
        this.customerSegmentIndicatorBenefitsCode = customerSegmentIndicatorBenefitsCode;
    }

    public String getOverdraftProtectionInOutDate() {
        return overdraftProtectionInOutDate;
    }

    public void setOverdraftProtectionInOutDate(String overdraftProtectionInOutDate) {
        this.overdraftProtectionInOutDate = overdraftProtectionInOutDate;
    }

    public String getOverdraftProtectionInOutCode() {
        return overdraftProtectionInOutCode;
    }

    public void setOverdraftProtectionInOutCode(String overdraftProtectionInOutCode) {
        this.overdraftProtectionInOutCode = overdraftProtectionInOutCode;
    }

    public String getOverdraftRegEEligibilityCode() {
        return overdraftRegEEligibilityCode;
    }

    public void setOverdraftRegEEligibilityCode(String overdraftRegEEligibilityCode) {
        this.overdraftRegEEligibilityCode = overdraftRegEEligibilityCode;
    }

    public String getSegmentCompanyName() {
        return segmentCompanyName;
    }

    public void setSegmentCompanyName(String segmentCompanyName) {
        this.segmentCompanyName = segmentCompanyName;
    }

    public String getPackageAccount2Number() {
        return packageAccount2Number;
    }

    public void setPackageAccount2Number(String packageAccount2Number) {
        this.packageAccount2Number = packageAccount2Number;
    }

    public String getCreditHoldoverAmount() {
        return creditHoldoverAmount;
    }

    public void setCreditHoldoverAmount(String creditHoldoverAmount) {
        this.creditHoldoverAmount = creditHoldoverAmount;
    }

    public String getStatementFormMediaCode() {
        return statementFormMediaCode;
    }

    public void setStatementFormMediaCode(String statementFormMediaCode) {
        this.statementFormMediaCode = statementFormMediaCode;
    }

    public String getStatementFormNumberCode() {
        return statementFormNumberCode;
    }

    public void setStatementFormNumberCode(String statementFormNumberCode) {
        this.statementFormNumberCode = statementFormNumberCode;
    }

    public String getFundsAvailabilityPolicyCode() {
        return fundsAvailabilityPolicyCode;
    }

    public void setFundsAvailabilityPolicyCode(String fundsAvailabilityPolicyCode) {
        this.fundsAvailabilityPolicyCode = fundsAvailabilityPolicyCode;
    }

    public String getDeferredAvailabilityRegCCCustomerTypeCode() {
        return deferredAvailabilityRegCCCustomerTypeCode;
    }

    public void setDeferredAvailabilityRegCCCustomerTypeCode(String deferredAvailabilityRegCCCustomerTypeCode) {
        this.deferredAvailabilityRegCCCustomerTypeCode = deferredAvailabilityRegCCCustomerTypeCode;
    }

    public String getDeferredAvailabilityRegCCDate() {
        return deferredAvailabilityRegCCDate;
    }

    public void setDeferredAvailabilityRegCCDate(String deferredAvailabilityRegCCDate) {
        this.deferredAvailabilityRegCCDate = deferredAvailabilityRegCCDate;
    }

    public String getDDASegmentCode() {
        return dDASegmentCode;
    }

    public void setDDASegmentCode(String dDASegmentCode) {
        this.dDASegmentCode = dDASegmentCode;
    }

    public String getCardRewardsCode() {
        return cardRewardsCode;
    }

    public void setCardRewardsCode(String cardRewardsCode) {
        this.cardRewardsCode = cardRewardsCode;
    }

}
