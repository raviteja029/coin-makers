
package com.aarpcare.aarpcare.services.usbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Dates {

    @SerializedName("LastMaintenanceDate")
    @Expose
    private String lastMaintenanceDate;
    @SerializedName("AccountOpenedDate")
    @Expose
    private String accountOpenedDate;

    public String getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    public void setLastMaintenanceDate(String lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    public Dates withLastMaintenanceDate(String lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
        return this;
    }

    public String getAccountOpenedDate() {
        return accountOpenedDate;
    }

    public void setAccountOpenedDate(String accountOpenedDate) {
        this.accountOpenedDate = accountOpenedDate;
    }

    public Dates withAccountOpenedDate(String accountOpenedDate) {
        this.accountOpenedDate = accountOpenedDate;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("lastMaintenanceDate", lastMaintenanceDate).append("accountOpenedDate", accountOpenedDate).toString();
    }

}
