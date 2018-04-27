package com.shivam.mrover.commands;

import com.shivam.mrover.rover.Rover;

public interface Command {

    public abstract void execute(Rover rover);
}
