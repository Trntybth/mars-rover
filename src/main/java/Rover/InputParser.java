package Rover;

import java.util.Scanner;

public class InputParser {
    String userInputString;

    enum Instruction {
        L,
        R,
        M
    }

    // use scanner to take user input
    // method to take user input from scanner and convert to enum instruction,
    // create plateau size, take enum instruction and convert to compass direction, and update rover position.
    // Upon creation of a rover, roverposition created with default values 0 , 0
    // 1. take string input (LLMRMLMRM)  , iterate over string (foreach) and compare to enum instruction
    // 2. for each matching instruction, call (move) method (in Rover?) with switch case to update a
    // value held in roverposition object of rover.



}
