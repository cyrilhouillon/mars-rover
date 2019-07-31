package fr.dalkia.alpha.kata.mars_rover;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class RoverShould {

    private Rover rover;

    @Before
    public void init() {
        Grid grid = new Grid(10, 10);
        rover = new Rover(grid);
    }

    @Test
    public void returns_his_position() {

        assertThat(rover.execute(""), is("0:0:N"));
    }

    @Test
    @Parameters({
            "R, 0:0:E",
            "RR, 0:0:S",
            "RRR, 0:0:W",
            "RRRR, 0:0:N"
    })
    public void rotate_right(String commands, String position) {

        assertThat(rover.execute(commands), is(position));
    }

    @Test
    @Parameters({
            "L, 0:0:W",
            "LL, 0:0:S",
            "LLL, 0:0:E",
            "LLLL, 0:0:N"
    })
    public void rotate_left(String commands, String position) {

        assertThat(rover.execute(commands), is(position));
    }

    @Test
    @Parameters({
            "M, 0:1:N",
            "MMM, 0:3:N"
    })
    public void move_up(String commands, String position) {

        assertThat(rover.execute(commands), is(position));
    }

    @Test
    @Parameters({
            "RM, 1:0:E",
            "RMMM, 3:0:E"
    })
    public void move_right(String commands, String position) {

        assertThat(rover.execute(commands), is(position));
    }

    @Test
    @Parameters({
            "MMMMMMMMMM, 0:0:N"
    })
    public void wrap_from_top_to_bottom_when_moving_north(String commands, String position) {

        assertThat(rover.execute(commands), is(position));
    }

    @Test
    @Parameters({
            "RMMMMMMMMMM, 0:0:E"
    })
    public void wrap_ftom_right_to_left_when_moving_east(String commands, String position) {

        assertThat(rover.execute(commands), is(position));
    }

    @Test
    @Parameters({
            "RRM, 0:9:S",
            "LLMMMM, 0:6:S",
    })
    public void move_down(String commands, String position) {

        assertThat(rover.execute(commands), is(position));
    }

    @Test
    @Parameters({
            "RRM, 0:9:S"
    })
    public void wrap_from_bottom_to_top_when_moving_south(String commands, String position) {

        assertThat(rover.execute(commands), is(position));
    }

    @Test
    @Parameters({
            "LM, 9:0:W"
    })
    public void wrap_ftom_left_to_right_when_moving_west(String commands, String position) {

        assertThat(rover.execute(commands), is(position));
    }

    @Test
    @Parameters({
            "MMMM, O:0:2:N"
    })
    public void stop_at_obstacle(String commands, String position) {
        rover = new Rover(new Grid(10, 10, asList(new Coordinate(0, 3))));

        assertThat(rover.execute(commands), is(position));
    }

}
