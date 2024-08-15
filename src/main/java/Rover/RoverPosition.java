package Rover;

import java.util.HashMap;
import java.util.Map;

public class RoverPosition {

    enum CompassDirection {
        NORTH,
        SOUTH,
        WEST,
        EAST
    }
    private CompassDirection facing;
    Map<String, Integer> currentLocation = new HashMap<>();


}
