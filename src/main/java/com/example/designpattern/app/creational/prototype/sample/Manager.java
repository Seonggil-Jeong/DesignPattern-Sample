package com.example.designpattern.app.creational.prototype.sample;

import java.util.HashMap;

/**
 * Product의 생성, 관리를 실행
 */
public class Manager {
    private final HashMap<String, Product> showcase = new HashMap<>();

    public void register(final String name, final Product product) {
        showcase.put(name, product);
    }

    public Product create(final String prototypeName) throws CloneNotSupportedException {
        Product product = showcase.get(prototypeName);

        return product.createClone();
    }
}
