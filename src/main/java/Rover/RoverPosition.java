package Rover;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoverPosition {

    enum CompassDirection {
        N,
        S,
        W,
        E
    }

    private int positionX;
    private int positionY;
    private CompassDirection facing;

    public RoverPosition(int x, int y, CompassDirection facing){
        this.positionX = x;
        this.positionY = y;
        this.facing = facing;
    }




}
