
package com.aarpcare.aarpcare.services.usbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

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

    public AccountDetail withBankSpecific(BankSpecific bankSpecific) {
        this.bankSpecific = bankSpecific;
        return this;
    }

    public OfficerAndProcessData getOfficerAndProcessData() {
        return officerAndProcessData;
    }

    public void setOfficerAndProcessData(OfficerAndProcessData officerAndProcessData) {
        this.officerAndProcessData = officerAndProcessData;
    }

    public AccountDetail withOfficerAndProcessData(OfficerAndProcessData officerAndProcessData) {
        this.officerAndProcessData = officerAndProcessData;
        return this;
    }

    public String getOverDraftProtectionTotalNumber() {
        return overDraftProtectionTotalNumber;
    }

    public void setOverDraftProtectionTotalNumber(String overDraftProtectionTotalNumber) {
        this.overDraftProtectionTotalNumber = overDraftProtectionTotalNumber;
    }

    public AccountDetail withOverDraftProtectionTotalNumber(String overDraftProtectionTotalNumber) {
        this.overDraftProtectionTotalNumber = overDraftProtectionTotalNumber;
        return this;
    }

    public String getWithholdingDescription() {
        return withholdingDescription;
    }

    public void setWithholdingDescription(String withholdingDescription) {
        this.withholdingDescription = withholdingDescription;
    }

    public AccountDetail withWithholdingDescription(String withholdingDescription) {
        this.withholdingDescription = withholdingDescription;
        return this;
    }

    public String getNetInterestRateNumber() {
        return netInterestRateNumber;
    }

    public void setNetInterestRateNumber(String netInterestRateNumber) {
        this.netInterestRateNumber = netInterestRateNumber;
    }

    public AccountDetail withNetInterestRateNumber(String netInterestRateNumber) {
        this.netInterestRateNumber = netInterestRateNumber;
        return this;
    }

    public String getDDAFundedCode() {
        return dDAFundedCode;
    }

    public void setDDAFundedCode(String dDAFundedCode) {
        this.dDAFundedCode = dDAFundedCode;
    }

    public AccountDetail withDDAFundedCode(String dDAFundedCode) {
        this.dDAFundedCode = dDAFundedCode;
        return this;
    }

    public String getStatementTypeCode() {
        return statementTypeCode;
    }

    public void setStatementTypeCode(String statementTypeCode) {
        this.statementTypeCode = statementTypeCode;
    }

    public AccountDetail withStatementTypeCode(String statementTypeCode) {
        this.statementTypeCode = statementTypeCode;
        return this;
    }

    public String getBonusInterestRateNumber() {
        return bonusInterestRateNumber;
    }

    public void setBonusInterestRateNumber(String bonusInterestRateNumber) {
        this.bonusInterestRateNumber = bonusInterestRateNumber;
    }

    public AccountDetail withBonusInterestRateNumber(String bonusInterestRateNumber) {
        this.bonusInterestRateNumber = bonusInterestRateNumber;
        return this;
    }

    public String getUBankAtWorkCompanyIdentifier() {
        return uBankAtWorkCompanyIdentifier;
    }

    public void setUBankAtWorkCompanyIdentifier(String uBankAtWorkCompanyIdentifier) {
        this.uBankAtWorkCompanyIdentifier = uBankAtWorkCompanyIdentifier;
    }

    public AccountDetail withUBankAtWorkCompanyIdentifier(String uBankAtWorkCompanyIdentifier) {
        this.uBankAtWorkCompanyIdentifier = uBankAtWorkCompanyIdentifier;
        return this;
    }

    public String getLineOfCreditDummyDDACode() {
        return lineOfCreditDummyDDACode;
    }

    public void setLineOfCreditDummyDDACode(String lineOfCreditDummyDDACode) {
        this.lineOfCreditDummyDDACode = lineOfCreditDummyDDACode;
    }

    public AccountDetail withLineOfCreditDummyDDACode(String lineOfCreditDummyDDACode) {
        this.lineOfCreditDummyDDACode = lineOfCreditDummyDDACode;
        return this;
    }

    public String getBalanceLevelNumber() {
        return balanceLevelNumber;
    }

    public void setBalanceLevelNumber(String balanceLevelNumber) {
        this.balanceLevelNumber = balanceLevelNumber;
    }

    public AccountDetail withBalanceLevelNumber(String balanceLevelNumber) {
        this.balanceLevelNumber = balanceLevelNumber;
        return this;
    }

    public String getOverdraftItemsInOTPNumber() {
        return overdraftItemsInOTPNumber;
    }

    public void setOverdraftItemsInOTPNumber(String overdraftItemsInOTPNumber) {
        this.overdraftItemsInOTPNumber = overdraftItemsInOTPNumber;
    }

    public AccountDetail withOverdraftItemsInOTPNumber(String overdraftItemsInOTPNumber) {
        this.overdraftItemsInOTPNumber = overdraftItemsInOTPNumber;
        return this;
    }

    public String getStatementGroupIdentifier() {
        return statementGroupIdentifier;
    }

    public void setStatementGroupIdentifier(String statementGroupIdentifier) {
        this.statementGroupIdentifier = statementGroupIdentifier;
    }

    public AccountDetail withStatementGroupIdentifier(String statementGroupIdentifier) {
        this.statementGroupIdentifier = statementGroupIdentifier;
        return this;
    }

    public String getZeroBalanceMasterAccountNumber() {
        return zeroBalanceMasterAccountNumber;
    }

    public void setZeroBalanceMasterAccountNumber(String zeroBalanceMasterAccountNumber) {
        this.zeroBalanceMasterAccountNumber = zeroBalanceMasterAccountNumber;
    }

    public AccountDetail withZeroBalanceMasterAccountNumber(String zeroBalanceMasterAccountNumber) {
        this.zeroBalanceMasterAccountNumber = zeroBalanceMasterAccountNumber;
        return this;
    }

    public String getOverdraftCollectedBalanceToleranceAmount() {
        return overdraftCollectedBalanceToleranceAmount;
    }

    public void setOverdraftCollectedBalanceToleranceAmount(String overdraftCollectedBalanceToleranceAmount) {
        this.overdraftCollectedBalanceToleranceAmount = overdraftCollectedBalanceToleranceAmount;
    }

    public AccountDetail withOverdraftCollectedBalanceToleranceAmount(String overdraftCollectedBalanceToleranceAmount) {
        this.overdraftCollectedBalanceToleranceAmount = overdraftCollectedBalanceToleranceAmount;
        return this;
    }

    public String getOverdraftLedgerBalanceToleranceAmount() {
        return overdraftLedgerBalanceToleranceAmount;
    }

    public void setOverdraftLedgerBalanceToleranceAmount(String overdraftLedgerBalanceToleranceAmount) {
        this.overdraftLedgerBalanceToleranceAmount = overdraftLedgerBalanceToleranceAmount;
    }

    public AccountDetail withOverdraftLedgerBalanceToleranceAmount(String overdraftLedgerBalanceToleranceAmount) {
        this.overdraftLedgerBalanceToleranceAmount = overdraftLedgerBalanceToleranceAmount;
        return this;
    }

    public String getGenerateNonSufficientFundsOverdraftNoticeCode() {
        return generateNonSufficientFundsOverdraftNoticeCode;
    }

    public void setGenerateNonSufficientFundsOverdraftNoticeCode(String generateNonSufficientFundsOverdraftNoticeCode) {
        this.generateNonSufficientFundsOverdraftNoticeCode = generateNonSufficientFundsOverdraftNoticeCode;
    }

    public AccountDetail withGenerateNonSufficientFundsOverdraftNoticeCode(String generateNonSufficientFundsOverdraftNoticeCode) {
        this.generateNonSufficientFundsOverdraftNoticeCode = generateNonSufficientFundsOverdraftNoticeCode;
        return this;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public AccountDetail withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    public String getCalculatedInterestRateNumber() {
        return calculatedInterestRateNumber;
    }

    public void setCalculatedInterestRateNumber(String calculatedInterestRateNumber) {
        this.calculatedInterestRateNumber = calculatedInterestRateNumber;
    }

    public AccountDetail withCalculatedInterestRateNumber(String calculatedInterestRateNumber) {
        this.calculatedInterestRateNumber = calculatedInterestRateNumber;
        return this;
    }

    public String getWithholdingCode() {
        return withholdingCode;
    }

    public void setWithholdingCode(String withholdingCode) {
        this.withholdingCode = withholdingCode;
    }

    public AccountDetail withWithholdingCode(String withholdingCode) {
        this.withholdingCode = withholdingCode;
        return this;
    }

    public String getCurrentYearInterestPaidAmount() {
        return currentYearInterestPaidAmount;
    }

    public void setCurrentYearInterestPaidAmount(String currentYearInterestPaidAmount) {
        this.currentYearInterestPaidAmount = currentYearInterestPaidAmount;
    }

    public AccountDetail withCurrentYearInterestPaidAmount(String currentYearInterestPaidAmount) {
        this.currentYearInterestPaidAmount = currentYearInterestPaidAmount;
        return this;
    }

    public String getPriorYearInterestPaidAmount() {
        return priorYearInterestPaidAmount;
    }

    public void setPriorYearInterestPaidAmount(String priorYearInterestPaidAmount) {
        this.priorYearInterestPaidAmount = priorYearInterestPaidAmount;
    }

    public AccountDetail withPriorYearInterestPaidAmount(String priorYearInterestPaidAmount) {
        this.priorYearInterestPaidAmount = priorYearInterestPaidAmount;
        return this;
    }

    public String getPriorCycleInterestPaidAmount() {
        return priorCycleInterestPaidAmount;
    }

    public void setPriorCycleInterestPaidAmount(String priorCycleInterestPaidAmount) {
        this.priorCycleInterestPaidAmount = priorCycleInterestPaidAmount;
    }

    public AccountDetail withPriorCycleInterestPaidAmount(String priorCycleInterestPaidAmount) {
        this.priorCycleInterestPaidAmount = priorCycleInterestPaidAmount;
        return this;
    }

    public String getAccountCloseReasonCode() {
        return accountCloseReasonCode;
    }

    public void setAccountCloseReasonCode(String accountCloseReasonCode) {
        this.accountCloseReasonCode = accountCloseReasonCode;
    }

    public AccountDetail withAccountCloseReasonCode(String accountCloseReasonCode) {
        this.accountCloseReasonCode = accountCloseReasonCode;
        return this;
    }

    public String getOverdraftItemsTodayNumber() {
        return overdraftItemsTodayNumber;
    }

    public void setOverdraftItemsTodayNumber(String overdraftItemsTodayNumber) {
        this.overdraftItemsTodayNumber = overdraftItemsTodayNumber;
    }

    public AccountDetail withOverdraftItemsTodayNumber(String overdraftItemsTodayNumber) {
        this.overdraftItemsTodayNumber = overdraftItemsTodayNumber;
        return this;
    }

    public String getReturnedChecksTodayNumber() {
        return returnedChecksTodayNumber;
    }

    public void setReturnedChecksTodayNumber(String returnedChecksTodayNumber) {
        this.returnedChecksTodayNumber = returnedChecksTodayNumber;
    }

    public AccountDetail withReturnedChecksTodayNumber(String returnedChecksTodayNumber) {
        this.returnedChecksTodayNumber = returnedChecksTodayNumber;
        return this;
    }

    public String getTimesOverdrawnCount() {
        return timesOverdrawnCount;
    }

    public void setTimesOverdrawnCount(String timesOverdrawnCount) {
        this.timesOverdrawnCount = timesOverdrawnCount;
    }

    public AccountDetail withTimesOverdrawnCount(String timesOverdrawnCount) {
        this.timesOverdrawnCount = timesOverdrawnCount;
        return this;
    }

    public String getTimesNonSufficientFundsCount() {
        return timesNonSufficientFundsCount;
    }

    public void setTimesNonSufficientFundsCount(String timesNonSufficientFundsCount) {
        this.timesNonSufficientFundsCount = timesNonSufficientFundsCount;
    }

    public AccountDetail withTimesNonSufficientFundsCount(String timesNonSufficientFundsCount) {
        this.timesNonSufficientFundsCount = timesNonSufficientFundsCount;
        return this;
    }

    public String getReturnedCheckChargesWaivedAmount() {
        return returnedCheckChargesWaivedAmount;
    }

    public void setReturnedCheckChargesWaivedAmount(String returnedCheckChargesWaivedAmount) {
        this.returnedCheckChargesWaivedAmount = returnedCheckChargesWaivedAmount;
    }

    public AccountDetail withReturnedCheckChargesWaivedAmount(String returnedCheckChargesWaivedAmount) {
        this.returnedCheckChargesWaivedAmount = returnedCheckChargesWaivedAmount;
        return this;
    }

    public String getOverdraftChargesWaivedAmount() {
        return overdraftChargesWaivedAmount;
    }

    public void setOverdraftChargesWaivedAmount(String overdraftChargesWaivedAmount) {
        this.overdraftChargesWaivedAmount = overdraftChargesWaivedAmount;
    }

    public AccountDetail withOverdraftChargesWaivedAmount(String overdraftChargesWaivedAmount) {
        this.overdraftChargesWaivedAmount = overdraftChargesWaivedAmount;
        return this;
    }

    public String getFundsOwnershipCode() {
        return fundsOwnershipCode;
    }

    public void setFundsOwnershipCode(String fundsOwnershipCode) {
        this.fundsOwnershipCode = fundsOwnershipCode;
    }

    public AccountDetail withFundsOwnershipCode(String fundsOwnershipCode) {
        this.fundsOwnershipCode = fundsOwnershipCode;
        return this;
    }

    public String getStatementCycleCode() {
        return statementCycleCode;
    }

    public void setStatementCycleCode(String statementCycleCode) {
        this.statementCycleCode = statementCycleCode;
    }

    public AccountDetail withStatementCycleCode(String statementCycleCode) {
        this.statementCycleCode = statementCycleCode;
        return this;
    }

    public String getLastDepositAmount() {
        return lastDepositAmount;
    }

    public void setLastDepositAmount(String lastDepositAmount) {
        this.lastDepositAmount = lastDepositAmount;
    }

    public AccountDetail withLastDepositAmount(String lastDepositAmount) {
        this.lastDepositAmount = lastDepositAmount;
        return this;
    }

    public String getACHCreditsNumber() {
        return aCHCreditsNumber;
    }

    public void setACHCreditsNumber(String aCHCreditsNumber) {
        this.aCHCreditsNumber = aCHCreditsNumber;
    }

    public AccountDetail withACHCreditsNumber(String aCHCreditsNumber) {
        this.aCHCreditsNumber = aCHCreditsNumber;
        return this;
    }

    public String getLastInterestPaymentDate() {
        return lastInterestPaymentDate;
    }

    public void setLastInterestPaymentDate(String lastInterestPaymentDate) {
        this.lastInterestPaymentDate = lastInterestPaymentDate;
    }

    public AccountDetail withLastInterestPaymentDate(String lastInterestPaymentDate) {
        this.lastInterestPaymentDate = lastInterestPaymentDate;
        return this;
    }

    public String getCurrentCycleInterestAccruedAmount() {
        return currentCycleInterestAccruedAmount;
    }

    public void setCurrentCycleInterestAccruedAmount(String currentCycleInterestAccruedAmount) {
        this.currentCycleInterestAccruedAmount = currentCycleInterestAccruedAmount;
    }

    public AccountDetail withCurrentCycleInterestAccruedAmount(String currentCycleInterestAccruedAmount) {
        this.currentCycleInterestAccruedAmount = currentCycleInterestAccruedAmount;
        return this;
    }

    public String getBalanceLastStatementAmount() {
        return balanceLastStatementAmount;
    }

    public void setBalanceLastStatementAmount(String balanceLastStatementAmount) {
        this.balanceLastStatementAmount = balanceLastStatementAmount;
    }

    public AccountDetail withBalanceLastStatementAmount(String balanceLastStatementAmount) {
        this.balanceLastStatementAmount = balanceLastStatementAmount;
        return this;
    }

    public String getLastStatementDate() {
        return lastStatementDate;
    }

    public void setLastStatementDate(String lastStatementDate) {
        this.lastStatementDate = lastStatementDate;
    }

    public AccountDetail withLastStatementDate(String lastStatementDate) {
        this.lastStatementDate = lastStatementDate;
        return this;
    }

    public String getBonusInterestDataPresentCode() {
        return bonusInterestDataPresentCode;
    }

    public void setBonusInterestDataPresentCode(String bonusInterestDataPresentCode) {
        this.bonusInterestDataPresentCode = bonusInterestDataPresentCode;
    }

    public AccountDetail withBonusInterestDataPresentCode(String bonusInterestDataPresentCode) {
        this.bonusInterestDataPresentCode = bonusInterestDataPresentCode;
        return this;
    }

    public String getEffectiveDatedOverdraftLimitsCode() {
        return effectiveDatedOverdraftLimitsCode;
    }

    public void setEffectiveDatedOverdraftLimitsCode(String effectiveDatedOverdraftLimitsCode) {
        this.effectiveDatedOverdraftLimitsCode = effectiveDatedOverdraftLimitsCode;
    }

    public AccountDetail withEffectiveDatedOverdraftLimitsCode(String effectiveDatedOverdraftLimitsCode) {
        this.effectiveDatedOverdraftLimitsCode = effectiveDatedOverdraftLimitsCode;
        return this;
    }

    public String getDailyBalanceSelectCode() {
        return dailyBalanceSelectCode;
    }

    public void setDailyBalanceSelectCode(String dailyBalanceSelectCode) {
        this.dailyBalanceSelectCode = dailyBalanceSelectCode;
    }

    public AccountDetail withDailyBalanceSelectCode(String dailyBalanceSelectCode) {
        this.dailyBalanceSelectCode = dailyBalanceSelectCode;
        return this;
    }

    public String getSignaturesRequiredNumber() {
        return signaturesRequiredNumber;
    }

    public void setSignaturesRequiredNumber(String signaturesRequiredNumber) {
        this.signaturesRequiredNumber = signaturesRequiredNumber;
    }

    public AccountDetail withSignaturesRequiredNumber(String signaturesRequiredNumber) {
        this.signaturesRequiredNumber = signaturesRequiredNumber;
        return this;
    }

    public String getSafeKeepingFlagCode() {
        return safeKeepingFlagCode;
    }

    public void setSafeKeepingFlagCode(String safeKeepingFlagCode) {
        this.safeKeepingFlagCode = safeKeepingFlagCode;
    }

    public AccountDetail withSafeKeepingFlagCode(String safeKeepingFlagCode) {
        this.safeKeepingFlagCode = safeKeepingFlagCode;
        return this;
    }

    public String getLargeItemMonitorCode() {
        return largeItemMonitorCode;
    }

    public void setLargeItemMonitorCode(String largeItemMonitorCode) {
        this.largeItemMonitorCode = largeItemMonitorCode;
    }

    public AccountDetail withLargeItemMonitorCode(String largeItemMonitorCode) {
        this.largeItemMonitorCode = largeItemMonitorCode;
        return this;
    }

    public String getSignificantBalanceChangeCode() {
        return significantBalanceChangeCode;
    }

    public void setSignificantBalanceChangeCode(String significantBalanceChangeCode) {
        this.significantBalanceChangeCode = significantBalanceChangeCode;
    }

    public AccountDetail withSignificantBalanceChangeCode(String significantBalanceChangeCode) {
        this.significantBalanceChangeCode = significantBalanceChangeCode;
        return this;
    }

    public String getCreditLineAmount() {
        return creditLineAmount;
    }

    public void setCreditLineAmount(String creditLineAmount) {
        this.creditLineAmount = creditLineAmount;
    }

    public AccountDetail withCreditLineAmount(String creditLineAmount) {
        this.creditLineAmount = creditLineAmount;
        return this;
    }

    public USTaxIdentification getUSTaxIdentification() {
        return uSTaxIdentification;
    }

    public void setUSTaxIdentification(USTaxIdentification uSTaxIdentification) {
        this.uSTaxIdentification = uSTaxIdentification;
    }

    public AccountDetail withUSTaxIdentification(USTaxIdentification uSTaxIdentification) {
        this.uSTaxIdentification = uSTaxIdentification;
        return this;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public AccountDetail withStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
        return this;
    }

    public String getOfficerTelephoneNumber1() {
        return officerTelephoneNumber1;
    }

    public void setOfficerTelephoneNumber1(String officerTelephoneNumber1) {
        this.officerTelephoneNumber1 = officerTelephoneNumber1;
    }

    public AccountDetail withOfficerTelephoneNumber1(String officerTelephoneNumber1) {
        this.officerTelephoneNumber1 = officerTelephoneNumber1;
        return this;
    }

    public String getOfficerName1() {
        return officerName1;
    }

    public void setOfficerName1(String officerName1) {
        this.officerName1 = officerName1;
    }

    public AccountDetail withOfficerName1(String officerName1) {
        this.officerName1 = officerName1;
        return this;
    }

    public String getOfficerCode1() {
        return officerCode1;
    }

    public void setOfficerCode1(String officerCode1) {
        this.officerCode1 = officerCode1;
    }

    public AccountDetail withOfficerCode1(String officerCode1) {
        this.officerCode1 = officerCode1;
        return this;
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    public AccountDetail withCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    public Dates getDates() {
        return dates;
    }

    public void setDates(Dates dates) {
        this.dates = dates;
    }

    public AccountDetail withDates(Dates dates) {
        this.dates = dates;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bankSpecific", bankSpecific).append("officerAndProcessData", officerAndProcessData).append("overDraftProtectionTotalNumber", overDraftProtectionTotalNumber).append("withholdingDescription", withholdingDescription).append("netInterestRateNumber", netInterestRateNumber).append("dDAFundedCode", dDAFundedCode).append("statementTypeCode", statementTypeCode).append("bonusInterestRateNumber", bonusInterestRateNumber).append("uBankAtWorkCompanyIdentifier", uBankAtWorkCompanyIdentifier).append("lineOfCreditDummyDDACode", lineOfCreditDummyDDACode).append("balanceLevelNumber", balanceLevelNumber).append("overdraftItemsInOTPNumber", overdraftItemsInOTPNumber).append("statementGroupIdentifier", statementGroupIdentifier).append("zeroBalanceMasterAccountNumber", zeroBalanceMasterAccountNumber).append("overdraftCollectedBalanceToleranceAmount", overdraftCollectedBalanceToleranceAmount).append("overdraftLedgerBalanceToleranceAmount", overdraftLedgerBalanceToleranceAmount).append("generateNonSufficientFundsOverdraftNoticeCode", generateNonSufficientFundsOverdraftNoticeCode).append("languageCode", languageCode).append("calculatedInterestRateNumber", calculatedInterestRateNumber).append("withholdingCode", withholdingCode).append("currentYearInterestPaidAmount", currentYearInterestPaidAmount).append("priorYearInterestPaidAmount", priorYearInterestPaidAmount).append("priorCycleInterestPaidAmount", priorCycleInterestPaidAmount).append("accountCloseReasonCode", accountCloseReasonCode).append("overdraftItemsTodayNumber", overdraftItemsTodayNumber).append("returnedChecksTodayNumber", returnedChecksTodayNumber).append("timesOverdrawnCount", timesOverdrawnCount).append("timesNonSufficientFundsCount", timesNonSufficientFundsCount).append("returnedCheckChargesWaivedAmount", returnedCheckChargesWaivedAmount).append("overdraftChargesWaivedAmount", overdraftChargesWaivedAmount).append("fundsOwnershipCode", fundsOwnershipCode).append("statementCycleCode", statementCycleCode).append("lastDepositAmount", lastDepositAmount).append("aCHCreditsNumber", aCHCreditsNumber).append("lastInterestPaymentDate", lastInterestPaymentDate).append("currentCycleInterestAccruedAmount", currentCycleInterestAccruedAmount).append("balanceLastStatementAmount", balanceLastStatementAmount).append("lastStatementDate", lastStatementDate).append("bonusInterestDataPresentCode", bonusInterestDataPresentCode).append("effectiveDatedOverdraftLimitsCode", effectiveDatedOverdraftLimitsCode).append("dailyBalanceSelectCode", dailyBalanceSelectCode).append("signaturesRequiredNumber", signaturesRequiredNumber).append("safeKeepingFlagCode", safeKeepingFlagCode).append("largeItemMonitorCode", largeItemMonitorCode).append("significantBalanceChangeCode", significantBalanceChangeCode).append("creditLineAmount", creditLineAmount).append("uSTaxIdentification", uSTaxIdentification).append("statusDescription", statusDescription).append("officerTelephoneNumber1", officerTelephoneNumber1).append("officerName1", officerName1).append("officerCode1", officerCode1).append("costCenter", costCenter).append("dates", dates).toString();
    }

}
