package com.sportsmaker.classes;

import java.awt.Dimension;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	
	private String loadedFile;
	
	public MainFrame(){
		JFrame frame = new JFrame("Sport Maker");
		frame.setPreferredSize(new Dimension(1000, 800));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    loadedFile = null;
	    
		JPanel panel = new MyPanel();
		SelectedDetailsDisplay sdd = new SelectedDetailsDisplay(loadedFile);
		SportDisplay sportDisplay = new SportDisplay(loadedFile);
		JMenuBar menuBar = new MyMenuBar(this);
		
		ImageIcon img = new ImageIcon("res/sportsmakericon.png");
		
		frame.setJMenuBar(menuBar);
		
		frame.getContentPane().add(sportDisplay);
		frame.getContentPane().add(panel);
		
		frame.setIconImage(img.getImage());
		
		frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void setLoadedFile(String file) {
		loadedFile = file;
	}
}
