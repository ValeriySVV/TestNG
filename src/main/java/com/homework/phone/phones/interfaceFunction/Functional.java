package com.homework.phone.phones.interfaceFunction;

public interface Functional {

    boolean camera = true;

    boolean navigator = true;

    String weight = "Менше 1 кг";

    void security(String password);
    default void faceId(boolean faceId) {
        System.out.println("FaceId is " +  faceId);

    }

}
