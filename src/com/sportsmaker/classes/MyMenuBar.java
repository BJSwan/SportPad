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
	
	private JMenu file, edit, position, equipment, simulate, option, help;
	
	public MyMenuBar() {
		
		//Adding File Menu
		file = new FileButton();
		this.add(file);
		
		//Adding Edit Menu
		edit = new EditButton();
		this.add(edit);
		
		//Adding Position Menu
		position = new PositionsButton();
		this.add(position);
		
		//Adding Equipment Menu
		equipment = new EquipmentButton();
		this.add(equipment);
		
		//Adding Simulation Menu
		simulate = new SimButton();
		this.add(simulate);
		
		//Adding Options Menu
		option = new OptionsButton();
		this.add(option);
		
		//Adding Help Menu
		help = new HelpButton();
		this.add(help);
	}
}
