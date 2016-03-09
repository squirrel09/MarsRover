/**
 * Copy Right 2016 MarsDetectorProject
 * @Version V1.0
 * @Title LocationCommand.java
 * @author Squirrel
 * @Date 2016Äê1ÔÂ20ÈÕ
 * @Description To execute located command.
 */
package pers.squirrel.marsRover.command;

public class LocationCommand extends BaseCommand {

	@Override
	public void execute() {
		rover.getLocation();
	}

}
