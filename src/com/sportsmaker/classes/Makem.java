package com.sportsmaker.classes;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class Makem {

	public static void main(String[] args) {
		JFrame frame = new JFrame("SportPad 2000");
		frame.setPreferredSize(new Dimension(1000, 800));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new MyPanel();
		JMenuBar menuBar = new MyMenuBar();
		
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);  		
	}

}
