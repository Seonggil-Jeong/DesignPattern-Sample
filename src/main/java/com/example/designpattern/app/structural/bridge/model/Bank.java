package com.example.designpattern.app.structural.bridge.model;


public class Bank implements Building {
    private Door door;

    public Bank(Door door) {
        this.door = door;
    }

    @Override
    public String build() {
        return "Bank is Build the Door is : [" + door.operation() + "]";
    }
}
