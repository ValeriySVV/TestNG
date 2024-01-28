package com.homework.phone;

public abstract class Phone  {

    private int id;

    private String model;

    private String color;
    private int RAM = 16;
    //private double diagonal;
    private int camera;
    private boolean usability = true;

    public Phone(int id, String model, String color, int RAM, int camera, boolean usability) {
        this.color = color;
        this.RAM = RAM;
        //this.diagonal = diagonal;
        this.camera = camera;
        this.usability = usability;
        this.model = model;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

/*    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }*/

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public boolean isUsability() {
        return usability;
    }

    public void setUsability(boolean usability) {
        this.usability = usability;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", RAM=" + RAM +
                ", camera=" + camera +
                ", usability=" + usability +
                '}';
    }

    public abstract void soundSms();
    public abstract void soundCall();


}




