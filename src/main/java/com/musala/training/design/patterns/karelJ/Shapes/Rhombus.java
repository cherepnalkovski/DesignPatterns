package com.musala.training.design.patterns.karelJ.Shapes;

/**
 * Class used to store only specific properties of a Rhombus object.
 * <p>
 * TODO: This rombus is implemented with angle of 135 degrees. KarelJ can move only from corner to corner. That means we can't draw rhombus with all possible angles. Any suggestions how to implement this ?
 */
public class Rhombus extends Figure {
    private int alpha;

    public Rhombus(int i, int alpha) {
        super(i);
        this.alpha = alpha;
    }

    public int getAlpha() {
        return alpha;
    }
}
