package com.git.explore.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;


public class RandomGenerationTest {

    @Test
    public void testRandomInt() {
        RandomGeneration randomGenerationTest = new RandomGeneration();
        assertThat(randomGenerationTest.randomInt(), is(notNullValue()));
    }

}
