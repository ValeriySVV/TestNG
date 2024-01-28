package com.homework.phone.phones.name.models;

import com.homework.phone.enums.NamePhone;
import com.homework.phone.phones.name.Samsung;

import java.util.StringJoiner;

public class GalaxyS extends Samsung {

    public GalaxyS(int id, String model, String color, int RAM, int camera, boolean usability) {
        super(id, model, color, RAM, camera, usability);
        name = NamePhone.GalaxyS;
    }

    @Override
    public String toString() {
        return "GalaxyS{" +
                "name=" + name +
                "} " + super.toString();
    }
}

