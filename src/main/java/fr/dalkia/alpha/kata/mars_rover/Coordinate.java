package fr.dalkia.alpha.kata.mars_rover;

import java.util.Objects;

class Coordinate {

    final int x;
    final int y;


    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate move(Coordinate move) {
        int new_x = x + move.x;
        int new_y = y + move.y;
        return new Coordinate(new_x, new_y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return x == that.x &&
                y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
