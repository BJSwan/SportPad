package com.sportsmaker.classes;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class NewSportWindow extends JFrame{
	
	private JTextField sportName, fileName;
	private JLabel sportNameLabel, fileNameLabel;
	
	public NewSportWindow(){
		JFrame newSportFrame = new JFrame("New Sport");
		newSportFrame.setPreferredSize(new Dimension(500, 500));
		JPanel panel = new MyPanel();
		
		GroupLayout layout = new GroupLayout(panel);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		panel.setLayout(layout);
		
		sportName = new JTextField(10);
		fileName = new JTextField(10);
		sportNameLabel = new JLabel("Name of Sport:");
		fileNameLabel = new JLabel("File Name:");
		sportNameLabel.setForeground(Color.white);
		fileNameLabel.setForeground(Color.white);
		
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(sportNameLabel)
			    .addComponent(sportName)
			    .addComponent(fileNameLabel)
			    .addComponent(fileName))
				.addPreferredGap(ComponentPlacement.UNRELATED, 300, 300)
		);
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addComponent(sportNameLabel)
			    .addComponent(sportName)
			    .addPreferredGap(ComponentPlacement.UNRELATED, 25, 25)
			    .addComponent(fileNameLabel)
			    .addComponent(fileName)
			    .addPreferredGap(ComponentPlacement.UNRELATED, 375, 375)
		);
		
		newSportFrame.getContentPane().add(panel);
		newSportFrame.pack();
		newSportFrame.setVisible(true);
	}
}
