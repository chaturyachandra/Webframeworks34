package com.example.day1_q4.model;

public class Address {
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDoorNo() {
        return DoorNo;
    }
    public void setDoorNo(int doorNo) {
        DoorNo = doorNo;
    }
    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public int getPincode() {
        return pincode;
    }
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    private String name;
    private int DoorNo;
    private String streetName;
    private int pincode;
    private String area;
    private String district;
    private String state;
    private String country;
    
}