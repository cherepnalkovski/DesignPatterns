package com.musala.training.design.patterns.structural.bridge.bridge1;

public class Shape1BrideDemo {

    public static void main(String[] args) {

        Color blue = new Blue();

        Shape shape = new Square(blue);

        Color red = new Red();

        Shape shape1 = new Circle(red);

        shape.applyColor();
        shape1.applyColor();
    }
}
