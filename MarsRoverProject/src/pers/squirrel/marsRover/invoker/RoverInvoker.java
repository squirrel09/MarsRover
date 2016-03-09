/**
 * Copy Right 2016 MarsDetectorProject
 * @Version V1.0
 * @Title RoverInvoker.java
 * @author Squirrel
 * @Date 2016Äê1ÔÂ21ÈÕ
 * @Description To invoke command to execute.
 */
package pers.squirrel.marsRover.invoker;

import pers.squirrel.marsRover.command.BaseCommand;

public class RoverInvoker implements Invoker {

	private BaseCommand command;

	@Override
	public void action() {
		command.execute();

	}

	@Override
	public void setCommand(BaseCommand command) {
		this.command = command;
	}

}
