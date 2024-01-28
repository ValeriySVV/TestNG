package com.homework.phone.phones.name.models;

import com.homework.phone.enums.NamePhone;
import com.homework.phone.phones.name.Samsung;

public class GalaxyFlip extends Samsung {

    public GalaxyFlip(int id, String model, String color, int RAM, int camera, boolean usability) {
        super(id, model, color, RAM, camera, usability);
        name = NamePhone.GalaxyFlip;
    }

    @Override
    public String toString() {
        return "GalaxyFlip{" +
                "name=" + name +
                "} " + super.toString();
    }
}
