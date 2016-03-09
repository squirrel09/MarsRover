/**
 * Copy Right 2016 MarsDetectorProject
 * @FileName Detector.java
 * @author Squirrel
 * @Date 2016Äê1ÔÂ20ÈÕ
 * @Description The super rover
 */
package pers.squirrel.marsRover.rover;

import pers.squirrel.marsRover.VO.Location;

public abstract class Rover implements Lifecycle {

	protected Location location;
	protected String request;
	protected String status;

	public Rover() {

	}

	public abstract void move();

	public abstract void turn();

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
