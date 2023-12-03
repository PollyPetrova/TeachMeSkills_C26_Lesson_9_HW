package com.teachmeskills.lesson_9.task_3.client;

public abstract class Address {

    private int postalCode;
    private String country;
    private String city;
    private int houseNum;

    public Address(int postalCode, String country, String city, int houseNum) {
        this.postalCode = postalCode;
        this.country = country;
        this.city = city;
        this.houseNum = houseNum;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }
}
