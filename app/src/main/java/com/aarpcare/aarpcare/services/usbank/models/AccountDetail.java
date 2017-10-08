
package com.aarpcare.aarpcare.services.usbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccountDetail {

    @SerializedName("BankSpecific")
    @Expose
    private BankSpecific bankSpecific;
    @SerializedName("OfficerAndProcessData")
    @Expose
    private OfficerAndProcessData officerAndProcessData;
    @SerializedName("OverDraftProtectionTotalNumber")
    @Expose
    private String overDraftProtectionTotalNumber;
    @SerializedName("WithholdingDescription")
    @Expose
    private String withholdingDescription;
    @SerializedName("NetInterestRateNumber")
    @Expose
    private String netInterestRateNumber;
    @SerializedName("DDAFundedCode")
    @Expose
    private String dDAFundedCode;
    @SerializedName("StatementTypeCode")
    @Expose
    private String statementTypeCode;
    @SerializedName("BonusInterestRateNumber")
    @Expose
    private String bonusInterestRateNumber;
    @SerializedName("UBankAtWorkCompanyIdentifier")
    @Expose
    private String uBankAtWorkCompanyIdentifier;
    @SerializedName("LineOfCreditDummyDDACode")
    @Expose
    private String lineOfCreditDummyDDACode;
    @SerializedName("BalanceLevelNumber")
    @Expose
    private String balanceLevelNumber;
    @SerializedName("OverdraftItemsInOTPNumber")
    @Expose
    private String overdraftItemsInOTPNumber;
    @SerializedName("StatementGroupIdentifier")
    @Expose
    private String statementGroupIdentifier;
    @SerializedName("ZeroBalanceMasterAccountNumber")
    @Expose
    private String zeroBalanceMasterAccountNumber;
    @SerializedName("OverdraftCollectedBalanceToleranceAmount")
    @Expose
    private String overdraftCollectedBalanceToleranceAmount;
    @SerializedName("OverdraftLedgerBalanceToleranceAmount")
    @Expose
    private String overdraftLedgerBalanceToleranceAmount;
    @SerializedName("GenerateNonSufficientFundsOverdraftNoticeCode")
    @Expose
    private String generateNonSufficientFundsOverdraftNoticeCode;
    @SerializedName("LanguageCode")
    @Expose
    private String languageCode;
    @SerializedName("CalculatedInterestRateNumber")
    @Expose
    private String calculatedInterestRateNumber;
    @SerializedName("WithholdingCode")
    @Expose
    private String withholdingCode;
    @SerializedName("CurrentYearInterestPaidAmount")
    @Expose
    private String currentYearInterestPaidAmount;
    @SerializedName("PriorYearInterestPaidAmount")
    @Expose
    private String priorYearInterestPaidAmount;
    @SerializedName("PriorCycleInterestPaidAmount")
    @Expose
    private String priorCycleInterestPaidAmount;
    @SerializedName("AccountCloseReasonCode")
    @Expose
    private String accountCloseReasonCode;
    @SerializedName("OverdraftItemsTodayNumber")
    @Expose
    private String overdraftItemsTodayNumber;
    @SerializedName("ReturnedChecksTodayNumber")
    @Expose
    private String returnedChecksTodayNumber;
    @SerializedName("TimesOverdrawnCount")
    @Expose
    private String timesOverdrawnCount;
    @SerializedName("TimesNonSufficientFundsCount")
    @Expose
    private String timesNonSufficientFundsCount;
    @SerializedName("ReturnedCheckChargesWaivedAmount")
    @Expose
    private String returnedCheckChargesWaivedAmount;
    @SerializedName("OverdraftChargesWaivedAmount")
    @Expose
    private String overdraftChargesWaivedAmount;
    @SerializedName("FundsOwnershipCode")
    @Expose
    private String fundsOwnershipCode;
    @SerializedName("StatementCycleCode")
    @Expose
    private String statementCycleCode;
    @SerializedName("LastDepositAmount")
    @Expose
    private String lastDepositAmount;
    @SerializedName("ACHCreditsNumber")
    @Expose
    private String aCHCreditsNumber;
    @SerializedName("LastInterestPaymentDate")
    @Expose
    private String lastInterestPaymentDate;
    @SerializedName("CurrentCycleInterestAccruedAmount")
    @Expose
    private String currentCycleInterestAccruedAmount;
    @SerializedName("BalanceLastStatementAmount")
    @Expose
    private String balanceLastStatementAmount;
    @SerializedName("LastStatementDate")
    @Expose
    private String lastStatementDate;
    @SerializedName("BonusInterestDataPresentCode")
    @Expose
    private String bonusInterestDataPresentCode;
    @SerializedName("EffectiveDatedOverdraftLimitsCode")
    @Expose
    private String effectiveDatedOverdraftLimitsCode;
    @SerializedName("DailyBalanceSelectCode")
    @Expose
    private String dailyBalanceSelectCode;
    @SerializedName("SignaturesRequiredNumber")
    @Expose
    private String signaturesRequiredNumber;
    @SerializedName("SafeKeepingFlagCode")
    @Expose
    private String safeKeepingFlagCode;
    @SerializedName("LargeItemMonitorCode")
    @Expose
    private String largeItemMonitorCode;
    @SerializedName("SignificantBalanceChangeCode")
    @Expose
    private String significantBalanceChangeCode;
    @SerializedName("CreditLineAmount")
    @Expose
    private String creditLineAmount;
    @SerializedName("USTaxIdentification")
    @Expose
    private USTaxIdentification uSTaxIdentification;
    @SerializedName("StatusDescription")
    @Expose
    private String statusDescription;
    @SerializedName("OfficerTelephoneNumber1")
    @Expose
    private String officerTelephoneNumber1;
    @SerializedName("OfficerName1")
    @Expose
    private String officerName1;
    @SerializedName("OfficerCode1")
    @Expose
    private String officerCode1;
    @SerializedName("CostCenter")
    @Expose
    private String costCenter;
    @SerializedName("Dates")
    @Expose
    private Dates dates;

    public BankSpecific getBankSpecific() {
        return bankSpecific;
    }

    public void setBankSpecific(BankSpecific bankSpecific) {
        this.bankSpecific = bankSpecific;
    }

    public OfficerAndProcessData getOfficerAndProcessData() {
        return officerAndProcessData;
    }

    public void setOfficerAndProcessData(OfficerAndProcessData officerAndProcessData) {
        this.officerAndProcessData = officerAndProcessData;
    }

    public String getOverDraftProtectionTotalNumber() {
        return overDraftProtectionTotalNumber;
    }

    public void setOverDraftProtectionTotalNumber(String overDraftProtectionTotalNumber) {
        this.overDraftProtectionTotalNumber = overDraftProtectionTotalNumber;
    }

    public String getWithholdingDescription() {
        return withholdingDescription;
    }

    public void setWithholdingDescription(String withholdingDescription) {
        this.withholdingDescription = withholdingDescription;
    }

    public String getNetInterestRateNumber() {
        return netInterestRateNumber;
    }

    public void setNetInterestRateNumber(String netInterestRateNumber) {
        this.netInterestRateNumber = netInterestRateNumber;
    }

    public String getDDAFundedCode() {
        return dDAFundedCode;
    }

    public void setDDAFundedCode(String dDAFundedCode) {
        this.dDAFundedCode = dDAFundedCode;
    }

    public String getStatementTypeCode() {
        return statementTypeCode;
    }

    public void setStatementTypeCode(String statementTypeCode) {
        this.statementTypeCode = statementTypeCode;
    }

    public String getBonusInterestRateNumber() {
        return bonusInterestRateNumber;
    }

    public void setBonusInterestRateNumber(String bonusInterestRateNumber) {
        this.bonusInterestRateNumber = bonusInterestRateNumber;
    }

    public String getUBankAtWorkCompanyIdentifier() {
        return uBankAtWorkCompanyIdentifier;
    }

    public void setUBankAtWorkCompanyIdentifier(String uBankAtWorkCompanyIdentifier) {
        this.uBankAtWorkCompanyIdentifier = uBankAtWorkCompanyIdentifier;
    }

    public String getLineOfCreditDummyDDACode() {
        return lineOfCreditDummyDDACode;
    }

    public void setLineOfCreditDummyDDACode(String lineOfCreditDummyDDACode) {
        this.lineOfCreditDummyDDACode = lineOfCreditDummyDDACode;
    }

    public String getBalanceLevelNumber() {
        return balanceLevelNumber;
    }

    public void setBalanceLevelNumber(String balanceLevelNumber) {
        this.balanceLevelNumber = balanceLevelNumber;
    }

    public String getOverdraftItemsInOTPNumber() {
        return overdraftItemsInOTPNumber;
    }

    public void setOverdraftItemsInOTPNumber(String overdraftItemsInOTPNumber) {
        this.overdraftItemsInOTPNumber = overdraftItemsInOTPNumber;
    }

    public String getStatementGroupIdentifier() {
        return statementGroupIdentifier;
    }

    public void setStatementGroupIdentifier(String statementGroupIdentifier) {
        this.statementGroupIdentifier = statementGroupIdentifier;
    }

    public String getZeroBalanceMasterAccountNumber() {
        return zeroBalanceMasterAccountNumber;
    }

    public void setZeroBalanceMasterAccountNumber(String zeroBalanceMasterAccountNumber) {
        this.zeroBalanceMasterAccountNumber = zeroBalanceMasterAccountNumber;
    }

    public String getOverdraftCollectedBalanceToleranceAmount() {
        return overdraftCollectedBalanceToleranceAmount;
    }

    public void setOverdraftCollectedBalanceToleranceAmount(String overdraftCollectedBalanceToleranceAmount) {
        this.overdraftCollectedBalanceToleranceAmount = overdraftCollectedBalanceToleranceAmount;
    }

    public String getOverdraftLedgerBalanceToleranceAmount() {
        return overdraftLedgerBalanceToleranceAmount;
    }

    public void setOverdraftLedgerBalanceToleranceAmount(String overdraftLedgerBalanceToleranceAmount) {
        this.overdraftLedgerBalanceToleranceAmount = overdraftLedgerBalanceToleranceAmount;
    }

    public String getGenerateNonSufficientFundsOverdraftNoticeCode() {
        return generateNonSufficientFundsOverdraftNoticeCode;
    }

    public void setGenerateNonSufficientFundsOverdraftNoticeCode(String generateNonSufficientFundsOverdraftNoticeCode) {
        this.generateNonSufficientFundsOverdraftNoticeCode = generateNonSufficientFundsOverdraftNoticeCode;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getCalculatedInterestRateNumber() {
        return calculatedInterestRateNumber;
    }

    public void setCalculatedInterestRateNumber(String calculatedInterestRateNumber) {
        this.calculatedInterestRateNumber = calculatedInterestRateNumber;
    }

    public String getWithholdingCode() {
        return withholdingCode;
    }

    public void setWithholdingCode(String withholdingCode) {
        this.withholdingCode = withholdingCode;
    }

    public String getCurrentYearInterestPaidAmount() {
        return currentYearInterestPaidAmount;
    }

    public void setCurrentYearInterestPaidAmount(String currentYearInterestPaidAmount) {
        this.currentYearInterestPaidAmount = currentYearInterestPaidAmount;
    }

    public String getPriorYearInterestPaidAmount() {
        return priorYearInterestPaidAmount;
    }

    public void setPriorYearInterestPaidAmount(String priorYearInterestPaidAmount) {
        this.priorYearInterestPaidAmount = priorYearInterestPaidAmount;
    }

    public String getPriorCycleInterestPaidAmount() {
        return priorCycleInterestPaidAmount;
    }

    public void setPriorCycleInterestPaidAmount(String priorCycleInterestPaidAmount) {
        this.priorCycleInterestPaidAmount = priorCycleInterestPaidAmount;
    }

    public String getAccountCloseReasonCode() {
        return accountCloseReasonCode;
    }

    public void setAccountCloseReasonCode(String accountCloseReasonCode) {
        this.accountCloseReasonCode = accountCloseReasonCode;
    }

    public String getOverdraftItemsTodayNumber() {
        return overdraftItemsTodayNumber;
    }

    public void setOverdraftItemsTodayNumber(String overdraftItemsTodayNumber) {
        this.overdraftItemsTodayNumber = overdraftItemsTodayNumber;
    }

    public String getReturnedChecksTodayNumber() {
        return returnedChecksTodayNumber;
    }

    public void setReturnedChecksTodayNumber(String returnedChecksTodayNumber) {
        this.returnedChecksTodayNumber = returnedChecksTodayNumber;
    }

    public String getTimesOverdrawnCount() {
        return timesOverdrawnCount;
    }

    public void setTimesOverdrawnCount(String timesOverdrawnCount) {
        this.timesOverdrawnCount = timesOverdrawnCount;
    }

    public String getTimesNonSufficientFundsCount() {
        return timesNonSufficientFundsCount;
    }

    public void setTimesNonSufficientFundsCount(String timesNonSufficientFundsCount) {
        this.timesNonSufficientFundsCount = timesNonSufficientFundsCount;
    }

    public String getReturnedCheckChargesWaivedAmount() {
        return returnedCheckChargesWaivedAmount;
    }

    public void setReturnedCheckChargesWaivedAmount(String returnedCheckChargesWaivedAmount) {
        this.returnedCheckChargesWaivedAmount = returnedCheckChargesWaivedAmount;
    }

    public String getOverdraftChargesWaivedAmount() {
        return overdraftChargesWaivedAmount;
    }

    public void setOverdraftChargesWaivedAmount(String overdraftChargesWaivedAmount) {
        this.overdraftChargesWaivedAmount = overdraftChargesWaivedAmount;
    }

    public String getFundsOwnershipCode() {
        return fundsOwnershipCode;
    }

    public void setFundsOwnershipCode(String fundsOwnershipCode) {
        this.fundsOwnershipCode = fundsOwnershipCode;
    }

    public String getStatementCycleCode() {
        return statementCycleCode;
    }

    public void setStatementCycleCode(String statementCycleCode) {
        this.statementCycleCode = statementCycleCode;
    }

    public String getLastDepositAmount() {
        return lastDepositAmount;
    }

    public void setLastDepositAmount(String lastDepositAmount) {
        this.lastDepositAmount = lastDepositAmount;
    }

    public String getACHCreditsNumber() {
        return aCHCreditsNumber;
    }

    public void setACHCreditsNumber(String aCHCreditsNumber) {
        this.aCHCreditsNumber = aCHCreditsNumber;
    }

    public String getLastInterestPaymentDate() {
        return lastInterestPaymentDate;
    }

    public void setLastInterestPaymentDate(String lastInterestPaymentDate) {
        this.lastInterestPaymentDate = lastInterestPaymentDate;
    }

    public String getCurrentCycleInterestAccruedAmount() {
        return currentCycleInterestAccruedAmount;
    }

    public void setCurrentCycleInterestAccruedAmount(String currentCycleInterestAccruedAmount) {
        this.currentCycleInterestAccruedAmount = currentCycleInterestAccruedAmount;
    }

    public String getBalanceLastStatementAmount() {
        return balanceLastStatementAmount;
    }

    public void setBalanceLastStatementAmount(String balanceLastStatementAmount) {
        this.balanceLastStatementAmount = balanceLastStatementAmount;
    }

    public String getLastStatementDate() {
        return lastStatementDate;
    }

    public void setLastStatementDate(String lastStatementDate) {
        this.lastStatementDate = lastStatementDate;
    }

    public String getBonusInterestDataPresentCode() {
        return bonusInterestDataPresentCode;
    }

    public void setBonusInterestDataPresentCode(String bonusInterestDataPresentCode) {
        this.bonusInterestDataPresentCode = bonusInterestDataPresentCode;
    }

    public String getEffectiveDatedOverdraftLimitsCode() {
        return effectiveDatedOverdraftLimitsCode;
    }

    public void setEffectiveDatedOverdraftLimitsCode(String effectiveDatedOverdraftLimitsCode) {
        this.effectiveDatedOverdraftLimitsCode = effectiveDatedOverdraftLimitsCode;
    }

    public String getDailyBalanceSelectCode() {
        return dailyBalanceSelectCode;
    }

    public void setDailyBalanceSelectCode(String dailyBalanceSelectCode) {
        this.dailyBalanceSelectCode = dailyBalanceSelectCode;
    }

    public String getSignaturesRequiredNumber() {
        return signaturesRequiredNumber;
    }

    public void setSignaturesRequiredNumber(String signaturesRequiredNumber) {
        this.signaturesRequiredNumber = signaturesRequiredNumber;
    }

    public String getSafeKeepingFlagCode() {
        return safeKeepingFlagCode;
    }

    public void setSafeKeepingFlagCode(String safeKeepingFlagCode) {
        this.safeKeepingFlagCode = safeKeepingFlagCode;
    }

    public String getLargeItemMonitorCode() {
        return largeItemMonitorCode;
    }

    public void setLargeItemMonitorCode(String largeItemMonitorCode) {
        this.largeItemMonitorCode = largeItemMonitorCode;
    }

    public String getSignificantBalanceChangeCode() {
        return significantBalanceChangeCode;
    }

    public void setSignificantBalanceChangeCode(String significantBalanceChangeCode) {
        this.significantBalanceChangeCode = significantBalanceChangeCode;
    }

    public String getCreditLineAmount() {
        return creditLineAmount;
    }

    public void setCreditLineAmount(String creditLineAmount) {
        this.creditLineAmount = creditLineAmount;
    }

    public USTaxIdentification getUSTaxIdentification() {
        return uSTaxIdentification;
    }

    public void setUSTaxIdentification(USTaxIdentification uSTaxIdentification) {
        this.uSTaxIdentification = uSTaxIdentification;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getOfficerTelephoneNumber1() {
        return officerTelephoneNumber1;
    }

    public void setOfficerTelephoneNumber1(String officerTelephoneNumber1) {
        this.officerTelephoneNumber1 = officerTelephoneNumber1;
    }

    public String getOfficerName1() {
        return officerName1;
    }

    public void setOfficerName1(String officerName1) {
        this.officerName1 = officerName1;
    }

    public String getOfficerCode1() {
        return officerCode1;
    }

    public void setOfficerCode1(String officerCode1) {
        this.officerCode1 = officerCode1;
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    public Dates getDates() {
        return dates;
    }

    public void setDates(Dates dates) {
        this.dates = dates;
    }

}
