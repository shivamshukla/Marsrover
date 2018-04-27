package com.shivam.mrover;

import com.shivam.mrover.Plateau;
import com.shivam.mrover.commands.Command;
import com.shivam.mrover.directions.Direction;
import com.shivam.mrover.rover.Rover;

public abstract class BaseTest {

    protected final Plateau plateau = new Plateau(5, 5);
    protected int xCoordinate = 2;
    protected int yCoordinate = 2;
    protected Direction direction;
    protected Rover rover;
    protected Command command;
}
