package com.musala.training.karelJ;

import com.musala.training.karelJ.Robots.*;
import com.musala.training.karelJ.Shapes.Rectangle;
import com.musala.training.karelJ.Shapes.Rhombus;
import com.musala.training.karelJ.Shapes.Square;
import kareltherobot.KJRTest;
import kareltherobot.MiniBuilder;
import kareltherobot.World;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Class used for testing {@link RobotFactory} - object creation and {@link AbstractRobot} drawing features.
 */
public class AppTest extends KJRTest {

    @Before
    public void setUp() {
        World.reset();
        World.setSize(20, 20);
        World.setDelay(10);
        World.setTrace(false);
        World.setVisible(true);
        new MiniBuilder(false);
    }

    @Test
    public void testSquare() {
        Square square = new Square(4);
        AbstractRobot robot = RobotFactory.getRobot("Square");
        Assert.assertThat(robot, instanceOf(SquareRobot.class));
        robot.draw(square);
        assertFacingEast(robot);
        assertAt(robot, 2, 2);
        assertBeepersInBeeperBag(robot);
        assertBeepersInWorld(16);
        assertBeepersAt(2, 6);
        assertBeepersAt(6, 6);
        assertBeepersAt(6, 2);
        // check for duplicated beeper at starting position
        assertBeepersAt(2, 2, 1);
        robot.turnOff();
    }

    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle(3, 4);
        AbstractRobot robot = RobotFactory.getRobot("Rectangle");
        Assert.assertThat(robot, instanceOf(RectangleRobot.class));
        robot.draw(rectangle);
        assertFacingEast(robot);
        assertAt(robot, 2, 2);
        assertBeepersInBeeperBag(robot);
        assertBeepersInWorld(14);
        assertBeepersAt(2, 5);
        assertBeepersAt(6, 5);
        assertBeepersAt(6, 2);
        // check for duplicated beeper at starting position
        assertBeepersAt(2, 2, 1);
        robot.turnOff();
    }

    @Test
    public void testRhombus() {
        Rhombus rhombus = new Rhombus(4, 6);
        AbstractRobot robot = RobotFactory.getRobot("Rhombus");
        Assert.assertThat(robot, instanceOf(RhombusRobot.class));
        robot.draw(rhombus);
        assertFacingEast(robot);
        assertAt(robot, 2, 2);
        assertBeepersInBeeperBag(robot);
        assertBeepersInWorld(16);
        assertBeepersAt(2, 5);
        assertBeepersAt(6, 9);
        assertBeepersAt(6, 5);
        // check for duplicated beeper at starting position
        assertBeepersAt(2, 2, 1);
        robot.turnOff();
    }
}
