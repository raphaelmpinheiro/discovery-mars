package com.nasa.explorer.test;

import org.junit.Test;

import com.nasa.explorer.domain.Direction;

import org.junit.Assert;

public class DirectionTest {

	@Test
	public void getDirectionNorth() {
		Direction newDirection = Direction.getDirection(0);
		Assert.assertEquals(Direction.NORTH, newDirection);
	}

	@Test
	public void getDirectionEast() {
		Direction newDirection = Direction.getDirection(90);
		Assert.assertEquals(Direction.EAST, newDirection);
	}

	@Test
	public void getDirectionSouth() {
		Direction newDirection = Direction.getDirection(180);
		Assert.assertEquals(Direction.SOUTH, newDirection);
	}

	@Test
	public void getDirectionWest() {
		Direction newDirection = Direction.getDirection(270);
		Assert.assertEquals(Direction.WEST, newDirection);
	}

	@Test
	public void getDirectionNorth360() {
		Direction newDirection = Direction.getDirection(360);
		Assert.assertEquals(Direction.NORTH, newDirection);
	}
	
	@Test
	public void getDirectionWestNegative() {
		Direction newDirection = Direction.getDirection(-90);
		Assert.assertEquals(Direction.WEST, newDirection);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getDirectionInvalid() {
		Direction.getDirection(133);		
	}
}
