package com.mcgrg.diploma.entity;

/**
 * Created by MSI GT70 on 19.02.2017.
 */
public class Stock {
    private int stockId;
    private int stockMaterials;
    private float stockAmount;
    private float stockAmountNeed;
    private int stockSiteId;

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public int getStockMaterials() {
        return stockMaterials;
    }

    public void setStockMaterials(int stockMaterials) {
        this.stockMaterials = stockMaterials;
    }

    public float getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(float stockAmount) {
        this.stockAmount = stockAmount;
    }

    public float getStockAmountNeed() {
        return stockAmountNeed;
    }

    public void setStockAmountNeed(float stockAmountNeed) {
        this.stockAmountNeed = stockAmountNeed;
    }

    public int getStockSiteId() {
        return stockSiteId;
    }

    public void setStockSiteId(int stockSiteId) {
        this.stockSiteId = stockSiteId;
    }

    @Override
    public String toString() {
        return "ID: " + getStockId() + " : " +  getStockMaterials() + " " + getStockAmount() + " "
                + getStockAmountNeed() + " " + getStockSiteId();
    }
}
