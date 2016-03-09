package pers.squirrel.marsRover.command.factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Map;
import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import pers.squirrel.marsRover.command.BaseCommand;

public class CommandPoolTest {

	@BeforeClass
	public static void setUp(){
		CommandPool.loadCommand();
	}
	@Test
	public void testLoadCommand() {
		CommandPool.loadCommand();
		
	}

	@Test
	public void testGetCommandMap() {
		
		Map map = CommandPool.getCommandMap();
		boolean excepted = false;
		boolean actual = map.isEmpty();
		assertEquals(excepted, actual);
	}

	@Test
	public void testGetCommandInstance() {
		BaseCommand command = CommandPool.getCommandInstance("wolines");
		assertNotNull(command);
	}

	@Test
	public void testGetProperties() {
		Properties properties = CommandPool.getProperties();
		assertNotNull(properties);
	}

	@Test
	public void testGetPropertiesValue() {
		String value = CommandPool.getPropertiesValue("M");
		String excepted = "pers.squirrel.marsRover.command.MoveCommand";
		assertEquals(excepted, value);
	}

}
