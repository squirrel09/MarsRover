/**
 * Copy Right 2016 MarsDetectorProject
 * @Version V1.0
 * @Title Coordinate.java
 * @author Squirrel
 * @Date 2016Äê1ÔÂ20ÈÕ
 * @Description To keep x and y coordinates.
 */
package pers.squirrel.marsRover.VO;

public class Coordinate {
	private int x;
	private int y;

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return x + ", " + y;
	}

}
