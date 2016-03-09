/**
 * Copy Right 2016 MarsDetectorProject
 * @Version V1.0
 * @Title TurnCommand.java
 * @author Squirrel
 * @Date 2016Äê1ÔÂ21ÈÕ
 * @Description To execute turn command.
 */
package pers.squirrel.marsRover.command;

public class TurnCommand extends BaseCommand {
	@Override
	public void execute() {
		rover.turn();

	}

}
