package fr.dalkia.alpha.kata.mars_rover;

import org.junit.Assert;
import org.junit.Test;

public class RoverTest {

    @Test
    public void execute() {
    }

    @Test
    public void move() {
        //Given
        Rover rover = new Rover();
        //On esty à 0,0


        //When
        rover.move();


        //Then
        //on veut être à 0,1
        Assert.assertEquals(0, rover.getX());
        Assert.assertEquals(1, rover.getY());
        Assert.assertEquals(Rover.Orientation.NORTH, rover.getOrientation());
    }

    @Test
    public void turnRight() {
        //Given
        Rover rover = new Rover();

        //When
        rover.turnRight();

        //Then
        //On veut être orienter vers l'Est
        Assert.assertEquals(Rover.Orientation.EAST, rover.getOrientation());

    }

    @Test
    public void turnLeft() {
        //Given
        Rover rover = new Rover();

        //When
        rover.turnLeft();

        //Then
        //On veut être orienter vers l'Est
        Assert.assertEquals(Rover.Orientation.WEST, rover.getOrientation());

    }
}
