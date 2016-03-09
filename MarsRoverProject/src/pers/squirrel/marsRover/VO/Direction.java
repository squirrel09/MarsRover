/**
 * Copy Right 2016 MarsDetectorProject
 * @Version V1.0
 * @Title Direction.java
 * @author Squirrel
 * @Date 2016Äê1ÔÂ20ÈÕ
 * @Description To keep different directions.
 */
package pers.squirrel.marsRover.VO;

import java.util.HashMap;
import java.util.Map;

public class Direction {
	
	public final static String DIRECTION_EAST = "E";
	public final static String DIRECTION_WEST = "W";
	public final static String DIRECTION_NORTH = "N";
	public final static String DIRECTION_SOUTH = "S";

	public static String[] directionArray = {DIRECTION_EAST, DIRECTION_SOUTH, DIRECTION_WEST, DIRECTION_NORTH};
	public static Map<String, Integer> directionMap = new HashMap<String, Integer>();
	
	static {
		for(int i=0; i<directionArray.length; i++) {
			directionMap.put(directionArray[i], i);
		}
	}

}
