/**
 * Copy Right 2016 MarsDetectorProject
 * @Version V1.0
 * @Title CommandFactory.java
 * @author Squirrel
 * @Date 2016Äê1ÔÂ21ÈÕ
 * @Description The class creates command.
 */
package pers.squirrel.marsRover.command.factory;

import pers.squirrel.marsRover.command.BaseCommand;

public class CommandFactory {

	private static CommandFactory factory = new CommandFactory();

	private CommandFactory() {

	}

	public static CommandFactory getInstance() {
		return factory;
	}

	public BaseCommand createCommand(String request) {
		BaseCommand command = CommandPool.getCommandInstance(request);
		if (command == null) {
			CommandPool.loadCommand();
			command = CommandPool.getCommandInstance(request);
		}
		return command;
	}

}
