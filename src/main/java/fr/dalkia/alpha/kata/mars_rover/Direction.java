package fr.dalkia.alpha.kata.mars_rover;

enum Direction {
    NORTH("N"), EAST("E"), SOUTH("S"), WEST("W");

    private final String value;

    Direction(String value) {
        this.value = value;
    }

    Direction right() {
        return Direction.values()[(this.ordinal() + 1) % Direction.values().length];
    }

    Direction left() {
        return Direction.values()[(Direction.values().length + this.ordinal() - 1) % Direction.values().length];
    }

    @Override
    public String toString() {
        return value;
    }
}
