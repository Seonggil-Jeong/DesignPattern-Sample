package com.example.designpattern.app.creational.prototype.sample;

public class MessageBox implements Product {
    private char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    public void use(String s) {

        int length = s.getBytes().length;

        for (int i = 0; i < length + 2; i++) {
            System.out.print(decoChar);
        }

        System.out.println();
        System.out.println(decoChar + s + decoChar);

        for (int i = 0; i < length + 2; i++) {
            System.out.print(decoChar);
        }

        System.out.println();
    }

    public Product createClone() throws CloneNotSupportedException {
        final Product product = (Product) clone();
        return product;
    }
}
