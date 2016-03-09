/**
 * Copy Right 2016 MarsDetectorProject
 * @FileName DirectionalCommand.java
 * @author Squirrel
 * @Date 2016��1��20��
 * @Description To execute move command.
 */
package pers.squirrel.marsRover.command;

public class MoveCommand extends BaseCommand {

	public MoveCommand() {
		super();
	}

	@Override
	public void execute() {
		rover.move();
	}

}
