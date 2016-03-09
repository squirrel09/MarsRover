/**
 * Copy Right 2016 MarsRoverProject
 * @Version V1.0
 * @Title LoggerManager.java
 * @author Squirrel
 * @Date 2016Äê1ÔÂ22ÈÕ
 * @Description The class records system log
 */
package pers.squirrel.marsRover.log;

import org.apache.log4j.Logger;

public class LoggerManager {

	private static Logger logger = Logger.getLogger(LoggerManager.class);

	public static Logger getLogger() {
		return logger;
	}
}
