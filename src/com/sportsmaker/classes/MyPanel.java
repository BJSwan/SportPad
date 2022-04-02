package com.sportsmaker.classes;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class MyPanel extends JPanel{
	
	private SpringLayout layout;
	
	public MyPanel() {
		this.setBackground(Color.darkGray);
	}
	
	public void lightMode() {
		this.setBackground(Color.lightGray);
	}
	
}
