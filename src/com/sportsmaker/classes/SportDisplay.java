package com.sportsmaker.classes;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.Border;

public class SportDisplay extends JPanel{
	
	private SpringLayout layout;
	private JLabel fileNameLabel;
	Border br = BorderFactory.createLineBorder(Color.black, 3);
	private float h, w;
	
	public SportDisplay(String sportFile){
		//TODO: Fix this later so the panel can change size as the user changes the window size
		//JFrame parentFrame = (JFrame)SwingUtilities.getWindowAncestor(this);
		//Rectangle r = parentFrame.getBounds();
		//h = r.height;
		//w = r.width;
		this.setLayout(layout);
		this.setBounds(300,0,685,740);
		this.setBackground(Color.lightGray);
		
		fileNameLabel = new JLabel(sportFile);
		this.add(fileNameLabel);
		
		this.setBorder(br);
	}
}