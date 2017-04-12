package com.mykola.spring.writer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by M on 08.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("other/writer.xml");
        Logger logger = (Logger) context.getBean("logger");

        logger.writeToConsole("Hi Console!");
        logger.writeToFile("Hi File!");

        ((ClassPathXmlApplicationContext) context).close();
    }
}
