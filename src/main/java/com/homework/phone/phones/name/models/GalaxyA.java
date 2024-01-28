package com.homework.phone.phones.name.models;
import com.homework.phone.enums.NamePhone;
import com.homework.phone.phones.name.Samsung;

public class GalaxyA extends Samsung {


    public GalaxyA(int id, String model, String color, int RAM, int camera, boolean usability) {
        super(id, model, color, RAM, camera, usability);
        name = NamePhone.GalaxyA;
    }

    @Override
    public String toString() {
        return "GalaxyA{" +
                "name=" + name +
                "} " + super.toString();
    }
}
