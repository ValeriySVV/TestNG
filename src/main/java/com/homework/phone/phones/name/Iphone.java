package com.homework.phone.phones.name;

import com.homework.phone.Phone;

public class Iphone extends Phone {

   private int version;
    private String color;

    public Iphone(int id, String model, String color, int RAM, double diagonal, int camera, boolean usability, int version, String color1) {
        super(id, model, color, RAM, camera, usability);
        this.version = version;
        this.color = color1;
    }

/*    public Iphone(String os, String type,int size, int price, String color, int version) {
        super(os, type, size, price);
        this.color = color;
        this.version = version;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }*/

    @Override
    public void soundSms() {
        System.out.println("Pin Pin");

    }

    @Override
    public void soundCall() {
        System.out.println("name.com.homework.phone.phones.Iphone Ring");

    }

    @Override
    public String toString() {
        return "Iphone{" +
                "version=" + version +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }


}

