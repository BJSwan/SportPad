package com.sportsmaker.classes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class SportDisplay extends JPanel{
	
	private GroupLayout layout;
	private JLabel fileNameLabel;
	Border br = BorderFactory.createLineBorder(Color.black, 3);
	private float h, w;
	
	public SportDisplay(String sportFile){
		//TODO: Fix this later so the panel can change size as the user changes the window size
		//JFrame parentFrame = (JFrame)SwingUtilities.getWindowAncestor(this);
		//Rectangle r = parentFrame.getBounds();
		//h = r.height;
		//w = r.width;
		layout = new GroupLayout(this);
		this.setLayout(layout);
		this.setBounds(300,0,685,740);
		this.setBackground(Color.lightGray);
		this.setBorder(br);
		this.setLayout(layout);
		fileNameLabel = new JLabel("No File Loaded");
		this.add(fileNameLabel);
		
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addComponent(fileNameLabel)
		);
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addComponent(fileNameLabel)
		);
		this.revalidate();
		this.repaint();
	}
	
	public void sportLoadUp(String sportFile, String labelName){
		fileNameLabel.setText(labelName);
		System.out.print(sportFile);
		this.add(fileNameLabel);
		this.repaint();
	}
}
