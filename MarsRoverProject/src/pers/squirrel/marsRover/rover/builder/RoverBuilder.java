/**
 * Copy Right 2016 MarsRoverProject
 * @Version V1.0
 * @Title RoverBuilder.java
 * @author Squirrel
 * @Date 2016Äê1ÔÂ22ÈÕ
 * @Description The class builds Rover.
 */
package pers.squirrel.marsRover.rover.builder;

import java.util.ArrayList;
import java.util.List;

import pers.squirrel.marsRover.rover.MarsRover;
import pers.squirrel.marsRover.rover.Rover;

public class RoverBuilder {

	private List<Rover> list = new ArrayList<Rover>();
	private static RoverBuilder builder = new RoverBuilder();

	private RoverBuilder() {

	}

	public static RoverBuilder getBuilder() {
		return builder;
	}

	public void productRover(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MarsRover());
		}
	}

	public List<Rover> getList() {
		return list;
	}

}
