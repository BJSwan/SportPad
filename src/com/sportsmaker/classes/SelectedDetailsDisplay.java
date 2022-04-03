package com.sportsmaker.classes;

import java.awt.Color;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.Border;

public class SelectedDetailsDisplay extends JPanel{
	private SpringLayout layout;
	Border br = BorderFactory.createLineBorder(Color.black);
	
	public SelectedDetailsDisplay(File sportFile) {
		this.setLayout(layout);
		this.setBounds(20,20,20,20);
		this.setBackground(Color.darkGray);
		this.setBorder(br);
	}
}
