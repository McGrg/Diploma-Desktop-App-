package com.mcgrg.diploma.entity;

/**
 * Created by MSI GT70 on 17.02.2017.
 */
public class Usergroups extends DataBaseEntity {

    private int usergroupId;
    private String usergroupName;

    public int getUsergroupId() {
        return usergroupId;
    }

    public void setUsergroupId(int usergroupId) {
        this.usergroupId = usergroupId;
    }

    public String getUsergroupName() {
        return usergroupName;
    }

    public void setUsergroupName(String usergroupName) {
        this.usergroupName = usergroupName;
    }

    @Override
    public String toString() {
        return "ID: " + getUsergroupId() + " : " +  getUsergroupName();
    }


}
