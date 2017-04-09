package com.mykola.spring.fruits;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by M on 08.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("fruitsConfig.xml");

        FruitBasket basket = (FruitBasket) context.getBean("basket");

        System.out.println(basket);

    }
}
