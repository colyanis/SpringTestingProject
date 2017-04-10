package com.mykola.spring.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by mtverdok on 4/10/2017.
 */
@Component
public class Robot {
    private String id;
    private String speech;

    public void speak() {
        System.out.println(id + ": " + speech);
    }

    @Autowired
    public void setId(@Value("${jdbc.username}") String id) {
        this.id = id;
    }

    @Autowired
    public void setSpeech(@Value("${jdbc.password}") String speech) {
        this.speech = speech;
    }
}
