package com.musala.training.karelJ.Robots;

import com.musala.training.karelJ.Shapes.Figure;
import kareltherobot.UrRobot;

/**
 * Class that provides basic robot functionality.
 */
public abstract class AbstractRobot extends UrRobot {
    public AbstractRobot(int street, int avenue, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
    }

    /**
     * Provides a basic capability for creating drawings.
     *
     * @param figure - figure properties.
     */
    public abstract void draw(Figure figure);

    /**
     * Change robot direction by 90 degrees.
     */
    protected void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    /**
     * Using beepers to draw one side of the figure.
     *
     * @param i - side length.
     */
    protected void drawSide(int i) {
        while (i > 0) {
            putBeeper();
            move();
            i--;
        }
    }

    protected void stepBack() {
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        turnLeft();
    }
}
