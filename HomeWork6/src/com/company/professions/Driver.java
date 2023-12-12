package com.company.professions;

public class Driver {

    private String fullName;
    private int driveExp;

    public Driver(String fullName, int driveExp) {
        this.fullName = fullName;
        this.driveExp = driveExp;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDriveExp() {
        return driveExp;
    }

    public void setDriveExp(int driveExp) {
        this.driveExp = driveExp;
    }
}
