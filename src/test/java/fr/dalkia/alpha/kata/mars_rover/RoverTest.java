package fr.dalkia.alpha.kata.mars_rover;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class RoverTest {
    Rover rover = new Rover();

    @Test
    public void shouldBeAtZeroZero() {
        //When
        String statut = rover.execute("");

        //Then
        Assert.assertEquals("0:0:N", statut);
    }

    @Test
    public void shouldMove() {
        //When
        String statut = rover.execute("M");

        //Then
        Assert.assertEquals("0:1:N", statut);
    }

    @Test
    public void shouldMoveTwice() {
        //When
        String statut = rover.execute("MM");

        //Then
        Assert.assertEquals("0:2:N", statut);
    }

    @Parameters({
            "R, 0:0:E",
            "RR, 0:0:S",
            "RRR, 0:0:W",
            "RRRR, 0:0:N"
            })
    @Test
    public void turnRight(String commands, String position) {

        //When
        String statut = rover.execute(commands);

        //Then
        Assert.assertEquals(position, statut);
    }

    @Test
    public void should_turn_right_move_and_be_east_oriented() {

        //When
        String statut = rover.execute("RM");

        //Then
        Assert.assertEquals("1:0:E", statut);
    }

    @Parameters({
            "L, 0:0:W",
            "LL, 0:0:S",
    })
    @Test
    public void turnLeft(String commands, String position) {

        //When
        String statut = rover.execute(commands);

        //Then
        Assert.assertEquals(position, statut);
    }

    @Test
    public void should_turn_left_x2_be_north_oriented() {

        //When
        String statut = rover.execute("L");

        //Then
        Assert.assertEquals("0:0:W", statut);
    }
}
