/**
 * Copy Right 2016 MarsDetectorProject
 * @Version V1.0
 * @Title Invoker.java
 * @author Squirrel
 * @Date 2016��1��21��
 * @Description An interface for invoker.
 */
package pers.squirrel.marsRover.invoker;

import pers.squirrel.marsRover.command.BaseCommand;

public interface Invoker {

	public abstract void action();

	public abstract void setCommand(BaseCommand command);
}
