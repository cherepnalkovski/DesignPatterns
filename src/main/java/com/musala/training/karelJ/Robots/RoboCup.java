package com.musala.training.karelJ.Robots;

import com.musala.training.karelJ.Shapes.Rectangle;
import com.musala.training.karelJ.Shapes.Rhombus;
import com.musala.training.karelJ.Shapes.Square;
import kareltherobot.Directions;
import kareltherobot.UrRobot;

public class RoboCup extends UrRobot {

    public RoboCup(int street, int avenue, Directions.Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
    }

    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void drawRhombus(int i) {
        for (int j = 0; j < 2; j++) {
            drawSide(i);
            stepBack();
            for (int k = 0; k < i; k++) {
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

    public void drawSide(int i) {
        while (i > 0) {
            putBeeper();
            move();
            i--;
        }
    }

    public void stepBack() {
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        turnLeft();
    }

    public void draw(Square square) {
        int sides = 0;
        while (sides < 4) {
            drawSide(square.getX());
            turnLeft();
            sides++;
        }
    }

    public void draw(Rectangle rectangle) {
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

    public void draw(Rhombus rhombus) {
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
