package com.example.designpattern.app.structural.bridge.model.valueobject;

public class GlassDoor extends Door {

    public GlassDoor() {
        super("Glass");
    }

    @Override
    public String operation() {
        return super.getDoorType();
    }
}
