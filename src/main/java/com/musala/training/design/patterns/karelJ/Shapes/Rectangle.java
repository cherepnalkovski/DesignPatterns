package com.musala.training.design.patterns.karelJ.Shapes;

/**
 * Class used to store only specific properties of a Rectangle object.
 */
public class Rectangle extends Square {

    private int y;

    public Rectangle(int i, int y) {
        super(i);
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
