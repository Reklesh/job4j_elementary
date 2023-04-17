package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when1010to1010then0() {
        int x1 = 10;
        int y1 = 10;
        int x2 = 10;
        int y2 = 10;
        double expected = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1010toMinus10Minus10then28Dot28() {
        int x1 = 10;
        int y1 = 10;
        int x2 = -10;
        int y2 = -10;
        double expected = 28.28;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when040toMinus200then44Dot72() {
        int x1 = 0;
        int y1 = 40;
        int x2 = -20;
        int y2 = 0;
        double expected = 44.72;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}