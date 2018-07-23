package com.musala.training.karelJ.Robots;

import com.musala.training.karelJ.Shapes.Figure;
import com.musala.training.karelJ.Shapes.Rectangle;

/**
 * This is variant of a Robot that can draw only {@link Rectangle}.
 */
public class RectangleRobot extends AbstractRobot {

    public RectangleRobot(int street, int avenue, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
    }

    /**
     * Used for drawing Rectangles.
     *
     * @param figure - rectangle properties.
     */
    @Override
    public void draw(Figure figure) {
        Rectangle rectangle = (Rectangle) figure;
        int size = 0;
        while (size < 4) {
            if (size % 2 == 0) {
                drawSide(rectangle.getX());
            } else {
                drawSide(rectangle.getY());
            }
            turnLeft();
            size++;
        }
    }
}