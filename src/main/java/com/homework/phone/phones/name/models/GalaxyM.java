package com.homework.phone.phones.name.models;

import com.homework.phone.enums.NamePhone;
import com.homework.phone.phones.name.Samsung;

public class GalaxyM extends Samsung {

    public GalaxyM(int id, String model, String color, int RAM, int camera, boolean usability) {
        super(id, model, color, RAM, camera, usability);
        name = NamePhone.GalaxyM;
    }

    @Override
    public String toString() {
        return "GalaxyM{" +
                "name=" + name +
                "} " + super.toString();
    }
}
