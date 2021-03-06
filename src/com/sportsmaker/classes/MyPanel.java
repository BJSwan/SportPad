package com.sportsmaker.classes;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.Border;

public class MyPanel extends JPanel{
	
	private SpringLayout layout;
	Border br = BorderFactory.createLineBorder(Color.black);
	
	public MyPanel() {
		this.setLayout(layout);
		this.setBounds(20,20,20,20);
		this.setBackground(Color.darkGray);
		this.setBorder(br);
	}
	
	public void lightMode() {
		this.setBackground(Color.lightGray);
	}
	
}
