package com.mcgrg.diploma.entity;

/**
 * Created by MSI GT70 on 23.02.2017.
 */
public class Opertype extends DataBaseEntity {

    private int operTypeId;
    private int operTypeName;

    public int getOperTypeId() {
        return operTypeId;
    }

    public void setOperTypeId(int operTypeId) {
        this.operTypeId = operTypeId;
    }

    public int getOperTypeName() {
        return operTypeName;
    }

    public void setOperTypeName(int operTypeName) {
        this.operTypeName = operTypeName;
    }

    @Override
    public String toString() {
        return "ID: " + getOperTypeId() + " " + getOperTypeName();
    }

}
