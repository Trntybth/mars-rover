package Rover;

import java.util.Scanner;

public class InputParser {

    enum Instruction {
        L,
        R,
        M
    }

    public void plateauDimensionsTaker() {
        // scans user input for X & Y
        // cannot be smaller than 4 x 4
        // cannot be negative numbers
    }

    public void startingPositionTaker(){

        // scans user input for X and Y
        // passes X & Y into RoverPosition's startingPoint hashmap
    }
    public void instructionTaker(){


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
