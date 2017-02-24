package com.mcgrg.diploma.entity;

/**
 * Created by MSI GT70 on 21.02.2017.
 */
public class Users  extends DataBaseEntity{

    private int userID;
    private String userName;
    private String userSurname;
    private String userThirdname;
    private String position;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserThirdname() {
        return userThirdname;
    }

    public void setUserThirdname(String userThirdname) {
        this.userThirdname = userThirdname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "ID: " + getUserID() + " " + getUserName() + " "
                + getUserSurname() + " " + getUserThirdname() + " "
                + getPosition();
    }
}
