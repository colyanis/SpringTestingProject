package com.mykola.spring.robot;

import com.mykola.spring.writer.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by mtverdok on 4/10/2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("robot.xml");
        OffersDAO offersDao = (OffersDAO) context.getBean("offersDao");

        try {
            List<Offer> offers = offersDao.getOffers();

            for(Offer offer : offers) {
                System.out.println(offer);
            }

        } catch (DataAccessException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }


        ((ClassPathXmlApplicationContext) context).close();
    }
}
