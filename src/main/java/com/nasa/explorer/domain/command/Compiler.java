package com.nasa.explorer.domain.command;

import java.util.LinkedList;
import java.util.Queue;

import com.nasa.explorer.domain.Robot;

public class Compiler {

	private String command;

	public Compiler(String command) {
		this.command = command;
	}
	
	public void executeCommands(Robot robot) throws IllegalArgumentException
	{
		Queue<Command> commands = this.getCommands();
		for (Command c : commands) {
			c.Execute(robot);
		}
	}
	
	public Queue<Command> getCommands() throws IllegalArgumentException {
		Queue<Character> tokens = lexicalAnalyzer(command);
		return syntaxAnalyzer(tokens);
	}

	private Queue<Character> lexicalAnalyzer(String command) {
		Queue<Character> tokens = new LinkedList<Character>();
		for (char character : command.toCharArray()) {
			tokens.add(character);
		}
		return tokens;
	}

	private Queue<Command> syntaxAnalyzer(Queue<Character> tokens) throws IllegalArgumentException {
		Queue<Command> instructions = new LinkedList<Command>();
		for (Character token : tokens) {
			switch (token) {
			case 'M':
				instructions.add(new CommandMove());
				break;
			case 'L':
				instructions.add(new CommandRotateLeft());
				break;
			case 'R':
				instructions.add(new CommandRotateRight());
				break;
			default:
				throw new IllegalArgumentException("Invalid command");
			}
		}
		return instructions;
	}
}
