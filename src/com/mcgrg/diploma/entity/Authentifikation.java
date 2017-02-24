package com.mcgrg.diploma.entity;

/**
 * Created by MSI GT70 on 22.02.2017.
 */
public class Authentifikation extends DataBaseEntity{
    private int authentifikation_id;
    private String authentifikation_name;
    private String authentifikation_password;

    public int getAuthentifikation_id() {
        return authentifikation_id;
    }

    public void setAuthentifikation_id(int authentifikation_id) {
        this.authentifikation_id = authentifikation_id;
    }

    public String getAuthentifikation_name() {
        return authentifikation_name;
    }

    public void setAuthentifikation_name(String authentifikation_name) {
        this.authentifikation_name = authentifikation_name;
    }

    public String getAuthentifikation_password() {
        return authentifikation_password;
    }

    public void setAuthentifikation_password(String authentifikation_password) {
        this.authentifikation_password = authentifikation_password;
    }

    @Override
    public String toString() {
        return "ID: " + getAuthentifikation_id() + " " +  getAuthentifikation_name() + " "
                + getAuthentifikation_password();
    }

}
