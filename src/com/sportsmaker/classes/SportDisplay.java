package com.sportsmaker.classes;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class SportDisplay extends JPanel{
	
	private GroupLayout layout;
	private JLabel fileNameLabel;
	private Field field;
	private Graphics g;
	Border br = BorderFactory.createLineBorder(Color.black, 3);
	private float h, w;
	
	public SportDisplay(String sportFile){
		//TODO: Fix this later so the panel can change size as the user changes the window size
		//JFrame parentFrame = (JFrame)SwingUtilities.getWindowAncestor(this);
		//Rectangle r = parentFrame.getBounds();
		//h = r.height;
		//w = r.width;
		layout = new GroupLayout(this);
		this.setLayout(layout);
		this.setBounds(300,0,685,740);
		this.setBackground(Color.lightGray);
		this.setBorder(br);
		this.setLayout(layout);
		
		fileNameLabel = new JLabel("No File Loaded");
		this.add(fileNameLabel);
		field = new Field("", false, false, false, 0, 0, new Terrain(TerrainID.Pavement));
		
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addComponent(fileNameLabel)
		);
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addComponent(fileNameLabel)
		);
		this.revalidate();
		this.repaint();
	}
	
	public void sportLoadUp(String sportFile, String labelName){
		fileNameLabel.setText(labelName);
		System.out.print(sportFile);
		this.add(fileNameLabel);
		
	    try {
	        File fieldFile = new File(sportFile + "\\Field\\fieldinfo.smkrfield");
	        Scanner myReader = new Scanner(fieldFile);
	        field.setName(myReader.nextLine());
	        System.out.println(field.getName());
	        String outdoorsBool = myReader.nextLine();
	        if(outdoorsBool.equals("true")){
	        	field.setOutdoors(true);
	        }
	        else if (outdoorsBool.equals("false")){
	        	field.setOutdoors(true);
	        }
	        String indoorsBool = myReader.nextLine();
	        if(indoorsBool.equals("true")){
	        	field.setIndoors(true);
	        }
	        else if (indoorsBool.equals("false")){
	        	field.setIndoors(true);
	        }
	        String aquaBool = myReader.nextLine();
	        if(aquaBool.equals("true")){
	        	field.setAquatic(true);
	        }
	        else if (aquaBool.equals("false")){
	        	field.setAquatic(true);
	        }
	        field.setHeight(Integer.valueOf(myReader.nextLine()));
	        field.setWidth(Integer.valueOf(myReader.nextLine()));
	        field.setTerrain(new Terrain(TerrainID.valueOf(myReader.nextLine())));
	        System.out.println(field.getName());
	        System.out.println(field.isOutdoors());
	        System.out.println(field.isIndoors());
	        System.out.println(field.isAquatic());
	        System.out.println(field.getHeight());
	        System.out.println(field.getWidth());
	        System.out.println(field.getTerrain().getName());
	        System.out.println(field.getTerrain().isSkateable());
	        System.out.println(field.getTerrain().getSmoothness());
	        System.out.println(field.getTerrain().getBounce());
	        System.out.println(field.getTerrain().getGive());
	        System.out.println(field.getTerrain().getSlip());
	        System.out.println(field.getTerrain().getID());
	        myReader.close();
		}catch (FileNotFoundException e) {
		  System.out.println("An error occurred.");
		  e.printStackTrace();
		}
		
		this.repaint();
	}
	
	
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        field.render(g);
    }
	
//    public void addField() {
//        shapes.add(new Circle(random.nextInt(maxX), random.nextInt(maxY)));
//        repaint();
//    }
}
