package com.sportsmaker.classes;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class OptionsButton extends JMenu{
	
	private JMenuItem button1, button2, button3, button4, button5, button6;

	public OptionsButton() {
		this.setText("Options");
		button1 = new JMenuItem("Light Mode");
		button1.addActionListener(new lightModeListener());
		this.add(button1);
	}
	
	private class lightModeListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			//TODO: Fix this!
			//OptionsButton.this.setBackground(Color.lightGray);
		}
	}
}
