package com.mykola.spring.robot;

import java.util.Random;

/**
 * Created by mtverdok on 4/10/2017.
 */
public class RandomText {
    private static String[] texts = {
            "I'll be back",
            "Get out",
            "I want your motorcycle",
            null
    };

    public String getText() {
        Random random = new Random();
        return texts[random.nextInt(texts.length)];
    }
}
