package com.musala.training.karelJ.Robots;

import com.musala.training.karelJ.Shapes.Figure;
import com.musala.training.karelJ.Shapes.Square;

/**
 * This is variant of a Robot that can draw only {@link Square}.
 */
public class SquareRobot extends AbstractRobot {

    public SquareRobot(int street, int avenue, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
    }

    /**
     * Used for drawing Squares.
     *
     * @param figure - Square properties.
     */
    @Override
    public void draw(Figure figure) {
        Square square = (Square) figure;
        int sides = 0;
        while (sides < 4) {
            drawSide(square.getX());
            turnLeft();
            sides++;
        }
    }
}
