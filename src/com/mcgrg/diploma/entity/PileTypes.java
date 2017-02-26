package com.mcgrg.diploma.entity;

/**
 * Created by MSI GT70 on 26.02.2017.
 */
public class PileTypes extends DataBaseEntity {
    private int pileTypesId;
    private String pileTypesName;
    private int pileTypesSiteId;
    private int pileTypesAmount;

    public int getPileTypesId() {
        return pileTypesId;
    }

    public void setPileTypesId(int pileTypesId) {
        this.pileTypesId = pileTypesId;
    }

    public String getPileTypesName() {
        return pileTypesName;
    }

    public void setPileTypesName(String pileTypesName) {
        this.pileTypesName = pileTypesName;
    }

    public int getPileTypesSiteId() {
        return pileTypesSiteId;
    }

    public void setPileTypesSiteId(int pileTypesSiteId) {
        this.pileTypesSiteId = pileTypesSiteId;
    }

    public int getPileTypesAmount() {
        return pileTypesAmount;
    }

    public void setPileTypesAmount(int pileTypesAmount) {
        this.pileTypesAmount = pileTypesAmount;
    }

    @Override
    public String toString() {
        return "ID: " + getPileTypesId() + " " +  getPileTypesName() + " " +  getPileTypesAmount() + " " +  getPileTypesSiteId();
    }
}
