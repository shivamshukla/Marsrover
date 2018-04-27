package com.shivam.mrover.rover;

class RoverOutOfBoundsException extends RuntimeException {

    public RoverOutOfBoundsException() {
        super("The Rover cannot be out of bounds of the plateau!");
    }
}
