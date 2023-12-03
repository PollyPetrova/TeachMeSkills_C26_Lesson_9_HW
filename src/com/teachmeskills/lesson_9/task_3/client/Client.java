package com.teachmeskills.lesson_9.task_3.client;

import com.teachmeskills.lesson_9.task_3.card.BaseCard;

public class Client extends Address {

    private String name;
    private String surname;
    private String passportNum;
    private String birthDay;
    private BaseCard[] baseCards;

    public Client(String name, String surname, String passportNum, String birthDay,
                  int postalCode, String country, String city, int houseNum) {
        super(postalCode, country, city, houseNum);
        this.name = name;
        this.surname = surname;
        this.passportNum = passportNum;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.out.println("Enter name!");
        } else {
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname==null){
            System.out.println("Enter surname!");
        } else {
            this.surname = surname;
        }
    }

    public String getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(String passportNum) {
        if (passportNum==null){
            System.out.println("Enter passport number!");
        } else {
            this.passportNum = passportNum;
        }
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
}
