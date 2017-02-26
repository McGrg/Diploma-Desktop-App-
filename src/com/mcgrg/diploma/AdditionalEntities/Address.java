package com.mcgrg.diploma.AdditionalEntities;

import com.mcgrg.diploma.entity.ConstructionSite;

/**
 * Created by MSI GT70 on 26.02.2017.
 */
public class Address extends ConstructionSite {
    private String address;

    public Address(String city, String street, String bilding){
        this.address = "г. " + city + ", " + street + ", д." + bilding;
    }

    public Address(){
        this("", "", "");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = "г. " + this.getConssiteCity() + ", " + this.getConssiteStreet() + ", д." + this.getConssiteBilding();
    }

    @Override
    public String toString() {
        return address;
    }
}
