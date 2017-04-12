package com.mykola.spring.writer;

import com.sun.org.glassfish.gmbal.NameValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by M on 08.04.2017.
 */
@Component
public class Logger {
    private ConsoleWriter consoleWriter;
    private Writer fileWriter;


    @Autowired
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    @Autowired
    public void setFileWriter(Writer fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeToFile(String text) {
        fileWriter.write(text);
    }

    public void writeToConsole(String text) {
        consoleWriter.write(text);
    }
}
