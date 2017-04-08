package com.mykola.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Person person = (Person) context.getBean("person");

//        System.out.println(person);

        Address address2 = (Address) context.getBean("address2");

        System.out.println(address2);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
