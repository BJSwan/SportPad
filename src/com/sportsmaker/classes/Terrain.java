package com.sportsmaker.classes;

import java.awt.Color;

public class Terrain {

	private String name;
	private boolean skateable;
	//Basketball court is very smooth, football field is much less smooth
	//Basketball court has a lot of bounce, hockey rink has little bounce
	//Football pitch has a lot of give, hockey rink has no give
	//Hockey rink has a lot of slip, rubber floor would have no slip
	private double smoothness, bounce, give, slip;
	private Color surfaceColor;
	
	public Terrain(String n, boolean sk, double sm, double b, double g, double sl, Color sC) {
		name = n;
		skateable = sk;
		smoothness = sm;
		bounce = b;
		give = g;
		slip = sl;
		surfaceColor = sC;
	}

	public Color getSurfaceColor() {
		return surfaceColor;
	}
}
