package com.sportsmaker.classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FileButton extends JMenu{
	
	private JMenuItem button1, button2, button3, button4, button5, button6;
	private JFrame newSportFrame;
	
	public FileButton() {
		this.setText("File");
		button1 = new JMenuItem("New File");
		button1.addActionListener(new newListener());
		button2 = new JMenuItem("Save");
		button1.addActionListener(new saveListener());
		button3 = new JMenuItem("Save As");
		button4 = new JMenuItem("Open");
		button6 = new JMenuItem("Exit");
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button6);
	}
	
	private class newListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			newSportFrame = new NewSportWindow();
		}
	}
	
	private class saveListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
		}
	}
	
}
