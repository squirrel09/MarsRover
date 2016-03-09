/**
 * Copy Right 2016 MarsRoverProject
 * @Version V1.0
 * @Title MacCommand.java
 * @author Squirrel
 * @Date 2016��1��22��
 * @Description TODO
 */
package pers.squirrel.marsRover.command;

import java.util.ArrayList;
import java.util.List;

public class MacCommand extends BaseCommand {

	private List<BaseCommand> commandList;

	public MacCommand() {
		commandList = new ArrayList<BaseCommand>();
	}

	@Override
	public void execute() {
		for (BaseCommand command : commandList) {
			command.execute();
		}

	}

	public void addCommand(BaseCommand command) {
		commandList.add(command);
	}

}
