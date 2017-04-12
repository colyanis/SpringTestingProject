package com.mykola.spring.writer;

import org.springframework.stereotype.Component;

/**
 * Created by M on 08.04.2017.
 */
@Component
public class ConsoleWriter implements Writer {
    public void write(String text) {
        System.out.println(text);
    }
}
