/**
 * Copy Right 2016 MarsDetectorProject
 * @Version V1.0
 * @Title TurnCommand.java
 * @author Squirrel
 * @Date 2016��1��21��
 * @Description To execute turn command.
 */
package pers.squirrel.marsRover.command;

public class TurnCommand extends BaseCommand {
	@Override
	public void execute() {
		rover.turn();

	}

}
