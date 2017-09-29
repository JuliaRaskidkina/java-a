package ru.mipt.java.hw1;

/**
 * Created by User on 24.09.2017.
 */
public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape square = new Square(7);
        Shape rectangle = new Rectangle(4, 7);

        System.out.println(circle.area());
        System.out.println(square.area());
        System.out.println(rectangle.area());

        System.out.println(Math.PI * 5 * 5);
        System.out.println(7 * 7);
        System.out.println(4 * 7);
    }
}
