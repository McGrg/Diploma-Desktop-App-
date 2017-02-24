package com.mcgrg.diploma.entity;

import java.util.Date;

/**
 * Created by MSI GT70 on 23.02.2017.
 */
public class Operations extends DataBaseEntity {
    private int operationsId;
    private int operationsType;
    private Date operationsDate;
    private int operationsSiteId;
    private int operationsMaterials;
    private float operationsMaterialsAmount;

    public int getOperationsId() {
        return operationsId;
    }

    public void setOperationsId(int operationsId) {
        this.operationsId = operationsId;
    }

    public int getOperationsType() {
        return operationsType;
    }

    public void setOperationsType(int operationsType) {
        this.operationsType = operationsType;
    }

    public Date getOperationsDate() {
        return operationsDate;
    }

    public void setOperationsDate(Date operationsDate) {
        this.operationsDate = operationsDate;
    }

    public int getOperationsSiteId() {
        return operationsSiteId;
    }

    public void setOperationsSiteId(int operationsSiteId) {
        this.operationsSiteId = operationsSiteId;
    }

    public int getOperationsMaterials() {
        return operationsMaterials;
    }

    public void setOperationsMaterials(int operationsMaterials) {
        this.operationsMaterials = operationsMaterials;
    }

    public float getOperationsMaterialsAmount() {
        return operationsMaterialsAmount;
    }

    public void setOperationsMaterialsAmount(float operationsMaterialsAmount) {
        this.operationsMaterialsAmount = operationsMaterialsAmount;
    }

    @Override
    public String toString() {
        return "ID: " + getOperationsId() + " " + getOperationsType() + " "
                + getOperationsDate().toString() + " " + getOperationsSiteId() + " "
                + getOperationsMaterials() + " " + getOperationsMaterialsAmount();
    }
}
