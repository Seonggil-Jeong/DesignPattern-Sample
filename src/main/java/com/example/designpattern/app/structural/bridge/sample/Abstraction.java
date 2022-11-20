package com.example.designpattern.app.structural.bridge.sample;

/**
 * Abstract
 * - 기능 계층의 최상위 클래스
 * - 구현 부분에 해당하는 클래스를 인스턴스를 가지고 구현부 메서드를 호출한다
 */
public interface Abstraction {
    String operation();

}
