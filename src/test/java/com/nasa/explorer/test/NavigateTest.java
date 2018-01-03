package com.nasa.explorer.test;

import org.junit.Test;

import com.nasa.explorer.domain.Direction;
import com.nasa.explorer.domain.Mars;
import com.nasa.explorer.domain.Robot;
import com.nasa.explorer.domain.Terrain;

import org.junit.Assert;

public class NavigateTest {

	@Test
	public void navigateInTerrainTest() {
		Mars mars = new Mars();
		Terrain terrain = mars.getTerrain();

		Robot c3p0 = new Robot(terrain);
		c3p0.move();
		c3p0.rotateRight();
		c3p0.move();
		c3p0.rotateLeft();
		c3p0.move();

		Assert.assertEquals(1, c3p0.getPosition().getX());
		Assert.assertEquals(2, c3p0.getPosition().getY());
		Assert.assertEquals(Direction.NORTH, c3p0.getPosition().getDirection());

	}
}
