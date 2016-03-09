package pers.squirrel.marsRover.controller;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CommandControllerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testValidationRequest() {
		Controller controller = new CommandController();
		boolean actual = controller.validationRequest("rlmmmmlllRLMlll");
		boolean excepted = true;
		assertEquals(excepted, actual);
	}

	@Ignore
	public void testExecuteRequest() {
		Controller controller = new CommandController();
		controller.executeRequest("RMRM");
	}

	@Ignore
	public void testInputCommand() {
		Controller controller = new CommandController();
		controller.inputCommand();
	}

}
