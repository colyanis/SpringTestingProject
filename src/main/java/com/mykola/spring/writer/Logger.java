package com.mykola.spring.writer;

import com.sun.xml.internal.org.jvnet.fastinfoset.stax.LowLevelFastInfosetStreamWriter;

/**
 * Created by M on 08.04.2017.
 */
public class Logger {
    private ConsoleWriter consoleWriter;
    private FileWriter fileWriter;

    public Logger() {

    }

    public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
        this.consoleWriter = consoleWriter;
        this.fileWriter = fileWriter;
    }

    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeToFile(String text) {
        fileWriter.write(text);
    }

    public void writeToConsole(String text) {
        consoleWriter.write(text);
    }
}
