package com.example.designpattern.app.structural.bridge.model.valueobject;

public abstract class Door {
    private final String doorType;

    public Door(String doorType) {
        this.doorType = doorType;
    }

    public String getDoorType() {
        return this.doorType;
    }



    public abstract String operation();
}
