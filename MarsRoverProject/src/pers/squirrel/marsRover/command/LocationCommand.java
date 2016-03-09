/**
 * Copy Right 2016 MarsDetectorProject
 * @Version V1.0
 * @Title LocationCommand.java
 * @author Squirrel
 * @Date 2016��1��20��
 * @Description To execute located command.
 */
package pers.squirrel.marsRover.command;

public class LocationCommand extends BaseCommand {

	@Override
	public void execute() {
		rover.getLocation();
	}

}
