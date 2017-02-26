package com.mcgrg.diploma.AdditionalEntities;

import com.mcgrg.diploma.entity.Materials;

/**
 * Created by MSI GT70 on 26.02.2017.
 */
public class MaterialName extends Materials{
    private String name;

    public MaterialName(String name){
        this.name = name;
    }

    public MaterialName(){
        this("");
    }

    public String getMaterialName() {
        return name;
    }

    public void setMaterialName() {
        this.name = this.getMaterialsName();
    }

    @Override
    public String toString() {
        return name;
    }
}

