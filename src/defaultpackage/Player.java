package defaultpackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class Player extends Obiekt{

	
	public Player(Plansza plansza, double x,double y, int width, int height)
	{
		super(plansza,x,y);
		this.width=width;
		this.height=height;
		
	}
	
	public void draw(Graphics g)
	{
		Dimension sizeOfGameField=plansza.getSize();
		g.setColor(Color.ORANGE);
		g.fillOval((int)(normalizedX*sizeOfGameField.getWidth()),(int)(normalizedY*sizeOfGameField.getHeight()), width, height);
	}
	
	
	public void paint(Graphics g)
	{
		Dimension sizeOfGameField=plansza.getSize();
		g.setColor(Color.ORANGE);
		g.fillOval((int)(normalizedX*sizeOfGameField.getWidth()),(int)(normalizedY*sizeOfGameField.getHeight()), width, height);
	}
	
}
