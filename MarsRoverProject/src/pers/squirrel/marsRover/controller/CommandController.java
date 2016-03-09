/**
 * Copy Right 2016 MarsDetectorProject
 * @Version V1.0
 * @Title CommandController.java
 * @author Squirrel
 * @Date 2016Äê1ÔÂ21ÈÕ
 * @Description To translate a request and get an Invoker
 * 				to execute this request.
 */
package pers.squirrel.marsRover.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pers.squirrel.marsRover.command.BaseCommand;
import pers.squirrel.marsRover.command.factory.CommandFactory;
import pers.squirrel.marsRover.container.RoverContainer;
import pers.squirrel.marsRover.invoker.Invoker;
import pers.squirrel.marsRover.invoker.RoverInvoker;
import pers.squirrel.marsRover.log.LoggerManager;
import pers.squirrel.marsRover.rover.Rover;

public class CommandController extends Controller {

	@Override
	public boolean validationRequest(String request) {
		if ("wolines".equalsIgnoreCase(request)) {
			return true;
		} else {
			Pattern pattern = Pattern.compile("[LRMlrm]");
			for (int i = 0; i < request.length(); i++) {
				Matcher matcher = pattern.matcher(String.valueOf(request
						.charAt(i)));
				boolean b = matcher.matches();
				if (!b) {
					return b;
				}
			}
			return true;
		}
	}

	@Override
	public void executeRequest(String request) {
		BaseCommand command = null;
		Rover rover = RoverContainer.getContainer().myTurn();
		Invoker invoker = new RoverInvoker();
		// Single command
		if ("wolines".equalsIgnoreCase(request)) {
			request = request.toLowerCase();
			command = CommandFactory.getInstance().createCommand(request);
			rover.setRequest(request);
			command.setRover(rover);
		} else { // Macros command
			try {
				command = (BaseCommand) Class.forName(
						"pers.squirrel.marsRover.command.MacCommand")
						.newInstance();
				for (int i = 0; i < request.length(); i++) {
					String actionReq = String.valueOf(request.charAt(i));
					actionReq = actionReq.toUpperCase();
					rover.setRequest(actionReq);
					BaseCommand subCommand = CommandFactory.getInstance()
							.createCommand(actionReq);
					subCommand.setRover(rover);
					command.addCommand(subCommand);
				}
			} catch (InstantiationException e) {
				LoggerManager.getLogger().error(e.getMessage(), e);
			} catch (IllegalAccessException e) {
				LoggerManager.getLogger().error(e.getMessage(), e);
			} catch (ClassNotFoundException e) {
				LoggerManager.getLogger().error(e.getMessage(), e);
			}
		}
		invoker.setCommand(command);
		invoker.action();
		System.out.println("The Final Location is: "
				+ rover.getLocation().toString());
		System.out.println("I Have Completed My Mission.");
		rover.setStatus(rover.COMPLETED);
		System.out
				.println("************************************************************");
		System.out.println("");
	}

}
