package com.sportsmaker.classes;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FieldButton extends JMenu{

	private JMenuItem button1, button2, button3, button4, button5, button6;

	
	public FieldButton() {
		this.setText("Field");
		button1 = new JMenuItem("Edit Field");
		button2 = new JMenuItem("Add Field Element");
		button3 = new JMenuItem("Save Field");
		button4 = new JMenuItem("Load Field");
		this.add(button1);
		this.add(button2);
		this.add(button3);
	}
}
