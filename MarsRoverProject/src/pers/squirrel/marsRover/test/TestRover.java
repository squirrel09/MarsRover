/**
 * Copy Right 2016 MarsDetectorProject
 * @Version V1.0
 * @Title TestDetector.java
 * @author Squirrel
 * @Date 2016Äê1ÔÂ20ÈÕ
 * @Description Test class
 */
package pers.squirrel.marsRover.test;

import pers.squirrel.marsRover.command.factory.CommandPool;
import pers.squirrel.marsRover.container.RoverContainer;
import pers.squirrel.marsRover.controller.CommandController;
import pers.squirrel.marsRover.controller.Controller;
import pers.squirrel.marsRover.rover.builder.RoverBuilder;

public class TestRover {

	public static void main(String[] args) {
		TestRover testRover = new TestRover();
		testRover.start();
	}

	public void init() {
		System.out.println("*****SYSTEM IS LOADING*******");
		System.out.println("");
		CommandPool.loadCommand();
		RoverBuilder.getBuilder().productRover(3);
		RoverContainer.getContainer().register(
				RoverBuilder.getBuilder().getList());
		Controller controller = new CommandController();
		RoverContainer.getContainer().setController(controller);
	}

	public void start() {
		init();
		RoverContainer.getContainer().operation();
	}

}
