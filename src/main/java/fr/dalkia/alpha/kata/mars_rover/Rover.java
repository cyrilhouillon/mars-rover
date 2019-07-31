package fr.dalkia.alpha.kata.mars_rover;

import static fr.dalkia.alpha.kata.mars_rover.Orientation.*;

public class Rover {

    private static final char MOVE = 'M';
    private static final char TURN_RIGHT = 'R';
    private static final char TURN_LEFT = 'L';


    private int x = 0;
    private int y = 0;
    private Orientation orientation = N;

    public String execute(String s) {
        for (char aChar : s.toCharArray()) {
            if (aChar == MOVE) {
                move();
            } else if (aChar == TURN_RIGHT) {
                turnRight();
            } else if (aChar == TURN_LEFT) {
                turnLeft();
            }
        }
        return x + ":" + y + ":" + orientation;
    }

    private void turnLeft() {
        orientation = W;
    }

    private void turnRight() {
        orientation = orientation.getRight();
    }

    private void move() {
        if (orientation.equals(N)) {
            y += 1;
        }
        if (orientation.equals(E)) {
            x += 1;
        }
    }
}
