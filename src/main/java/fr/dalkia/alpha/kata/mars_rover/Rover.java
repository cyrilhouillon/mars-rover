package fr.dalkia.alpha.kata.mars_rover;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static fr.dalkia.alpha.kata.mars_rover.Direction.NORTH;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.joining;

public class Rover {

    private Direction direction = NORTH;
    private Coordinate coordinate = new Coordinate(0, 0);
    private final Grid grid;

    public Rover(Grid grid) {
        this.grid = grid;
    }

    public String execute(String commands) {
        System.out.println("Instructions : " + commands);

        for (char c : commands.toCharArray()) {
            printPosition();
            if (c == 'R') {
                direction = direction.right();
                System.out.println("Rotating to the right");
            }
            if (c == 'L') {
                direction = direction.left();
                System.out.println("Rotating to the left");
            }
            if (c == 'M') {
                System.out.println("Trying to move");
                Optional<Coordinate> nextCoordinate = grid.move(coordinate, direction);

                if (nextCoordinate.isPresent()) {
                    coordinate = nextCoordinate.get();
                } else {
                    System.out.println("OOPS : must be an obstacle");
                    return "O:" + positionAsString();
                }
            }
        }
        printPosition();
        return positionAsString();
    }

    private void printPosition() {
        List<List<String>> map = asList(
                new ArrayList(asList("9", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ")),
                new ArrayList(asList("8", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ")),
                new ArrayList(asList("7", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ")),
                new ArrayList(asList("6", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ")),
                new ArrayList(asList("5", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ")),
                new ArrayList(asList("4", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ")),
                new ArrayList(asList("3", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ")),
                new ArrayList(asList("2", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ")),
                new ArrayList(asList("1", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ")),
                new ArrayList(asList("0", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ")),
                new ArrayList(asList(" ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"))
        );

        String rover = "";
        switch (direction) {
            case NORTH:
                rover = "^";
                break;
            case EAST:
                rover = ">";
                break;
            case SOUTH:
                rover = "v";
                break;
            case WEST:
                rover = "<";
                break;
        }

        map.get(9 - coordinate.y).add(coordinate.x + 1, rover);


        System.out.println(map.stream().map(List::stream)
                .map(s -> s.collect(joining("")))
                .collect(Collectors.joining("\n")));
    }

    private String positionAsString() {
        return coordinate.x + ":" + coordinate.y + ":" + direction;
    }

}
