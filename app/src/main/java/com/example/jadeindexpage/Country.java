package com.example.jadeindexpage;

public class Country {
    private String name;
    private String officeLocation;
    private int flagResourceId;

    public Country(String name, String officeLocation, int flagResourceId) {
        this.name = name;
        this.officeLocation = officeLocation;
        this.flagResourceId = flagResourceId;
    }

    public String getName() { return name; }
    public String getOfficeLocation() { return officeLocation; }
    public int getFlagResourceId() { return flagResourceId; }
} 