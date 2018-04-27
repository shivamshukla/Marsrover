package com.shivam.mrover.commands;

import com.shivam.mrover.rover.Rover;

public class MoveBackCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.moveBack();
    }
}
