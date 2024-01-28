package com.homework.phone.phones.name;

import com.homework.phone.Phone;

public class Huawei extends Phone {

    private String country;

    public Huawei(int id, String model, String color, int RAM, double diagonal, int camera, boolean usability, String country) {
        super(id, model, color, RAM, camera, usability);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void soundSms() {

    }

    @Override
    public void soundCall() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Huawei{");
        sb.append("country='").append(country).append('\'');
        sb.append('}');
        return sb.toString();
    }


}


