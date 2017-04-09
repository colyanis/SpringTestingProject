package com.mykola.spring.writer;

/**
 * Created by M on 08.04.2017.
 */
public class FileWriter implements Writer {
    public void write(String text) {
        System.out.println("Writing to file: " + text);
    }
}
