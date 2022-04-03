package com.sportsmaker.classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerNumberModel;

public class NewSportWindow extends JFrame{
	
	private JTextField sportName, fileName;
	private JLabel sportNameLabel, folderChooseLabel, chosenFolderLabel, fileNameLabel, positionNumLabel, startingFieldLabel;
	private JSpinner positionNum;
	private JComboBox fieldTypeCB;
	private JButton folderChooseButton, createButton, cancelButton;
	private JPanel panel;
	private JFrame newSportFrame, folderChooseFrame;
	private String folderPath;
	
	//Temporary. should be replaced with a list of fields saved in files. maybe
	private String fieldTypes[] = {"Soccer", "Baseball", "Basketball", "Hockey", "Football"};
	
	public NewSportWindow(){
		newSportFrame = new JFrame("New Sport");
		newSportFrame.setPreferredSize(new Dimension(500, 500));
		panel = new MyPanel();
		
		GroupLayout layout = new GroupLayout(panel);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		panel.setLayout(layout);
		
		sportName = new JTextField(10);
		fileName = new JTextField(10);
		positionNum = new JSpinner(new SpinnerNumberModel(5, 1, 25, 1));
		sportNameLabel = new JLabel("Name of Sport");
		folderChooseLabel = new JLabel("Choose A Folder To Save Your Sport Within");
		chosenFolderLabel = new JLabel("No Folder Chosen");
		fileNameLabel = new JLabel("File Name");
		positionNumLabel = new JLabel("Number of Positions per Team");
		startingFieldLabel = new JLabel("Initial Field Layout");
		sportNameLabel.setForeground(Color.white);
		folderChooseLabel.setForeground(Color.white);
		chosenFolderLabel.setForeground(Color.white);
		fileNameLabel.setForeground(Color.white);
		positionNumLabel.setForeground(Color.white);
		startingFieldLabel.setForeground(Color.white);
		
		fieldTypeCB = new JComboBox(fieldTypes);
		
		createButton = new JButton("Create");
		createButton.addActionListener(new createListener());
		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new cancelListener());
		folderChooseButton = new JButton("Choose Folder");
		folderChooseButton.addActionListener(new folderChooseListener());
		
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(sportNameLabel)
			    .addComponent(sportName)
			    .addComponent(folderChooseLabel)
			    .addComponent(folderChooseButton)
			    .addComponent(chosenFolderLabel)
			    .addComponent(fileNameLabel)
			    .addComponent(fileName)
			    .addComponent(positionNumLabel)
		    	.addGroup(layout.createSequentialGroup()
		    			.addComponent(positionNum)
		    			.addPreferredGap(ComponentPlacement.UNRELATED, 300, 300))
		    	.addComponent(startingFieldLabel)
		    	.addComponent(fieldTypeCB))
				.addPreferredGap(ComponentPlacement.UNRELATED, 100, 100)
				.addComponent(createButton)
				.addComponent(cancelButton)
				.addPreferredGap(ComponentPlacement.UNRELATED, 100, 100)
		);
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addComponent(sportNameLabel)
			    .addComponent(sportName)
			    .addPreferredGap(ComponentPlacement.UNRELATED, 25, 25)
			    .addComponent(folderChooseLabel)
			    .addComponent(folderChooseButton)
			    .addComponent(chosenFolderLabel)
			    .addPreferredGap(ComponentPlacement.UNRELATED, 25, 25)
			    .addComponent(fileNameLabel)
			    .addComponent(fileName)
			    .addPreferredGap(ComponentPlacement.UNRELATED, 25, 25)
			    .addComponent(positionNumLabel)
			    .addComponent(positionNum)
			    .addPreferredGap(ComponentPlacement.UNRELATED, 25, 25)
			    .addComponent(startingFieldLabel)
			    .addComponent(fieldTypeCB)
			    .addPreferredGap(ComponentPlacement.UNRELATED, 350, 350)
			    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			    		.addComponent(createButton)
			    		.addComponent(cancelButton))
		);
		
		newSportFrame.getContentPane().add(panel);
		newSportFrame.pack();
		newSportFrame.setVisible(true);
	}
	
	private class createListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
			
		}
	}
	
	private class cancelListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			newSportFrame.dispose();
		}
	}
	
	private class folderChooseListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			folderChooseFrame = new FolderChooseFrame();
			folderPath = ((FolderChooseFrame) folderChooseFrame).getSelectedFile().getAbsolutePath();
			String folderPathShort = folderPath;
			if(folderPathShort.length() > 45) {
				String tempPath = folderPathShort.substring(0, 45) + "...";
				folderPathShort = tempPath;
			}
			chosenFolderLabel.setText(folderPathShort);
		}
	}
}
