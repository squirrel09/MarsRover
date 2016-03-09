package pers.squirrel.marsRover.command.factory;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import pers.squirrel.marsRover.command.BaseCommand;

public class CommandFactoryTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//CommandPool.loadCommand();
	}

	@Test
	public void testCreateCommand() {
		BaseCommand command = CommandFactory.getInstance().createCommand("wolines");
		assertNotNull(command);
	}

}
