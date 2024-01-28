package com.homework.phone.phones.builders;

import com.homework.phone.phones.name.Iphone;

public class IphoneBuilder {
    private String os;
    private String type;
    private int size;
    private int price;
    private String color;
    private int version;

    public IphoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public IphoneBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public IphoneBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public IphoneBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public IphoneBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public IphoneBuilder setVersion(int version) {
        this.version = version;
        return this;
    }

/*    public Iphone createIphone() {
        return new Iphone(os, type, size, price, color, version);
    }*/
}