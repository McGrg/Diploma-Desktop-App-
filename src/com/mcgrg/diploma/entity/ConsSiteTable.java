package com.mcgrg.diploma.entity;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Created by MSI GT70 on 19.02.2017.
 */
public class ConsSiteTable {
    private final SimpleIntegerProperty conssiteId;
    private final SimpleStringProperty conssiteCity;
    private final SimpleStringProperty conssiteStreet;
    private final SimpleStringProperty conssiteBilding;
    private final SimpleStringProperty startDate;
    private final SimpleStringProperty finishDate;
    private final SimpleStringProperty manager;

    public int getConssiteId() {
        return conssiteId.get();
    }

    public void setConssiteId(int value) {
        conssiteId.set(value);
    }

    public SimpleIntegerProperty conssiteIdProperty() {
        return conssiteId;
    }

    public String getConssiteCity() {
        return conssiteCity.get();
    }

    public void setConssiteCity(String value) {
        conssiteCity.set(value);
    }

    public SimpleStringProperty conssiteCityProperty() {
        return conssiteCity;
    }

    public String getConssiteStreet() {
        return conssiteStreet.get();
    }

    public void setConssiteStreet(String value) {
        this.conssiteStreet.set(value);
    }

    public SimpleStringProperty conssiteStreetProperty() {
        return conssiteStreet;
    }

    public String getConssiteBilding() {
        return conssiteBilding.get();
    }

    public void setConssiteBilding(String value) {
        this.conssiteBilding.set(value);
    }

    public SimpleStringProperty conssiteBildingProperty() {
        return conssiteBilding;
    }

    public String getStartDate() {
        return startDate.get();
    }

    public void setStartDate(String value) {
        this.startDate.set(value);
    }

    public SimpleStringProperty conssiteStartDateProperty() {
        return startDate;
    }

    public String getFinishDate() {
        return finishDate.get();
    }

    public void setFinishDate(String value) {
        this.finishDate.set(value);
    }

    public SimpleStringProperty conssiteFinishDateProperty() {
        return finishDate;
    }

    public String getManager() {
        return manager.get();
    }

    public void setManager(String value) {
        this.manager.set(value);
    }

    public SimpleStringProperty conssiteManagerProperty() {
        return manager;
    }


    public ConsSiteTable(Integer conssiteId, String conssiteCity,
                             String conssiteStreet, String conssiteBilding,
                             String startDate, String finishDate,
                             String manager) {
        this.conssiteId = new SimpleIntegerProperty(conssiteId);
        this.conssiteCity = new SimpleStringProperty(conssiteCity);
        this.conssiteStreet = new SimpleStringProperty(conssiteStreet);
        this.conssiteBilding = new SimpleStringProperty(conssiteBilding);
        this.startDate = new SimpleStringProperty(startDate);
        this.finishDate = new SimpleStringProperty(finishDate);
        this.manager = new SimpleStringProperty(manager);
    }

}
