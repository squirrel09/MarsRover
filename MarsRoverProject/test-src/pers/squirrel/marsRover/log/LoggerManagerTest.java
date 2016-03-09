package pers.squirrel.marsRover.log;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;

public class LoggerManagerTest {

	@Test
	public void testGetLogger() {
		Logger logger = LoggerManager.getLogger();
		assertNotNull(logger);
	}

}
