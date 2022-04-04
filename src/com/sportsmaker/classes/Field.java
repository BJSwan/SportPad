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
}
