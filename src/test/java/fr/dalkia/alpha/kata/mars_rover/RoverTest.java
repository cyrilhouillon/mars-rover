package fr.dalkia.alpha.kata.mars_rover;

import org.junit.Assert;
import org.junit.Test;

public class RoverTest {

    @Test
    public void shouldBeAtZeroZero() {
        //Given
        Rover rover = new Rover();

        //When
        String statut = rover.execute("");

        //Then
        Assert.assertEquals("0:0:N", statut);
    }

    @Test
    public void shouldMove() {
        //Given
        Rover rover = new Rover();

        //When
        String statut = rover.execute("M");

        //Then
        Assert.assertEquals("0:1:N", statut);
    }

    @Test
    public void shouldMoveTwice() {
        //Given
        Rover rover = new Rover();

        //When
        String statut = rover.execute("MM");

        //Then
        Assert.assertEquals("0:2:N", statut);
    }

    @Test
    public void should_turn_right_and_be_east_oriented() {
        //Given
        Rover rover = new Rover();

        //When
        String statut = rover.execute("R");

        //Then
        Assert.assertEquals("0:0:E", statut);
    }
}
