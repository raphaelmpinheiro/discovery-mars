package com.nasa.explorer.test;

import java.util.Queue;

import org.junit.Test;

import com.nasa.explorer.domain.Mars;
import com.nasa.explorer.domain.Robot;
import com.nasa.explorer.domain.Terrain;
import com.nasa.explorer.domain.command.Command;
import com.nasa.explorer.domain.command.Compiler;

import org.junit.Assert;

public class CommandTest {

	@Test
	public void ExecuteCommandMMRMMRMMTest() throws Exception {
		Mars mars = new Mars();
		Terrain terrain = mars.getTerrain();

		Robot c3po = new Robot(terrain);

		String command = "MMRMMRMM";
		Compiler compilator = new Compiler(command);
		Queue<Command> commands = compilator.getCommands();
		for (Command c : commands) {
			c.Execute(c3po);
		}

		Assert.assertEquals(2, c3po.getPosition().getX());
		Assert.assertEquals(0, c3po.getPosition().getY());
		Assert.assertEquals("S", c3po.getPosition().getDirection().getInitials());
	}

	@Test
	public void ExecuteCommandMMLTest() throws Exception {
		Mars mars = new Mars();
		Terrain terrain = mars.getTerrain();

		Robot c3po = new Robot(terrain);

		String command = "MML";
		Compiler compilator = new Compiler(command);
		Queue<Command> commands = compilator.getCommands();
		for (Command c : commands) {
			c.Execute(c3po);
		}

		Assert.assertEquals(0, c3po.getPosition().getX());
		Assert.assertEquals(2, c3po.getPosition().getY());
		Assert.assertEquals("W", c3po.getPosition().getDirection().getInitials());
	}

	@Test(expected = IllegalArgumentException.class)
	public void ExecuteCommandMMMMMMMMMMMMMMMMMMMMMMMMTest() throws Exception {
		Mars mars = new Mars();
		Terrain terrain = mars.getTerrain();

		Robot c3po = new Robot(terrain);

		String command = "MMMMMMMMMMMMMMMMMMMMMMMM";
		Compiler compilator = new Compiler(command);
		Queue<Command> commands = compilator.getCommands();
		for (Command c : commands) {
			c.Execute(c3po);
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void ExecuteCommandInvalidTest() throws Exception {
		String command = "AAAAA";
		Compiler compilator = new Compiler(command);
		compilator.getCommands();
	}
}
