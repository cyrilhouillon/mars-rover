package fr.dalkia.alpha.kata.mars_rover;

public class Rover {

    private int x = 0;
    private int y = 0;
    private String orientation = "N";

    public String execute(String s) {
        for (char aChar : s.toCharArray()) {
            if (aChar == 'M') {
                if (orientation.equals("N") || orientation.equals("S")) {
                    y += 1;
                }
                if (orientation.equals("E") || orientation.equals("W")) {
                    x += 1;
                }
            } else {

                if (aChar == 'R') {
                    orientation = "E";
                } else if (aChar == 'L') {
                    orientation = "W";
                }
            }
        }
        return x + ":" + y + ":" + orientation;
    }
}
