package com.mykola.spring.jungles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by M on 08.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jungleBeans.xml");

        Jungle jungle = (Jungle) context.getBean("jungle");

        System.out.println(jungle);
    }
}
