package ru.mipt.java.hw1;

/**
 * Created by User on 24.09.2017.
 */
public class Rectangle implements Shape {

    private double a;
    private  double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a*b;
    }
}
