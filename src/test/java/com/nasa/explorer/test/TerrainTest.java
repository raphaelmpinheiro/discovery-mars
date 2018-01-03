package com.nasa.explorer.test;

import org.junit.Assert;
import org.junit.Test;

import com.nasa.explorer.domain.Terrain;

public class TerrainTest {
	
	@Test
	public void testInsertPositionInvalid() {
		Terrain terrain = new Terrain(1,1);
	    boolean positionIsValid = terrain.positionIsValid(10, 10);	    
	    Assert.assertEquals(false, positionIsValid);	    
	}
	
	@Test
	public void testPositionValid() {
		Terrain terrain = new Terrain(2,2);
	    boolean positionIsValid = terrain.positionIsValid(1, 1);	    
	    Assert.assertEquals(true, positionIsValid);	    
	}
}
