package com.nasa.explorer.domain;

public class Terrain {

	private Robot[][] positionedRobots;
	private int width;
	private int height;

	public Terrain(int width, int height) {
		this.width = width;
		this.height = height;
		this.positionedRobots = new Robot[width][height];
	}

	public void setRobot(Robot robot) {
		Position position = robot.getPosition();
		if (positionIsValid(position.getX(), position.getY())) {
			this.positionedRobots[position.getX()][position.getY()] = robot;
		} else {
			throw new IllegalArgumentException("position " + position.toString() + " of robo is invalid.");
		}
	}

	public void removeRobot(Robot robot) {
		Position position = robot.getPosition();
		this.positionedRobots[position.getX()][position.getY()] = null;
	}

	public boolean positionIsValid(int x, int y) {
		if (width > x && x >= 0 && height > y && y >= 0) {
			return true;
		}
		return false;
	}
}
