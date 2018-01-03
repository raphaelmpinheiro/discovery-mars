package com.nasa.explorer.domain.command;

import com.nasa.explorer.domain.Robot;

public class CommandMove implements Command {

	@Override
	public void Execute(Robot robot) {
		robot.move();
	}
}
