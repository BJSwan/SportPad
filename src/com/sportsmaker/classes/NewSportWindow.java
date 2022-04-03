package com.sportsmaker.classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerNumberModel;

public class NewSportWindow extends JFrame{
	
	private JTextField sportName, fileName;
	private JLabel sportNameLabel, fileNameLabel, positionNumLabel;
	private JSpinner positionNum;
	
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
		positionNum = new JSpinner(new SpinnerNumberModel(5, 1, 25, 1));
		sportNameLabel = new JLabel("Name of Sport");
		fileNameLabel = new JLabel("File Name");
		positionNumLabel = new JLabel ("Number of Positions per Team (this can be changed later)");
		sportNameLabel.setForeground(Color.white);
		fileNameLabel.setForeground(Color.white);
		positionNumLabel.setForeground(Color.white);
		
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(sportNameLabel)
			    .addComponent(sportName)
			    .addComponent(fileNameLabel)
			    .addComponent(fileName)
			    .addComponent(positionNumLabel)
		    	.addGroup(layout.createSequentialGroup()
		    			.addComponent(positionNum)
		    			.addPreferredGap(ComponentPlacement.UNRELATED, 300, 300)))
				.addPreferredGap(ComponentPlacement.UNRELATED, 300, 300)
		);
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addComponent(sportNameLabel)
			    .addComponent(sportName)
			    .addPreferredGap(ComponentPlacement.UNRELATED, 25, 25)
			    .addComponent(fileNameLabel)
			    .addComponent(fileName)
			    .addPreferredGap(ComponentPlacement.UNRELATED, 25, 25)
			    .addComponent(positionNumLabel)
			    .addComponent(positionNum)
			    .addPreferredGap(ComponentPlacement.UNRELATED, 350, 350)
		);
		
		newSportFrame.getContentPane().add(panel);
		newSportFrame.pack();
		newSportFrame.setVisible(true);
	}
}
