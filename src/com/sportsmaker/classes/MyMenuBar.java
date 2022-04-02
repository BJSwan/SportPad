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
	
	private JMenu file, edit, position, equipment, simulate, option;
	private JMenuItem button1, button2, button3, button4, button5, button6;
	
	public MyMenuBar() {
		
		//Adding File Menu
		file = new JMenu("File");
		button1 = new JMenuItem("New File");
		button1.addActionListener(new newListener());
		button2 = new JMenuItem("Save");
		button1.addActionListener(new saveListener());
		button3 = new JMenuItem("Save As");
		button4 = new JMenuItem("Open");
		button6 = new JMenuItem("Exit");
		file.add(button1);
		file.add(button2);
		file.add(button3);
		file.add(button4);
		file.add(button6);
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
		
		//Adding Position Menu
		position = new JMenu("Positions");
		button1 = new JMenuItem("New Positon");
		button2 = new JMenuItem("Edit Position");
		position.add(button1);
		position.add(button2);
		this.add(position);
		
		//Adding Equipment Menu
		equipment = new JMenu("Equipment");
		button1 = new JMenuItem("New Equipment");
		button2 = new JMenuItem("Edit Equipment");
		equipment.add(button1);
		equipment.add(button2);
		this.add(equipment);
		
		//Adding Edit Menu
		simulate = new JMenu("Simulate");
		button1 = new JMenuItem("New League");
		button2 = new JMenuItem("Load league");
		button3 = new JMenuItem("Ehibition Game");
		simulate.add(button1);
		simulate.add(button2);
		simulate.add(button3);
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
			JFrame frame = new JFrame("New Sport");
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
