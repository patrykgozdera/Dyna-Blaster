package defaultpackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class Player extends Obiekt{

	private double dx, dy;
	public Player(Plansza plansza, double x,double y, int width, int height)
	{
		super(plansza,x,y);
		this.width=width;
		this.height=height;
		//dx=0;
		//dy=0;
		
	}
	
	public void draw(Graphics g)
	{
		this.move();
		Dimension sizeOfGameField=plansza.getSize();
		g.setColor(Color.ORANGE);
		g.fillOval((int)(getNormalizedX()*sizeOfGameField.getWidth()),(int)(getNormalizedY()*sizeOfGameField.getHeight()), width, height);
	}
	
	private void move()
	{
		this.setNormalizedX(this.getNormalizedX()+dx);
		this.setNormalizedY(this.getNormalizedY()+dy);
	}
	
	public void setPosition(double x, double y)
	{
		this.setNormalizedX(x);
		this.setNormalizedX(y);
	}
	
	public void setDX(double value)
	{
		dx=value;
	}
	
	public void setDY(double value)
	{
		dy=value;
	}
	
}
