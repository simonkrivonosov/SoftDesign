package ru.sberbank.company;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    private static final double DELTA = 1e-15;
    @Test
    public void testGetSquare() {

        Shape square = new Square(2.);
        Assert.assertEquals(4., square.getSquare(), DELTA);
    }
}