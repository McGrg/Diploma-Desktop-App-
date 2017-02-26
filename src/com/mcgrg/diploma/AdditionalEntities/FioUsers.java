package com.mcgrg.diploma.AdditionalEntities;

import com.mcgrg.diploma.entity.Users;

/**
 * Created by MSI GT70 on 22.02.2017.
 */
public class FioUsers extends Users {

    private String fio;

    public FioUsers(String surname, String name, String thirdname){
        if (thirdname.equals(null)) thirdname="";
        this.fio = surname + " " + name + " " + thirdname;
    }

    public FioUsers(){
        this("", "", "");
    }

    public String getFio() {
        return fio;
    }

    public void setFio() {
        if (this.getUserThirdname().equals(null)) this.setUserThirdname("");
        this.fio = this.getUserSurname() + " " + this.getUserName() + " " + this.getUserThirdname();
    }

    @Override
    public String toString() {
        return fio;
    }
}
