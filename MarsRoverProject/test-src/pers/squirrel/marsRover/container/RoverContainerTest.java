package pers.squirrel.marsRover.container;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import pers.squirrel.marsRover.controller.CommandController;
import pers.squirrel.marsRover.rover.MarsRover;

public class RoverContainerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		RoverContainer.getContainer().getList().add(new MarsRover());
		RoverContainer.getContainer().setController(new CommandController());
	}

	@Test
	public void testTurnMe() {
		RoverContainer.getContainer().myTurn();
	}

	@Ignore
	public void testOperation() {
		RoverContainer.getContainer().operation();
	}

	@Test
	public void testNotifyObject() {
		//RoverContainer.getContainer().notifyObject();
	}

}
