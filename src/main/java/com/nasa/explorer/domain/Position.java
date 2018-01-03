package com.nasa.explorer.domain;

public class Position {

	private int x;
	private int y;
	private Direction direction;

	public Position(int x, int y, Direction direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public void moveOnAxisX(int value) {
		x = x + value;
	}

	public void moveOnAxisY(int value) {
		y = y + value;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Direction getDirection() {
		return this.direction;
	}

	public void setDirection(Direction value) {
		this.direction = value;
	}

	public void move() {
		switch (this.getDirection()) {
		case NORTH:
			this.moveOnAxisY(1);
			break;
		case EAST:
			this.moveOnAxisX(1);
			break;
		case SOUTH:
			this.moveOnAxisY(-1);
			break;
		case WEST:
			this.moveOnAxisX(-1);
			break;
		}
	}
	
	@Override
	public String toString() {
		return String.format("(%s, %s, %s)", getX(), getY(), getDirection().getInitials());
	}
}
