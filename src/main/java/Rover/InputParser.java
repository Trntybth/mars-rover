package Rover;

import java.util.Arrays;
import java.util.Scanner;

public class InputParser {
    Scanner scanner = new Scanner(System.in);


    enum Instruction {
        L,
        R,
        M
    }


    public static int[] plateauDimensionsTaker() {
        /*
        Takes user input via a scanner object and throws exceptions until valid criteria is met.
        Converts to and returns int[] format to be passed onto roverPosition class.
        */
        Scanner scanner = new Scanner(System.in);
        // scanner method
        // test against exceptions method

        while (true) {
            System.out.println("Please input the dimensions of the plateau your rovers will use.");
            System.out.println("The co-ordinates must be in form of X and Y, for example: '8 8' will create an 8 x 8 grid.");
            System.out.println("Please make your grid larger than 4 x 4.");

            String dimensionsInput = scanner.nextLine();

            if (dimensionsInput.isEmpty() || dimensionsInput.matches(".*[a-zA-Z].*")) {
                throw new IllegalArgumentException("You must enter your chosen values in format '5 5'. Please try again.");
            }

            int[] dimensionsArray = Arrays.stream(dimensionsInput.split(" ")).mapToInt(Integer::parseInt).toArray(); // split string into int array

            //
            if (dimensionsArray[0] < 5 || dimensionsArray[1] < 5) {
                throw new IllegalArgumentException("Did you not listen?! The dimensions need to be larger than 4x4. Please try again.");
            } else if (dimensionsArray[0] > 30 || dimensionsArray[1] > 30) {
                throw new IllegalArgumentException("Woah! Mars isn't that big. Please try again with dimensions between 4x4 and 30x30.");
            }

            System.out.println("Your selected plateau area is " + dimensionsInput);
            return dimensionsArray;
        }
    }

    public void startingPositionTaker(){
        // scans user input for X and Y, needs to take N S W E
        // passes X & Y into RoverPosition's startingPoint hashmap
        // cannot be negative or smaller than plateau dimensions
    }

    public void instructionsTaker(){
    // takes LMLMMLLMMMR


    }




    public InputParser() {

    }



    // create 3 methods for taking different inputs

    // use scanner to take user input
    // method to take user input from scanner and convert to enum instruction,
    // create plateau size, take enum instruction and convert to compass direction, and update rover position.
    // Upon creation of a rover, roverposition created with default values 0 , 0
    // 1. take string input (LLMRMLMRM)  , iterate over string (foreach) and compare to enum instruction
    // 2. for each matching instruction, call (move) method (in Rover?) with switch case to update a
    // value held in roverposition object of rover.



}
