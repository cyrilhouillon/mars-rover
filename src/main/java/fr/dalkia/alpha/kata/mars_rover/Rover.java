package fr.dalkia.alpha.kata.mars_rover;

public class Rover {
    public static final int MAX_X = 10;
    public static final int MAX_Y = 10;

    interface Movement {
        void move(Rover rover);

        void turnRight(Rover rover);

        void turnLeft(Rover rover);
    }

    public enum Orientation implements Movement {
        NORTH {
            @Override
            public void move(Rover rover) {
                rover.setY(rover.y + 1);
            }

            @Override
            public void turnRight(Rover rover) {
                rover.orientation = EAST;
            }

            @Override
            public void turnLeft(Rover rover) {
                rover.orientation = WEST;
            }
        }, EAST {
            @Override
            public void move(Rover rover) {
                rover.setX(rover.x + 1);
            }

            @Override
            public void turnRight(Rover rover) {
                rover.orientation = SOUTH;
            }

            @Override
            public void turnLeft(Rover rover) {
                rover.orientation = NORTH;
            }

        }, SOUTH {
            @Override
            public void move(Rover rover) {
                rover.setY(rover.y - 1);
            }

            @Override
            public void turnRight(Rover rover) {
                rover.orientation = WEST;
            }

            @Override
            public void turnLeft(Rover rover) {
                rover.orientation = EAST;
            }

        }, WEST {
            @Override
            public void move(Rover rover) {
                rover.setX(rover.x - 1);

            }

            @Override
            public void turnRight(Rover rover) {
                rover.orientation = NORTH;
            }

            @Override
            public void turnLeft(Rover rover) {
                rover.orientation = SOUTH;
            }
        };

    }

    private Orientation orientation = Orientation.NORTH;
    private int x = 0;
    private int y = 0;


    public String execute(String commands) {

        for (char c : commands.toCharArray()) {
            switch (c) {
                case 'M':
                    move();
                    break;
                case 'L':
                    turnLeft();
                    break;
                case 'R':
                    turnRight();
                    break;
                default:
                    break;
            }
        }

        return x + ":" + y + ":" + orientation;
    }

    public void move() {
        orientation.move(this);
    }

    public void turnRight() {
        orientation.turnRight(this);
    }

    public void turnLeft() {
        orientation.turnLeft(this);
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setX(int x) {
        this.x = x;
        boucle();
    }

    public void setY(int y) {
        this.y = y;
        boucle();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private void boucle() {
        if (x > MAX_X) {
            x = 0;
        }
        if (x < 0) {
            x = MAX_X;
        }
        if (y > MAX_Y) {
            y = 0;
        }
        if (y < 0) {
            y = MAX_Y;
        }
    }
}
