package com.final_;

public class FinalExe {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println(circle.mianji());
    }
}
class Circle{
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double mianji(){
        return PI * radius * radius;
    }
}