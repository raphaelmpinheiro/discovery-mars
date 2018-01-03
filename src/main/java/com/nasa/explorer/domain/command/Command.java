package com.nasa.explorer.domain.command;

import com.nasa.explorer.domain.Robot;

public interface Command {
	void Execute(Robot robot);
}
