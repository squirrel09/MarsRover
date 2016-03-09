/**
 * Copy Right 2016 MarsDetectorProject
 * @Version V1.0
 * @Title CalculateUtil.java
 * @author Squirrel
 * @Date 2016Äê1ÔÂ21ÈÕ
 * @Description The utility class is for calculate direction, location.
 */
package pers.squirrel.marsRover.util;

import pers.squirrel.marsRover.VO.Coordinate;
import pers.squirrel.marsRover.VO.Direction;
import pers.squirrel.marsRover.VO.Location;

public class CalculateUtil {

	public static Location caculateLocation(Location location) {
		if (location == null) {
			location = new Location(new Coordinate(0, 0),
					Direction.DIRECTION_EAST);
		}
		return location;
	}

	public static void caculateCoordinate(Location location, String request) {
		String currentDict = location.getDirection();
		int x = location.getCoordinate().getX();
		int y = location.getCoordinate().getY();
		if (Direction.DIRECTION_EAST.equals(currentDict)) {
			x = x + 1;
		} else if (Direction.DIRECTION_WEST.equals(currentDict)) {
			x = x - 1;
		} else if (Direction.DIRECTION_NORTH.equals(currentDict)) {
			y = y + 1;
		} else if (Direction.DIRECTION_SOUTH.equals(currentDict)) {
			y = y - 1;
		}
		location.getCoordinate().setX(x);
		location.getCoordinate().setY(y);
	}

	public static void caculateDirection(Location location, String request) {
		if ("L".equals(request)) {
			caculateLeftDirection(location);
		} else if ("R".equals(request)) {
			caculateRightDirection(location);
		}
	}

	public static void caculateRightDirection(Location location) {
		String currentDict = location.getDirection();
		int index = Direction.directionMap.get(currentDict);
		if ((index + 1) % 4 == 0) {
			index = 0;
		} else {
			index = index + 1;
		}
		String updatedDict = Direction.directionArray[index];
		location.setDirection(updatedDict);
	}

	public static void caculateLeftDirection(Location location) {
		String currentDict = location.getDirection();
		int index = Direction.directionMap.get(currentDict);
		int tempIndex = index - 1;
		if (tempIndex < 0) {
			index = Direction.directionArray.length + tempIndex;
		} else {
			index = tempIndex;
		}
		String updatedDict = Direction.directionArray[index];
		location.setDirection(updatedDict);
	}
}
