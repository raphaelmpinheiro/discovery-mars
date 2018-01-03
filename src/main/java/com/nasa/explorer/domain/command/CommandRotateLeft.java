package com.nasa.explorer.domain.command;

import com.nasa.explorer.domain.Robot;

public class CommandRotateLeft implements Command {

	@Override
	public void Execute(Robot robot) {
		robot.rotateLeft();
	}
}
