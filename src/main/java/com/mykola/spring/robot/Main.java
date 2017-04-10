package com.mykola.spring.robot;

import com.mykola.spring.writer.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mtverdok on 4/10/2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("robot.xml");
        Robot robot = (Robot) context.getBean("robot");

        robot.speak();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
