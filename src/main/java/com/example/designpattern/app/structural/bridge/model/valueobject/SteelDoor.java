package com.example.designpattern.app.structural.bridge.model.valueobject;

public class SteelDoor extends Door {

    public SteelDoor() {
        super("Steel");
    }

    @Override
    public String operation() {
        return super.getDoorType() + security();
    }

    private String security() {
        return " [ it has Security ] ";

    }
}
