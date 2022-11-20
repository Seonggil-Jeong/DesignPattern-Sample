package com.example.designpattern.app.structural.bridge.sample;

/**
 * RefinedAbstract
 * - 기능 계층에서 새로운 부분을 확장한 클래스
 */

public class RefinedAbstraction implements Abstraction {
    private Implementor implementor;

    @Override
    public String operation() {
        return "RefinedAbstraction is Created! " + implementor.operationImpl();
    }

    public RefinedAbstraction(Implementor implementor) {
        this.implementor = implementor;
    }
}
