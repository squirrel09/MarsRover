/**
 * Copy Right 2016 MarsRoverProject
 * @Version V1.0
 * @Title RoverContainer.java
 * @author Squirrel
 * @Date 2016Äê1ÔÂ22ÈÕ
 * @Description Mars Container includes controller and manages all Rover objects.
 *              It can monitor Rover and notify them to make an action. The relationship
 *              between MarsContainer and Rover like observer pattern.
 */
package pers.squirrel.marsRover.container;

import java.util.ArrayList;
import java.util.List;

import pers.squirrel.marsRover.controller.Controller;
import pers.squirrel.marsRover.rover.Rover;

public class RoverContainer implements Container {

	private List<Rover> list = new ArrayList<Rover>();
	private Rover rover;
	private static int count = 0;
	private Controller controller;

	private static Container container = new RoverContainer();

	public void setController(Controller controller) {
		this.controller = controller;
	}

	private RoverContainer() {

	}

	public static RoverContainer getContainer() {
		return (RoverContainer) container;
	}

	public Rover myTurn() {
		return rover;
	}

	public void operation() {
		if (rover == null || Rover.COMPLETED.equals(rover.getStatus())) {
			notifyObject();
		} else {
			System.out.println("The Current Mars Rover Is Processing.");
		}
	}

	@Override
	public void register(List list) {
		this.list = list;

	}

	@Override
	public void notifyObject() {
		if (list.size() == 0) {
			System.out.println("");
			System.out
					.println("!!! There Is No Any Rovers Can Execute Mission !!! ");
			System.out.println("");
		} else if (count < list.size()) {
			rover = list.get(count);
			System.out.println("I Am No." + (count + 1)
					+ " Mars Rover, I Will Execute My Mission.");
			rover.setStatus(rover.START);
			controller.inputCommand();
			++count;
			operation();
		} else {
			System.out
					.println("All Mars Rovers Have Completed Their Missions.");
		}
	}

	public List<Rover> getList() {
		return list;
	}
}
