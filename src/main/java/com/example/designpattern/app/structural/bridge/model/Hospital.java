package com.example.designpattern.app.structural.bridge.model;

import com.example.designpattern.app.structural.bridge.model.valueobject.Door;

public class Hospital implements Building {
    private Door door ;

    public Hospital(Door door) {
        this.door = door;
    }

    public String build() {
        return "Hospital is Build the Door is : [" + door.operation() + "]";
    }
}
