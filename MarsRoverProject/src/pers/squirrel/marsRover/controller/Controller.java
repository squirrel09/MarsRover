/**
 * Copy Right 2016 MarsDetectorProject
 * @Version V1.0
 * @Title Controller.java
 * @author Squirrel
 * @Date 2016Äê1ÔÂ21ÈÕ
 * @Description The super class for all controllers.
 */
package pers.squirrel.marsRover.controller;

import java.util.Scanner;

public abstract class Controller {

	public void inputCommand() {
		System.out.println("************Command Instruction*****************");
		System.out.println("0: Exist System");
		System.out.println("wolines: Check Location of A Rover");
		System.out.println("L,M,R: They Are Valid Command. e.g: LMMRRLL");
		System.out.println("************************************************");
		System.out.print("Please Input Your Command: ");
		Scanner scan = new Scanner(System.in);
		String request = scan.nextLine();
		if ("0".equals(request)) {
			System.out.println("******SHUT DOWN******");
			System.exit(0);
		} else {
			process(request);
		}
	}

	public void process(String request) {
		if (validationRequest(request)) {
			executeRequest(request);
		} else {
			System.out
					.println("This Command Is Invalid, Please Re-input...");
			inputCommand();
		}
	}

	public abstract boolean validationRequest(String request);

	public abstract void executeRequest(String request);
}
