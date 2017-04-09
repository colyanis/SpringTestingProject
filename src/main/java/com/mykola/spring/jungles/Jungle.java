package com.mykola.spring.jungles;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by M on 08.04.2017.
 */
public class Jungle {
    private Map<String, String> food = new HashMap<String, String>();
    private Map<String, Animal> animals = new HashMap<>();

    public void setFood(Map<String, String> foods) {
        this.food = foods;
    }

    public void setAnimals(Map<String, Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Jungle{" +
                "food=" + food +
                ", animals=" + animals +
                '}';
    }
}
