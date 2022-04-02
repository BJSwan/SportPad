package com.sportsmaker.classes;

import java.awt.Color;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	
	public MyPanel() {
		this.setBackground(Color.darkGray);
	}
	
	public void lightMode() {
		this.setBackground(Color.lightGray);
	}
	
}
