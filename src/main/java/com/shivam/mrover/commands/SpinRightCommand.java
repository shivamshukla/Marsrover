package com.shivam.mrover.commands;

import com.shivam.mrover.rover.Rover;

public class SpinRightCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.spinRight();
    }
}
