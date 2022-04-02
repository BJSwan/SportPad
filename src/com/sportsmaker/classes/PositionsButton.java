package com.sportsmaker.classes;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class PositionsButton extends JMenu{

	private JMenuItem button1, button2, button3, button4, button5, button6;
	
	public PositionsButton() {
		this.setText("Positons");
		button1 = new JMenuItem("New Positon");
		button2 = new JMenuItem("Edit Position");
		this.add(button1);
		this.add(button2);
	}
}
