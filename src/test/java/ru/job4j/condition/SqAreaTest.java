package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP123K6Square463() {
        double p = 12.3;
        double k = 6;
        double expected = 4.63;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP24K23Square575() {
        double p = 24;
        double k = 23;
        double expected = 5.75;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}