package ru.sberbank.company;

public class Rectangle implements Shape {
    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getSquare() {
        return sideA * sideB;
    }
}
