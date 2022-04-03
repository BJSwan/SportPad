package com.sportsmaker.classes;

import java.awt.Dimension;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class Makem {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Sport Maker");
		frame.setPreferredSize(new Dimension(1000, 800));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        File loadedFile = null;
        
		JPanel panel = new MyPanel();
		SelectedDetailsDisplay sdd = new SelectedDetailsDisplay(loadedFile);
		SportDisplay sportDisplay = new SportDisplay(loadedFile);
		JMenuBar menuBar = new MyMenuBar();
		
		ImageIcon img = new ImageIcon("res/sportsmakericon.png");
		
		frame.setJMenuBar(menuBar);
		
		frame.getContentPane().add(sportDisplay);
		frame.getContentPane().add(panel);
		
		frame.setIconImage(img.getImage());
		
		frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);
	}
}
