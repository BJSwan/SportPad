package com.sportsmaker.classes;

import java.awt.Dimension;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FolderChooseFrame extends JFrame{
	
	private JFileChooser folderChoose;
	private JPanel panel;
	private JFrame newFolderFrame;
	
	public FolderChooseFrame(){
		newFolderFrame = new JFrame("Choose Folder");
		newFolderFrame.setPreferredSize(new Dimension(550, 400));
		panel = new MyPanel();
		
		folderChoose = new JFileChooser();
		folderChoose.setCurrentDirectory(folderChoose.getFileSystemView().getDefaultDirectory());
		panel.add(folderChoose);
		
		newFolderFrame.getContentPane().add(panel);
		newFolderFrame.pack();
		newFolderFrame.setVisible(true);
	}
}
