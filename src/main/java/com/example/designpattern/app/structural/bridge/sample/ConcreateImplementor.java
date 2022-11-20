package com.example.designpattern.app.structural.bridge.sample;

/**
 * ConcreateImplementor
 * - 실제 기능 구현
 */
public class ConcreateImplementor implements Implementor {
    @Override
    public String operationImpl() {
        return "ConcreteImplementor is Created!";
    }
}
