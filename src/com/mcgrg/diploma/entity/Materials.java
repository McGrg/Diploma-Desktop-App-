package com.mcgrg.diploma.entity;

/**
 * Created by MSI GT70 on 18.02.2017.
 */
public class Materials extends DataBaseEntity{
    private int materialsId;
    private String materialsName;

    public int getMaterialsId() {
        return materialsId;
    }

    public void setMaterialsId(int materialsId) {
        this.materialsId = materialsId;
    }

    public String getMaterialsName() {
        return materialsName;
    }

    public void setMaterialsName(String materialsName) {
        this.materialsName = materialsName;
    }

    @Override
    public String toString() {
        return "ID: " + getMaterialsId() + " : " + getMaterialsName();
    }
}
