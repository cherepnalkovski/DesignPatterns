package com.musala.training.design.patterns.karelJ.Shapes;

/**
 * Abstract class used to store common properties for all figures.
 */
public abstract class Figure {
    private int x;

    public Figure(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}
