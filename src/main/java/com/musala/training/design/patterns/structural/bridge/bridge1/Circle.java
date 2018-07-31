package com.musala.training.design.patterns.structural.bridge.bridge1;

public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    public void applyColor() {
       color.applyColor();
    }
}
