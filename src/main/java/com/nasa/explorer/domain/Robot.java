package com.nasa.explorer.domain;

public class Robot {
	private Position position;
	private Terrain terrain;

	public Robot(Terrain terrain) {
		this.terrain = terrain;		
		this.position = new Position(0, 0, Direction.NORTH);
		terrain.setRobot(this);
	}

	public void move() {
		this.terrain.removeRobot(this);
		this.position.move();
		this.terrain.setRobot(this);
	}

	public Position getPosition() {
		return position;
	}

	public void rotateLeft() {
		Direction newDirection = Direction.getDirection(this.position.getDirection().getAngle() -90);
		position.setDirection(newDirection);
	}

	public void rotateRight() {
		Direction newDirection = Direction.getDirection(this.position.getDirection().getAngle() + 90);
		position.setDirection(newDirection);
	}
}
