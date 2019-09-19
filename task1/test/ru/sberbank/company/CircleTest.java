package ru.sberbank.company;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Math.PI;

public class CircleTest {
    private static final double DELTA = 1e-15;
    @Test
    public void testGetSquare() {
        Shape circle = new Circle(1.);
        Assert.assertEquals(circle.getSquare(), PI, DELTA);
    }
}