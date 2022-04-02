package com.sportsmaker.classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class SimButton extends JMenu{
	
	private JMenuItem button1, button2, button3, button4, button5, button6;

	public SimButton() {
		this.setText("Simulate");
		button1 = new JMenuItem("New League");
		button1.addActionListener(new newLeagueListener());
		button2 = new JMenuItem("Load league");
		button1.addActionListener(new loadLeagueListener());
		button3 = new JMenuItem("Exhibition Game");
		button1.addActionListener(new exhibitionListener());
		this.add(button1);
		this.add(button2);
		this.add(button3);
	}
	
	private class newLeagueListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
		}
	}
	private class loadLeagueListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
		}
	}
	private class exhibitionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
		}
	}
}
