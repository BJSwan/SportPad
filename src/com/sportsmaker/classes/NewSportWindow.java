package com.sportsmaker.classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerNumberModel;

public class NewSportWindow extends JFrame{
	
	private JTextField sportName, fileName;
	private JLabel newSportTitle, canBeChangedLabel, sportNameLabel, folderChooseLabel, chosenFolderLabel, fileNameLabel, positionNumLabel, startingFieldLabel;
	private JSpinner positionNum;
	private JComboBox fieldTypeCB;
	private JButton folderChooseButton, createButton, cancelButton;
	private JPanel panel;
	private JFrame newSportFrame, folderChooseFrame;
	private String newSportName, newFileName, fieldType, folderPath;
	private int newPositionNum;
	
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
		newSportTitle = new JLabel("New Sport");
		newSportTitle.setFont(new Font("Calibri", Font.PLAIN, 20));
		canBeChangedLabel = new JLabel("These details can be changed later");
		canBeChangedLabel.setFont(new Font("Calibri", Font.PLAIN, 10));
		sportNameLabel = new JLabel("Name of Sport");
		folderChooseLabel = new JLabel("Choose A Folder To Save Your Sport Within");
		chosenFolderLabel = new JLabel("No Folder Chosen");
		fileNameLabel = new JLabel("File Name");
		positionNumLabel = new JLabel("Number of Positions per Team");
		startingFieldLabel = new JLabel("Initial Field Layout");
		newSportTitle.setForeground(Color.white);
		canBeChangedLabel.setForeground(Color.white);
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
				.addComponent(newSportTitle)
				.addComponent(canBeChangedLabel)
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
				.addComponent(newSportTitle)
				.addComponent(canBeChangedLabel)
			    .addPreferredGap(ComponentPlacement.UNRELATED, 10, 10)
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
		
		newSportFrame.setResizable(false);
		newSportFrame.getContentPane().add(panel);
		newSportFrame.pack();
		newSportFrame.setVisible(true);
	}
	
	private class createListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			newSportName = sportName.getText();
			newFileName = fileName.getText();
			newPositionNum = (int)positionNum.getValue();
			fieldType = (String)fieldTypeCB.getSelectedItem();
			
			if(folderPath == null) {
				JOptionPane.showMessageDialog(null, "No Folder Selected");
			}
			else {
				try {
					  new File(folderPath + newFileName + ".smkr").mkdir();
				      File newSportFile = new File(folderPath + newFileName + ".smkr\\" + "sportinfo.smkrinfo");
				      if (newSportFile.createNewFile()) {
				    	  System.out.println("File created: " + newSportFile.getName());
				      }
				      else {
				    	  System.out.println("File already exists.");
				      }
			    }catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
				try {
				      FileWriter myWriter = new FileWriter(folderPath + newFileName + ".smkr\\" + "sportinfo.smkrinfo");
				      myWriter.write(newSportName);
				      myWriter.write("\n");
				      myWriter.write(Integer.toString(newPositionNum));
				      myWriter.write("\n");
				      myWriter.write(fieldType);
				      myWriter.close();
				      System.out.println("Successfully wrote to the file.");
			    }catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			}
			newSportFrame.dispose();
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
			folderPath = folderPath + "\\";
			String folderPathShort = folderPath;
			if(folderPathShort.length() > 45) {
				String tempPath = folderPathShort.substring(0, 45) + "...";
				folderPathShort = tempPath;
			}
			System.out.print(folderPath);
			chosenFolderLabel.setText(folderPathShort);
		}
	}
}
