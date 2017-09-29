package ru.mipt.java.hw1;

/**
 * Created by User on 24.09.2017.
 */
public class Circle implements Shape{

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI*r*r;
    }
}
