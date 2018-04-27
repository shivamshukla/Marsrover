package com.shivam.mrover;

import com.shivam.mrover.commands.Command;
import com.shivam.mrover.commands.CommandLookup;
import com.shivam.mrover.directions.Direction;
import com.shivam.mrover.directions.DirectionLookup;
import com.shivam.mrover.rover.Rover;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
//Acts as controller
class InputUtil {

    //For getting inut from file
	public static ArrayList<String> parseInputFromFile(InputStream fileLocation) throws IOException {
        ArrayList<String> inputsFromFile = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileLocation));
        String fileLine;

        while ((fileLine = bufferedReader.readLine()) != null)
            inputsFromFile.add(fileLine);

        bufferedReader.close();
        return inputsFromFile;
    }

	//FOr Storing Plateau information
    public static Plateau plateauInput(String plateauInput) {
        String[] inputArray = plateauInput.split(" ");
        int plateauUpperBoundCoordinateX = Integer.parseInt(inputArray[0]);
        int plateauUpperBoundCoordinateY = Integer.parseInt(inputArray[1]);
        return new Plateau(plateauUpperBoundCoordinateX, plateauUpperBoundCoordinateY);
    }

    //Checking and storing rover landing co-ordinates
    public static Rover roverInput(String positionInput, Plateau plateau) {
        String[] inputArray = positionInput.split(" ");
        int roverLandingCoordinateX = Integer.parseInt(inputArray[0]);
        int roverLandingCoordinateY = Integer.parseInt(inputArray[1]);
        Direction direction = DirectionLookup.valueOf(inputArray[2]).getDirection();
        return new Rover(plateau, roverLandingCoordinateX, roverLandingCoordinateY, direction);
    }

    //Getting all the Command for the rover to follow
    public static ArrayList<Command> commandInput(String command) {
        char[] inputArray = command.toCharArray();
        ArrayList<Command> commandArrayList = new ArrayList<>();

        for (char character : inputArray) {
            Command currentCommand = CommandLookup.valueOf(Character.toString(character)).getCommand();
            commandArrayList.add(currentCommand);
        }

        return commandArrayList;
    }
}
