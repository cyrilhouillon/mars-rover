package fr.dalkia.alpha.kata.mars_rover;

public class Rover {

    private int x = 0;
    private int y = 0;
    private String orientation = "N";

    public String execute(String s) {
        for (char aChar : s.toCharArray()) {
            if (aChar == 'M') {
                y += 1;
            } else {
                orientation = "E";
            }
        }
        return "0:" + y + ":" + orientation;
    }
}
