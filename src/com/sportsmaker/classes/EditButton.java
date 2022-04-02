package com.sportsmaker.classes;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class EditButton extends JMenu{
	
	private JMenuItem button1, button2, button3, button4, button5, button6;
	
	public EditButton() {
		this.setText("Edit");
		button1 = new JMenuItem("Cut");
		button2 = new JMenuItem("Copy");
		button3 = new JMenuItem("Paste");
		this.add(button1);
		this.add(button2);
		this.add(button3);
	}
}
