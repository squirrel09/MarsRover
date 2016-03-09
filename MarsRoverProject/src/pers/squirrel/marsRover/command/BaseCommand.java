/**
 * Copy Right 2016 MarsDetectorProject
 * @FileName BaseCommand.java
 * @author Squirrel
 * @Date 2016Äê1ÔÂ20ÈÕ
 * @Description The super command class
 */
package pers.squirrel.marsRover.command;

import pers.squirrel.marsRover.rover.Lifecycle;
import pers.squirrel.marsRover.rover.Rover;

public abstract class BaseCommand {

	protected Rover rover;

	public BaseCommand() {

	}

	public abstract void execute();

	public void addCommand(BaseCommand command){
		
	}
	public void setRover(Rover rover) {
		this.rover = rover;
	}
}
