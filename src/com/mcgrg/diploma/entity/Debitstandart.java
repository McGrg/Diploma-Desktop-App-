package com.mcgrg.diploma.entity;

/**
 * Created by MSI GT70 on 23.02.2017.
 */
public class Debitstandart  extends DataBaseEntity{
    private int debitStandartID;
    private int debitStandartSiteID;
    private int debitStandartMaterials;
    private float debitStandartValue;

    public int getDebitStandartID() {
        return debitStandartID;
    }

    public void setDebitStandartID(int debitStandartID) {
        this.debitStandartID = debitStandartID;
    }

    public int getDebitStandartSiteID() {
        return debitStandartSiteID;
    }

    public void setDebitStandartSiteID(int debitStandartSiteID) {
        this.debitStandartSiteID = debitStandartSiteID;
    }

    public int getDebitStandartMaterials() {
        return debitStandartMaterials;
    }

    public void setDebitStandartMaterials(int debitStandartMaterials) {
        this.debitStandartMaterials = debitStandartMaterials;
    }

    public float getDebitStandartValue() {
        return debitStandartValue;
    }

    public void setDebitStandartValue(float debitStandartValue) {
        this.debitStandartValue = debitStandartValue;
    }

    @Override
    public String toString() {
        return "ID: " +getDebitStandartID() + " " +  getDebitStandartSiteID() + " " +
                getDebitStandartMaterials() + " " + getDebitStandartValue();
    }

}
