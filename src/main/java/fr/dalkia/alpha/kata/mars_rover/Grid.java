package fr.dalkia.alpha.kata.mars_rover;

import java.util.EnumMap;
import java.util.List;
import java.util.Optional;

import static java.util.Collections.emptyList;

public class Grid {

    private final int maxX;
    private final int maxY;
    private final Coordinate NORTH = new Coordinate(0, 1);
    private final Coordinate EAST = new Coordinate(1, 0);
    private final Coordinate SOUTH = new Coordinate(0, -1);
    private final Coordinate WEST = new Coordinate(-1, 0);
    private final EnumMap<Direction, Coordinate> vectors = new EnumMap<Direction, Coordinate>(Direction.class);
    private final List<Coordinate> obstacles;

    public Grid(int maxX, int maxY) {
        this(maxX, maxY, emptyList());
    }

    public Grid(int maxX, int maxY, List<Coordinate> obstacles) {
        this.maxX = maxX;
        this.maxY = maxY;
        vectors.put(Direction.NORTH, NORTH);
        vectors.put(Direction.EAST, EAST);
        vectors.put(Direction.SOUTH, SOUTH);
        vectors.put(Direction.WEST, WEST);
        this.obstacles = obstacles;
    }

    Optional<Coordinate> move(Coordinate coordinate, Direction direction) {

        Coordinate newCoordinates = coordinate.move(vectorFor(direction));
        if (obstacles.contains(newCoordinates)) {
            return Optional.empty();
        }

        return Optional.of(new Coordinate(wrapUp(newCoordinates.x, maxX), wrapUp(newCoordinates.y, maxY)));
    }

    private int wrapUp(int i, int max) {
        return (max + i) % max;
    }

    private Coordinate vectorFor(Direction direction) {
        return vectors.get(direction);
    }


}
