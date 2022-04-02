package com.sportsmaker.classes;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class SimButton extends JMenu{
	
	private JMenuItem button1, button2, button3, button4, button5, button6;

	public SimButton() {
		this.setText("Simulate");
		button1 = new JMenuItem("New League");
		button2 = new JMenuItem("Load league");
		button3 = new JMenuItem("Ehibition Game");
		this.add(button1);
		this.add(button2);
		this.add(button3);
	}
}
