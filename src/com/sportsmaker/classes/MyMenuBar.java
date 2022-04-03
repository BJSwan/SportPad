package com.sportsmaker.classes;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MyMenuBar extends JMenuBar{
	
	private JMenu file, edit, field, position, equipment, simulate, option, help;
	
	public MyMenuBar() {
		
		//Adding File Menu
		file = new FileButton();
		this.add(file);
		
		//Adding Edit Menu
		edit = new EditButton();
		this.add(edit);
		
		//Adding Field Menu
		field = new FieldButton();
		this.add(field);
		
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
