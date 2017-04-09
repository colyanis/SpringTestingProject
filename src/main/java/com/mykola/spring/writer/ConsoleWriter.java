package com.mykola.spring.writer;

/**
 * Created by M on 08.04.2017.
 */
public class ConsoleWriter implements Writer {
    public void write(String text) {
        System.out.println(text);
    }
}
