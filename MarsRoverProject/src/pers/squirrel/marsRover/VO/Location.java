/**
 * Copy Right 2016 MarsDetectorProject
 * @Version V1.0
 * @Title Location.java
 * @author Squirrel
 * @Date 2016Äê1ÔÂ20ÈÕ
 * @Description To include coordinate and direction.
 */
package pers.squirrel.marsRover.VO;

public class Location {

	private Coordinate coordinate;
	private String direction;

	public Location() {

	}

	public Location(Coordinate coordinate, String direction) {
		this.coordinate = coordinate;
		this.direction = direction;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String toString() {
		return "( " + this.getCoordinate().toString() + ", " + this.direction
				+ " )";
	}

}
