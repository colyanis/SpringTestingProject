package com.mykola.spring.fruits;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by M on 08.04.2017.
 */
public class FruitBasket {
    private String name;
    private Map<String, String> fruits;

    public FruitBasket(String name, Map<String, String> fruits) {
        this.name = name;
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        return "FruitBasket{" +
                "name='" + name + '\'' +
                ", fruits=" + fruits +
                '}';
    }
}
