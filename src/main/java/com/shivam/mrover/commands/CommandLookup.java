package com.shivam.mrover.commands;

public enum CommandLookup {

    R(new SpinRightCommand()),

    L(new SpinLeftCommand()),

    M(new MoveForwardCommand()),

    B(new MoveBackCommand());

    private final Command command;

    CommandLookup(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }
}
