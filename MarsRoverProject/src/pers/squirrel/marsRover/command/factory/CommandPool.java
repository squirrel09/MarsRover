/**
 * Copy Right 2016 MarsDetectorProject
 * @Version V1.0
 * @Title CommandPool.java
 * @author Squirrel
 * @Date 2016Äê1ÔÂ21ÈÕ
 * @Description The class stores command and load the command from a properties file.
 */
package pers.squirrel.marsRover.command.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import pers.squirrel.marsRover.command.BaseCommand;
import pers.squirrel.marsRover.log.LoggerManager;

public class CommandPool {

	private static Map<String, BaseCommand> commandMap = new HashMap<String, BaseCommand>();
	private static Properties properties;

	public static void loadCommand() {
		properties = new Properties();
		try {
			properties.load(new FileInputStream("command-config.properties"));
		} catch (FileNotFoundException e) {
			LoggerManager.getLogger().error(e.getMessage(), e);
		} catch (IOException e) {
			LoggerManager.getLogger().error(e.getMessage(), e);
		}
		setCommandMap();
	}

	private static void setCommandMap() {
		Set set = properties.keySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			String classPath = properties.getProperty(key);
			try {
				Class clazz = Class.forName(classPath);
				commandMap.put(key, (BaseCommand) clazz.newInstance());
			} catch (ClassNotFoundException e) {
				LoggerManager.getLogger().error(e.getMessage(), e);
			} catch (InstantiationException e) {
				LoggerManager.getLogger().error(e.getMessage(), e);
			} catch (IllegalAccessException e) {
				LoggerManager.getLogger().error(e.getMessage(), e);
			}
		}
	}

	public static Map<String, BaseCommand> getCommandMap() {
		return commandMap;
	}

	public static BaseCommand getCommandInstance(String key) {
		return commandMap.get(key);
	}

	public static Properties getProperties() {
		return properties;
	}

	public static String getPropertiesValue(String key) {
		return properties.getProperty(key);
	}

}
