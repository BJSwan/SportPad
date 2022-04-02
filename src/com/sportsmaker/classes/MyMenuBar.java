package com.sportsmaker.classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MyMenuBar extends JMenuBar{
	
	private JMenu file, edit, option;
	private JMenuItem button1, button2, button3, button4;
	
	public MyMenuBar() {
		
		//Adding File Menu
		file = new JMenu("File");
		button1 = new JMenuItem("New File");
		button1.addActionListener(new newListener());
		button2 = new JMenuItem("Save");
		button1.addActionListener(new saveListener());
		button3 = new JMenuItem("Save As");
		button4 = new JMenuItem("Exit");
		file.add(button1);
		file.add(button2);
		file.add(button3);
		file.add(button4);
		this.add(file);
		
		//Adding Edit Menu
		edit = new JMenu("Edit");
		button1 = new JMenuItem("Cut");
		button2 = new JMenuItem("Copy");
		button3 = new JMenuItem("Paste");
		edit.add(button1);
		edit.add(button2);
		edit.add(button3);
		this.add(edit);
		
		//Adding Options Menu
		option = new JMenu("Options");
		button1 = new JMenuItem("Light Mode");
		button1.addActionListener(new lightModeListener());
		option.add(button1);
		this.add(option);
	}
	
	private class newListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JFrame frame = new JFrame("New Sport Creator");
			frame.setPreferredSize(new Dimension(500, 500));
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JPanel panel = new MyPanel();
			frame.getContentPane().add(panel);
			
			frame.pack();
			frame.setVisible(true);
		}
	}
	
	private class saveListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
		}
	}
	
	private class lightModeListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
		}
	}
}
