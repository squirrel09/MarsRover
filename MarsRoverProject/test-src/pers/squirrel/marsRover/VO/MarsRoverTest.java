package pers.squirrel.marsRover.VO;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import pers.squirrel.marsRover.rover.MarsRover;
import pers.squirrel.marsRover.rover.Rover;

public class MarsRoverTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testMove() {
		Rover rover = new MarsRover();
		rover.setRequest("L");
		rover.move();
		int x = rover.getLocation().getCoordinate().getX();
		int expectedX = 1;
		assertEquals(expectedX, x);
	}

	@Test
	public void testTurn() {
		Rover rover = new MarsRover();
		rover.setRequest("L");
		rover.turn();
	}

	@Test
	public void testGetLocation() {
		
	}

}
