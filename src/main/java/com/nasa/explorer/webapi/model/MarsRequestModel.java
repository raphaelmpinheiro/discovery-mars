package com.nasa.explorer.webapi.model;

public class MarsRequestModel {
			
	private String Command;

	public MarsRequestModel(String command) {
		super();
		Command = command;
	}

	public String getCommand() {
		return Command;
	}

	public void setCommand(String command) {
		Command = command;
	}

}
