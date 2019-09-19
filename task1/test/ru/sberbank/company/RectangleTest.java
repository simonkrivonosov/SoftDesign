package ru.sberbank.company;

import org.junit.Assert;
import org.junit.Test;


public class RectangleTest {
    private static final double DELTA = 1e-15;
    @Test
    public void testGetSquare() {
        Shape rectangle = new Rectangle(1, 2.);
        Assert.assertEquals(rectangle.getSquare(), 2., DELTA);
    }
}