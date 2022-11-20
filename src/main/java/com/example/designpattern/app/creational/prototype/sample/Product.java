package com.example.designpattern.app.creational.prototype.sample;


/**
 * 복제 메소드를 정의하는 인터페이스 java의 Cloneable 인터페이스를 상속
 */

public interface Product extends Cloneable {
    void use(final String s);

    Product createClone() throws CloneNotSupportedException;
}
