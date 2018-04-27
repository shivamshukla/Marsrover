package com.shivam.mrover.commands;

import com.shivam.mrover.BaseTest;
import com.shivam.mrover.commands.SpinRightCommand;
import com.shivam.mrover.directions.EastDirection;
import com.shivam.mrover.directions.NorthDirection;
import com.shivam.mrover.rover.Rover;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SpinRightCommandTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
        direction = new NorthDirection();
        rover = new Rover(plateau, xCoordinate, yCoordinate, direction);
        command = new SpinRightCommand();
    }

    @Test
    public void whenSpinRightCommandIsExecutedRoverSpinsRight() throws Exception {
        command.execute(rover);
        assertEquals(EastDirection.class, rover.getDirection().getClass());
    }
}
