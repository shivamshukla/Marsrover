package com.shivam.mrover.directions;

import com.shivam.mrover.rover.Rover;

public interface Direction {

    public abstract Direction spinRight();

    public abstract Direction spinLeft();

    public abstract void moveForward(Rover rover);

    public abstract void moveBack(Rover rover);
}
