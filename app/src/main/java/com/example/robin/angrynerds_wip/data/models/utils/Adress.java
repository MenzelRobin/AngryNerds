package com.example.robin.angrynerds_wip.data.models.utils;

public class Adress {
    private String street;
    private int houseNumber;
    private String plz;
    private String city;


    public Adress() {
        this.street = "";
        this.houseNumber = 0;
        this.plz = "";
        this.city ="";
    }

    public Adress(String plz, String city) {
        this.plz = plz;
        this.city = city;
    }

    public Adress(String street, int houseNumber, String plz, String city) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.plz = plz;
        this.city = city;
    }

    //getter and setter

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
