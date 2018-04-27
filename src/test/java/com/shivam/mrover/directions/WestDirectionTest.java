package com.shivam.mrover.directions;

import com.shivam.mrover.BaseTest;
import com.shivam.mrover.directions.NorthDirection;
import com.shivam.mrover.directions.SouthDirection;
import com.shivam.mrover.directions.WestDirection;
import com.shivam.mrover.rover.Rover;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WestDirectionTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
        direction = new WestDirection();
        rover = new Rover(plateau, xCoordinate, yCoordinate, direction);
    }

    @Test
    public void whenWestDirectionTurnsRightNewDirectionIsNorth() throws Exception {
        assertEquals(direction.spinRight().getClass(), NorthDirection.class);
    }

    @Test
    public void whenWestDirectionTurnsLeftNewDirectionIsSouth() throws Exception {
        assertEquals(direction.spinLeft().getClass(), SouthDirection.class);
    }

    @Test
    public void whenWestDirectionMovesForwardCoordinateXDecrements() throws Exception {
        direction.moveForward(rover);
        assertEquals(--xCoordinate, rover.getCoordinateX());
    }

    @Test
    public void whenWestDirectionMovesBackCoordinateXIncrements() throws Exception {
        direction.moveBack(rover);
        assertEquals(++xCoordinate, rover.getCoordinateX());
    }
}
