package com.musala.training.design.patterns.structural.bridge.bridge1;

public class Square extends Shape{
    public Square(Color color) {
        super(color);
    }

    public void applyColor() {
        color.applyColor();
    }
}
