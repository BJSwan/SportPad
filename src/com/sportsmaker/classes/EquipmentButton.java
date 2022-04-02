package com.sportsmaker.classes;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class EquipmentButton extends JMenu{
	
	private JMenuItem button1, button2, button3, button4, button5, button6;

	public EquipmentButton() {
		this.setText("Equipment");
		button1 = new JMenuItem("New Equipment");
		button2 = new JMenuItem("Edit Equipment");
		button3 = new JMenuItem("Save Equipment");
		button4 = new JMenuItem("Load Equipment");
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
	}
}
