package com.nasa.explorer.domain;

public enum Direction {

	NORTH("N", 0), EAST("E", 90), SOUTH("S", 180), WEST("W", 270);

	private String initials;
	private int angle;

	private Direction(String initials, int angle) {
		this.initials = initials;
		this.angle = angle;
	}

	public int getAngle() {
		return angle;
	}

	public String getInitials() {
		return initials;
	}

	public static Direction getDirection(int angle) {
		int newAngle = angle;
		if (angle < 0) {
			newAngle = 360 + angle;
		}

		if (angle == 360) {
			newAngle = 0;
		}

		for (Direction d : Direction.values()) {
			if (d.getAngle() == newAngle) {
				return d;
			}
		}
		throw new IllegalArgumentException("angle invalid");		
	}
}
