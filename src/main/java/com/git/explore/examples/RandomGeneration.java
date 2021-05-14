package com.git.explore.examples;

import java.util.Random;
import java.util.UUID;

public class RandomGeneration {

    public String random() {
        return UUID.randomUUID().toString();
    }

    public int randomInt() {
        return new Random().nextInt();
    }
}
