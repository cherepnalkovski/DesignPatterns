package com.musala.training.karelJ.Robots;

import kareltherobot.Directions;

/**
 * Factory class used to create instances of all robot types.
 */
public class RobotFactory {

    /**
     * Returns a concrete factory object that is an instance of the
     * concrete factory class which is suitable for drawing the required figure.
     *
     * @param figure - figure type
     * @return ан instance of a robot who can draw the required figure
     */
    public static AbstractRobot getRobot(String figure) {
        switch (figure) {
            case "Square":
                return new SquareRobot(2, 2, Directions.East, 25);
            case "Rhombus":
                return new RhombusRobot(2, 2, Directions.East, 25);
            case "Rectangle":
                return new RectangleRobot(2, 2, Directions.East, 25);
            default:
                throw new IllegalArgumentException("There is no robot which can draw :" + figure);
        }
    }
}
