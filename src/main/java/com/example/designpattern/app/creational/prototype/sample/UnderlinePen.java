package com.example.designpattern.app.creational.prototype.sample;


/**
 * Product 인터페이스를 구현하는 클래스입니다. 해당 클래스는 '문자에 밑줄을 긋는' 클래스
 */
public class UnderlinePen implements Product {
    private char underlineChar;


    public UnderlinePen(char underlineChar) {
        this.underlineChar = underlineChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;


        System.out.println(s);
        for (int i = 0; i < length; i++) {
            System.out.print(underlineChar);
        }

        System.out.println();
    }

    @Override
    public Product createClone() throws CloneNotSupportedException {
        final Product product = (Product) clone();
        return product;
    }
}
