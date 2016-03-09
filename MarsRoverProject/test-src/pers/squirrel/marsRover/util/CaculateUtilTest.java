package pers.squirrel.marsRover.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import pers.squirrel.marsRover.VO.Coordinate;
import pers.squirrel.marsRover.VO.Location;

public class CaculateUtilTest {

	Location location;
	String request = "R";
	@Before
	public void setUpBeforeClass() throws Exception {
		location = new Location(new Coordinate(0,0), "E");
	}

	@Ignore
	public void testCaculateLocation() {
		location = CalculateUtil.caculateLocation(location);
		assertNotNull(location);
		assertNotNull(location.getCoordinate());
		int x = location.getCoordinate().getX();
		int y = location.getCoordinate().getY();
		String direction = location.getDirection();
		int exceptedX = 0;
		int exceptedY = 0;
		String exceptedDict = "E";
		
		assertEquals(exceptedX, x);
		assertEquals(exceptedY, y);
		assertEquals(exceptedDict, direction);
	}

	@Ignore
	public void testCaculateCoordinate() {
		CalculateUtil.caculateCoordinate(location, request);
		int x = location.getCoordinate().getX();
		int y = location.getCoordinate().getY();
		
		int exceptedX = 1;
		int exceptedY = 0;
		assertEquals(exceptedX, x);
		assertEquals(exceptedY, y);
	}

	@Ignore
	public void testCaculateDirection() {
		CalculateUtil.caculateDirection(location, request);
		String direction = location.getDirection();
		String exceptedDict = "W";
		assertEquals(exceptedDict, direction);
	}

	@Ignore
	public void testCaculateRightDirection() {
		CalculateUtil.caculateRightDirection(location);
		String direction = location.getDirection();
		String exceptedDict = "N";
		assertEquals(exceptedDict, direction);
	}
	@Test
	public void testCaculateLeftDirection() {
		CalculateUtil.caculateLeftDirection(location);
		String direction = location.getDirection();
		String exceptedDict = "N";
		assertEquals(exceptedDict, direction);
	}

	

}
