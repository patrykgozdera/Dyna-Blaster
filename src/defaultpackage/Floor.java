package defaultpackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Floor extends Obiekt {

	private Color color;
	public static int Xwidth=1;
	public static int Yheight=1;
	public Floor(Plansza plansza, double x, double y, Color color) 
	{
		super(plansza,x,y);
		this.color=color;

	
		
	}
	
	public  static void setDimension(int xwidth, int xheight)
	{ 
		Xwidth=xwidth;
		Yheight=xheight;
	}
	
	public void Paint(Graphics g)
	{
		Dimension sizeOfGameField=plansza.getSize();
		g.setColor(color);
		g.fillRect((int)(getNormalizedX()*sizeOfGameField.getWidth()),(int)(getNormalizedY()*sizeOfGameField.getHeight()), Xwidth-1,Yheight-1);
		
	}
	
	
}
