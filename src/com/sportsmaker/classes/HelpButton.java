package com.sportsmaker.classes;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class HelpButton extends JMenu{

	private JMenuItem button1, button2, button3, button4, button5, button6;

	public HelpButton() {
		this.setText("Help");
		button1 = new JMenuItem("Documentation");
		this.add(button1);
	}
}
