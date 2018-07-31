package com.musala.training.design.patterns.structural.bridge.bridge1;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
