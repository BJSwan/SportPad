package com.sportsmaker.classes;

import java.awt.Color;
import java.awt.Graphics;

public class Field {
	
	private String name;
	private boolean outdoors, indoors, aquatic;
	//TODO: Add shapes that aren't rectangles!!!!
	private int height, width;
	private Terrain terrain;
	
	public Field(String n, Boolean out, Boolean ind, Boolean aqu, int h, int w, Terrain ter){
		name = n;
		outdoors = out;
		indoors = ind;
		aquatic = aqu;
		terrain = ter;
		height = h;
		width = w;
	}
	
	public void render(Graphics g) {
		g.setColor(terrain.getSurfaceColor());
		g.fillRect(250, 200, height, width);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOutdoors() {
		return outdoors;
	}

	public void setOutdoors(boolean outdoors) {
		this.outdoors = outdoors;
	}

	public boolean isIndoors() {
		return indoors;
	}

	public void setIndoors(boolean indoors) {
		this.indoors = indoors;
	}

	public boolean isAquatic() {
		return aquatic;
	}

	public void setAquatic(boolean aquatic) {
		this.aquatic = aquatic;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Terrain getTerrain() {
		return terrain;
	}

	public void setTerrain(Terrain terrain) {
		this.terrain = terrain;
	}
	
}
