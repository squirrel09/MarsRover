/**
 * Copy Right 2016 MarsDetectorProject
 * @FileName MarsDetector.java
 * @author Squirrel
 * @Date 2016Äê1ÔÂ20ÈÕ
 * @Description The Mars detector class.
 */
package pers.squirrel.marsRover.rover;

import pers.squirrel.marsRover.VO.Location;
import pers.squirrel.marsRover.util.CalculateUtil;

public class MarsRover extends Rover {

	public MarsRover() {
		super();
	}

	@Override
	public void move() {
		location = this.getLocation();
		CalculateUtil.caculateCoordinate(location, request);
	}

	@Override
	public void turn() {
		location = this.getLocation();
		CalculateUtil.caculateDirection(location, request);
	}

	public Location getLocation() {
		return CalculateUtil.caculateLocation(location);
	}

}
