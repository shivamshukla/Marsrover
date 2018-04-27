package com.shivam.mrover;

import com.shivam.mrover.commands.Command;
import com.shivam.mrover.rover.Rover;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class MarsRover {

    public static void main(String[] args) throws IOException {

        ArrayList<String> inputFileAsList = InputUtil.parseInputFromFile(MarsRover.class.getResourceAsStream("/input.txt"));
        // The first instruction is separated out, which is global for all rovers
        List<String> roverInput = inputFileAsList.subList(1, inputFileAsList.size());
        int count=0;
        System.out.println("Input:" + "\n");
        for (String line : inputFileAsList)
            System.out.println(line);

        System.out.println("\n" + "Output:" + "\n");
        Plateau plateau = InputUtil.plateauInput(inputFileAsList.get(0));
        // We then run the set of Commands on that Rover and repeat this for the next pair of instructions
        for (int i = 0; i < roverInput.size(); i += 2) {
            Rover rover = InputUtil.roverInput(roverInput.get(i), plateau);
            ArrayList<Command> commands = InputUtil.commandInput(roverInput.get(i + 1));
            rover.executeCommandList(commands);
            System.out.print("Rover "+count+": ");
            count++;
            System.out.println(rover.broadcastLocation());
        }
    }
}
