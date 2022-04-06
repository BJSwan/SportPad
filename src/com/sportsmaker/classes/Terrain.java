package com.sportsmaker.classes;

import java.awt.Color;

public class Terrain {

	private String name;
	private boolean skateable;
	//Basketball court is very smooth, football field is much less smooth
	//Basketball court has a lot of bounce, mudfield has little bounce
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
			ID = id;
		}
		else if(id == TerrainID.MudField) {
			name = "Mud Field";
			skateable = false;
			smoothness = 1.0;
			bounce = 0.2;
			give = 10.0;
			slip = 9.0;
			surfaceColor = new Color(94, 64, 7);
			ID = id;
		}
		else if(id == TerrainID.Pavement) {
			name = "Pavement";
			skateable = false;
			smoothness = 4.0;
			bounce = 2.0;
			give = 0.1;
			slip = 0.5;
			surfaceColor = new Color(100, 100, 100);
			ID = id;
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSkateable() {
		return skateable;
	}

	public void setSkateable(boolean skateable) {
		this.skateable = skateable;
	}

	public double getSmoothness() {
		return smoothness;
	}

	public void setSmoothness(double smoothness) {
		this.smoothness = smoothness;
	}

	public double getBounce() {
		return bounce;
	}

	public void setBounce(double bounce) {
		this.bounce = bounce;
	}

	public double getGive() {
		return give;
	}

	public void setGive(double give) {
		this.give = give;
	}

	public double getSlip() {
		return slip;
	}

	public void setSlip(double slip) {
		this.slip = slip;
	}

	public TerrainID getID() {
		return ID;
	}

	public void setID(TerrainID iD) {
		ID = iD;
	}

	public Color getSurfaceColor() {
		return surfaceColor;
	}
	
	public void setSurfaceColor(Color surfaceColor) {
		this.surfaceColor = surfaceColor;
	}
	
}
