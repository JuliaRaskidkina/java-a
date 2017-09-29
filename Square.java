package ru.mipt.java.hw1;

/**
 * Created by User on 24.09.2017.
 */
public class Square implements Shape {

    private double a;

    public  Square(double a) {

        this.a = a;
    }


    @Override
    public double area() {
//        return 0;
        return a*a;
    }

}
