package com.sportsmaker.classes;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FolderChooseFrame extends JFrame{
	
	private JFileChooser folderChoose;
	private File selectedFile;
	
	public FolderChooseFrame(){
		folderChoose = new JFileChooser();
		folderChoose.setCurrentDirectory(folderChoose.getFileSystemView().getDefaultDirectory());
		folderChoose.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		
		int result = folderChoose.showOpenDialog(this);
		if (result == JFileChooser.APPROVE_OPTION) {
		    selectedFile = folderChoose.getSelectedFile();
		}
	}
	
	public File getSelectedFile() {
		return selectedFile;
	}
}
