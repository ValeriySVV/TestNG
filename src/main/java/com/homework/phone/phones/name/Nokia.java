package com.homework.phone.phones.name;

import com.homework.phone.Phone;
import com.homework.phone.phones.interfaceFunction.Functional;

public class Nokia extends Phone implements Functional {

    private int year;

    public Nokia(int id, String model, String color, int RAM, double diagonal, int camera, boolean usability, int year) {
        super(id, model, color, RAM, camera, usability);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void soundSms() {

    }

    @Override
    public void soundCall() {

    }


    @Override
    public void security(String password) {
        System.out.println("name.com.homework.phone.phones.Nokia security is" + password);

    }

    @Override
    public void faceId(boolean faceId) {
        Functional.super.faceId(faceId);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Nokia{");
        sb.append("year=").append(year);
        sb.append('}');
        return sb.toString();
    }


}
