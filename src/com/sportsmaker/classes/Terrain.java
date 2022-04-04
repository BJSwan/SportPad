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
	private TerrainID ID;
	
	//Unique
	public Terrain(String n, boolean sk, double sm, double b, double g, double sl, Color sC) {
		name = n;
		skateable = sk;
		smoothness = sm;
		bounce = b;
		give = g;
		slip = sl;
		surfaceColor = sC;
	}

	//Specific Terrain Constructor
	public Terrain(TerrainID id) {
		if(id == TerrainID.GrassField) {
			name = "Grass Field";
			skateable = false;
			smoothness = 1.0;
			bounce = 1.0;
			give = 5.0;
			slip = 4.0;
			surfaceColor = new Color(0, 142, 0);
		}
		else if(id == TerrainID.MudField) {
			name = "Mud Field";
			skateable = false;
			smoothness = 1.0;
			bounce = 0.2;
			give = 10.0;
			slip = 9.0;
			surfaceColor = new Color(94, 64, 7);
		}
		else if(id == TerrainID.Pavement) {
			name = "Pavement";
			skateable = false;
			smoothness = 4.0;
			bounce = 2.0;
			give = 0.1;
			slip = 0.5;
			surfaceColor = new Color(100, 100, 100);
		}
	}
	
	public Color getSurfaceColor() {
		return surfaceColor;
	}
}
