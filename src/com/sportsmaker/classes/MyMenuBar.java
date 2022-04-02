package com.sportsmaker.classes;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenuBar extends JMenuBar{
	
	private JMenu file, edit;
	private JMenuItem button1, button2, button3;
	
	public MyMenuBar() {
		
		//Adding File Menu
		file = new JMenu("File");
		button1 = new JMenuItem("New");
		button2 = new JMenuItem("Save");
		button3 = new JMenuItem("Exit");
		file.add(button1);
		file.add(button2);
		file.add(button3);
		this.add(file);
		
		//Adding Edit Menu
		file = new JMenu("Edit");
		button1 = new JMenuItem("New");
		button2 = new JMenuItem("Save");
		button3 = new JMenuItem("Exit");
		file.add(button1);
		file.add(button2);
		file.add(button3);
		this.add(file);
	}
	
}
