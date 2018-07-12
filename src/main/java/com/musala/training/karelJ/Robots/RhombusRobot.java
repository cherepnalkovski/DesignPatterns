package com.musala.training.karelJ.Robots;

import com.musala.training.karelJ.Shapes.Figure;
import com.musala.training.karelJ.Shapes.Rhombus;

/**
 * This is variant of a Robot that can draw only {@link Rhombus}.
 */
public class RhombusRobot extends AbstractRobot {

    public RhombusRobot(int street, int avenue, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
    }

    /**
     * Used for drawing Rhombus.
     *
     * @param figure - Rhombus properties.
     */
    @Override
    public void draw(Figure figure) {
        Rhombus rhombus = (Rhombus) figure;
        for (int j = 0; j < 2; j++) {
            drawSide(rhombus.getX());
            stepBack();
            for (int k = 0; k < rhombus.getX(); k++) {
                turnLeft();
                move();
                turnRight();
                move();
                putBeeper();
            }
            turnLeft();
            turnLeft();
            move();
        }
    }
}
