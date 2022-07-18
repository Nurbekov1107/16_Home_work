package com.company;

public class Circle {
    private static final double pi = 3.14d;
    private static double radius;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else System.out.println("Radius tuure emes jazyldy");
    }

    static void area() {
        System.out.println("Area is equal to " + pi * radius * radius);
    }

    static void circumference() {
        System.out.println("Circumference is equal to " + pi * 2 * radius);
    }
}
