package com.nasa.explorer.domain;

public class Mars {

	private Terrain terrain;

	public Mars() {
		terrain = new Terrain(5, 5);
	}

	public Terrain getTerrain() {
		return terrain;
	}
}
